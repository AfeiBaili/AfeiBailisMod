package online.afeibaili.afeibailismod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.block.ModBlocks;
import online.afeibaili.afeibailismod.item.ModItems;
import online.afeibaili.afeibailismod.util.ModTags;

import java.util.function.Consumer;

//Data配方数据生成
public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.RUBY, RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RUBY_BLOCK);
        offerPlanksRecipe(exporter, ModBlocks.CERULEAN_PLANKS, ModTags.Items.CERULEAN_WOODS, 4);
        offerPlanksRecipe(exporter, ModBlocks.WITHERED_PLANKS, ModTags.Items.WITHERED_WOODS, 4);

        offer2x2CompactingRecipe(exporter,RecipeCategory.DECORATIONS,Blocks.CRAFTING_TABLE,ModBlocks.CERULEAN_PLANKS);
        offerBarkBlockRecipe(exporter,ModBlocks.CERULEAN_WOOD,ModBlocks.CERULEAN_LOG);
        offerBarkBlockRecipe(exporter,ModBlocks.STRIPPED_CERULEAN_WOOD,ModBlocks.STRIPPED_CERULEAN_LOG);
        offerBarkBlockRecipe(exporter,ModBlocks.WITHERED_WOOD,ModBlocks.WITHERED_LOG);
        offerBarkBlockRecipe(exporter,ModBlocks.STRIPPED_WITHERED_WOOD,ModBlocks.STRIPPED_WITHERED_LOG);
        offerSingleOutputShapelessRecipe(exporter,Items.STICK,ModItems.CERULEAN_STICK,"不明白这个是干什么的");
        //工具
        ModRecipeClass.ModSword(exporter,ModItems.RUBY_SWORD,ModItems.RUBY,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModShove(exporter,ModItems.RUBY_SHOVEL,ModItems.RUBY,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModPickaxe(exporter,ModItems.RUBY_PICKAXE,ModItems.RUBY,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModAxe(exporter,ModItems.RUBY_AXE,ModItems.RUBY,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModHoe(exporter,ModItems.RUBY_HOE,ModItems.RUBY,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModSword(exporter,ModItems.SAPPHIRE_SWORD,ModItems.SAPPHIRE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModShove(exporter,ModItems.SAPPHIRE_SHOVEL,ModItems.SAPPHIRE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModPickaxe(exporter,ModItems.SAPPHIRE_PICKAXE,ModItems.SAPPHIRE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModAxe(exporter,ModItems.SAPPHIRE_AXE,ModItems.SAPPHIRE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModHoe(exporter,ModItems.SAPPHIRE_HOE,ModItems.SAPPHIRE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModSword(exporter,ModItems.VIOLET_GEMSTONE_SWORD,ModItems.VIOLET_GEMSTONE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModShove(exporter,ModItems.VIOLET_GEMSTONE_SHOVEL,ModItems.VIOLET_GEMSTONE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModPickaxe(exporter,ModItems.VIOLET_GEMSTONE_PICKAXE,ModItems.VIOLET_GEMSTONE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModAxe(exporter,ModItems.VIOLET_GEMSTONE_AXE,ModItems.VIOLET_GEMSTONE,ModItems.CERULEAN_STICK);
        ModRecipeClass.ModHoe(exporter,ModItems.VIOLET_GEMSTONE_HOE,ModItems.VIOLET_GEMSTONE,ModItems.CERULEAN_STICK);
        //木棍
        ModRecipeClass.ModStick(exporter,Items.STICK,ModBlocks.WITHERED_PLANKS);
        ModRecipeClass.ModStick(exporter,ModItems.CERULEAN_STICK,ModBlocks.CERULEAN_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMOND_APPLE)
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .input('A', Items.DIAMOND)
                .input('S', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DIAMOND_APPLE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENCHANTED_DIAMOND_APPLE)
                .pattern("AAA")
                .pattern("ASA")
                .pattern("AAA")
                .input('A', Items.DIAMOND_BLOCK)
                .input('S', Items.APPLE)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(Items.DIAMOND_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Items.APPLE),
                        FabricRecipeProvider.conditionsFromItem(Items.APPLE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ENCHANTED_DIAMOND_APPLE)));
    }
}
