package online.afeibaili.afeibailismod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import online.afeibaili.afeibailismod.AfeiBailisMod;
import online.afeibaili.afeibailismod.item.ModItemGroup;
import online.afeibaili.afeibailismod.world.tree.CeruleanSaplingGenerator;

//方块注册
public class ModBlocks {

    //方块：蓝木
    //原木蓝木
    public static final Block CERULEAN_LOG = registerBlock("cerulean_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(6.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //蓝木
    public static final Block CERULEAN_WOOD = registerBlock("cerulean_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(6.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //剥皮的原木蓝木
    public static final Block STRIPPED_CERULEAN_LOG = registerBlock("stripped_cerulean_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(6.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //剥皮的蓝木
    public static final Block STRIPPED_CERULEAN_WOOD = registerBlock("stripped_cerulean_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(6.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //蓝木木板
    public static final Block CERULEAN_PLANKS = registerBlock("cerulean_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(2.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //蓝木树叶
    public static final Block CERULEAN_LEAVES = registerBlock("cerulean_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.1f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //蓝木树苗
    public static final Block CERULEAN_SAPLING = registerBlock("cerulean_sapling",
            new SaplingBlock(new CeruleanSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    //枯萎的木头
    public static final Block WITHERED_LOG = registerBlock("withered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(2.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block WITHERED_WOOD = registerBlock("withered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(2.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block STRIPPED_WITHERED_LOG = registerBlock("stripped_withered_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(2.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block STRIPPED_WITHERED_WOOD = registerBlock("stripped_withered_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block WITHERED_PLANKS = registerBlock("withered_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)), ModItemGroup.AFEIBAILISMOD_BLOCK);


    //霜蓝宝石
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.AFEIBAILISMOD_BLOCK);

    //炙红宝石
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ModItemGroup.AFEIBAILISMOD_BLOCK);
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(10, 100)), ModItemGroup.AFEIBAILISMOD_BLOCK);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(AfeiBailisMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(AfeiBailisMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        AfeiBailisMod.LOGGER.info("Registering ModBlocks for" + AfeiBailisMod.MOD_ID);

    }
}