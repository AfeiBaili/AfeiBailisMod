package online.afeibaili.afeibailismod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.AfeiBailisMod;
import online.afeibaili.afeibailismod.block.ModBlocks;

//物品组
public class ModItemGroup {
    public static ItemGroup AFEIBAILISMOD_TOOLS;
    public static ItemGroup AFEIBAILISMOD_COMBAT;
    public static ItemGroup AFEIBAILISMOD_ITEMS;
    public static ItemGroup AFEIBAILISMOD_BLOCK;

    public static void registerItemGroups() {
        AFEIBAILISMOD_ITEMS = FabricItemGroup.builder(new Identifier(AfeiBailisMod.MOD_ID, "afeibailismod_item"))
                .displayName(Text.translatable("itemgroup.afeibailismod.items"))
                .icon(() -> new ItemStack(ModItems.ENCHANTED_DIAMOND_APPLE)).build();
        AFEIBAILISMOD_BLOCK = FabricItemGroup.builder(new Identifier(AfeiBailisMod.MOD_ID, "afeibailismod_block"))
                .displayName(Text.translatable("itemgroup.afeibailismod.block"))
                .icon(() -> new ItemStack(ModBlocks.CERULEAN_WOOD)).build();
        AFEIBAILISMOD_COMBAT = FabricItemGroup.builder(new Identifier(AfeiBailisMod.MOD_ID, "afeibailismod_combat"))
                .displayName(Text.translatable("itemgroup.afeibailismod.combat"))
                .icon(() -> new ItemStack(ModItems.RUBY_SWORD)).build();
        AFEIBAILISMOD_TOOLS = FabricItemGroup.builder(new Identifier(AfeiBailisMod.MOD_ID, "afeibailismod_tools"))
                .displayName(Text.translatable("itemgroup.afeibailismod.tools"))
                .icon(() -> new ItemStack(ModItems.RUBY_PICKAXE)).build();


    }
}
