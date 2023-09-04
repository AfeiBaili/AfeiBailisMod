package online.afeibaili.afeibailismod.world.gen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import online.afeibaili.afeibailismod.AfeiBailisMod;
import online.afeibaili.afeibailismod.block.ModBlocks;

import java.util.List;


//世界配置
public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CERULEAN_KEY = registryKey("cerulean_placed");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registryKey("sapphire_ore_key");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registryKey("ruby_ore_key");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneRecplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateRecplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneRecplacables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateRecplacables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        //树的注册
        register(context, CERULEAN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CERULEAN_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.CERULEAN_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                new TwoLayersFeatureSize(1, 2, 2)).build());

        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 4));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 4));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {

        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AfeiBailisMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
