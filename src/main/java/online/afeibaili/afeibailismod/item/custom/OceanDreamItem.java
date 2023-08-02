package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OceanDreamItem extends HoeItem {
    public OceanDreamItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {

            tooltip.add(Text.literal("海与天同色，海若有此坐，海力尽弱，其神兵乃出世，海若之梦，海若盛世弱，则其神兵出会生，海若之梦制之，当以海与天同色。").formatted(Formatting.AQUA));

        } else {
            tooltip.add(Text.literal("按下Shift查看更多信息").formatted(Formatting.YELLOW));
        }
    }
}
