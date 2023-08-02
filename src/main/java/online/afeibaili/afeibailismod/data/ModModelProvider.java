package online.afeibaili.afeibailismod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import online.afeibaili.afeibailismod.block.ModBlocks;
import online.afeibaili.afeibailismod.item.ModItems;

//方块数据生成
public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //玄蓝木
        blockStateModelGenerator.registerLog(ModBlocks.CERULEAN_LOG).log(ModBlocks.CERULEAN_LOG).wood(ModBlocks.CERULEAN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CERULEAN_LOG).log(ModBlocks.STRIPPED_CERULEAN_LOG).wood(ModBlocks.STRIPPED_CERULEAN_WOOD);

        blockStateModelGenerator.registerLog(ModBlocks.WITHERED_LOG).log(ModBlocks.WITHERED_LOG).wood(ModBlocks.WITHERED_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WITHERED_LOG).log(ModBlocks.STRIPPED_WITHERED_LOG).wood(ModBlocks.STRIPPED_WITHERED_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WITHERED_PLANKS);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CERULEAN_PLANKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CERULEAN_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CERULEAN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUBY_ORE);




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DIAMOND_APPLE,Models.GENERATED);
        itemModelGenerator.register(ModItems.ENCHANTED_DIAMOND_APPLE,Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SMELLY_CAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CERULEAN_STICK,Models.HANDHELD);
        itemModelGenerator.register(ModItems.OCEAN_DREAM ,Models.HANDHELD);
        itemModelGenerator.register(ModItems.INFERNO_DRAGON,Models.HANDHELD);
        itemModelGenerator.register(ModItems.AGE_OF_DIVINE_FARMERS,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHADOWED_SHOVEL_BLADE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.QINGYUN_SHARP_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE_HOE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.VIOLET_GEMSTONE_PICKAXE,Models.HANDHELD);


    }
}
