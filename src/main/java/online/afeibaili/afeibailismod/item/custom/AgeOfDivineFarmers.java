package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AgeOfDivineFarmers extends SwordItem {

    public AgeOfDivineFarmers(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {

            tooltip.add(Text.literal("昔在远古之时，神农尝百草，偶遇一草，神异非常，能生长于火山、寒冰、沙漠之中，其草毒性十分凶猛。").formatted(Formatting.AQUA));

        } else {
            tooltip.add(Text.literal("按下Shift查看更多信息").formatted(Formatting.YELLOW));
        }
    }
}
