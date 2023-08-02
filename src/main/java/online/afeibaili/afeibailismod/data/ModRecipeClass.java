package online.afeibaili.afeibailismod.data;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.block.ModBlocks;
import online.afeibaili.afeibailismod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeClass extends ShapedRecipeJsonBuilder {


    public ModRecipeClass(RecipeCategory recipeCategory, ItemConvertible output, int count) {
        super(recipeCategory, output, count);
    }

    public static void ModSword(Consumer<RecipeJsonProvider> exporter, Item output,
                                Item material, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', material)
                .input('S', stick)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .criterion(FabricRecipeProvider.hasItem(stick),
                        FabricRecipeProvider.conditionsFromItem(stick))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
    public static void ModShove(Consumer<RecipeJsonProvider> exporter, Item output,
                                Item material, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', material)
                .input('S', stick)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .criterion(FabricRecipeProvider.hasItem(stick),
                        FabricRecipeProvider.conditionsFromItem(stick))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
    public static void ModPickaxe(Consumer<RecipeJsonProvider> exporter, Item output,
                                Item material, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', material)
                .input('S', stick)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .criterion(FabricRecipeProvider.hasItem(stick),
                        FabricRecipeProvider.conditionsFromItem(stick))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
    public static void ModAxe(Consumer<RecipeJsonProvider> exporter, Item output,
                                Item material, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .input('A', material)
                .input('S', stick)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .criterion(FabricRecipeProvider.hasItem(stick),
                        FabricRecipeProvider.conditionsFromItem(stick))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
    public static void ModHoe(Consumer<RecipeJsonProvider> exporter, Item output,
                                Item material, Item stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .input('A', material)
                .input('S', stick)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .criterion(FabricRecipeProvider.hasItem(stick),
                        FabricRecipeProvider.conditionsFromItem(stick))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
    public static void ModStick(Consumer<RecipeJsonProvider> exporter,Item output,Block material){
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,output,4)
                .pattern("A")
                .pattern("A")
                .input('A', material)
                .criterion(FabricRecipeProvider.hasItem(material),
                        FabricRecipeProvider.conditionsFromItem(material))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}
