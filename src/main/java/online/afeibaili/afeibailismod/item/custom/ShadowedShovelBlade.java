package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ShadowedShovelBlade extends ShovelItem {
    public ShadowedShovelBlade(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {

            tooltip.add(Text.literal("昔之古土，有一神器，名曰暗影铲刃。相传自神灵所铸，能于夜幕之下施展惊人之力。然而多年之前，此物已被埋藏于神秘之所。").formatted(Formatting.AQUA));

        } else {
            tooltip.add(Text.literal("按下Shift查看更多信息").formatted(Formatting.YELLOW));
        }
    }
}
