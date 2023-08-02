package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class InfernoDragonItem extends AxeItem {

    public InfernoDragonItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {

            tooltip.add(Text.literal("言章乱山之神烛龙有兵，名烛龙黯灭，匿日月之际，唯传烛鬼神者求之。").formatted(Formatting.AQUA));

        } else {
            tooltip.add(Text.literal("按下Shift查看更多信息").formatted(Formatting.YELLOW));
        }
    }
}
