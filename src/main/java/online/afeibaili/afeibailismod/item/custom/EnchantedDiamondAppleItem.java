package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

//附魔钻石苹果
public class EnchantedDiamondAppleItem extends Item {
    public EnchantedDiamondAppleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {

            tooltip.add(Text.literal("吃下后获得抗性提升Ⅲ、抗火、伤害吸收Ⅴ、概率获得速度、概率获得夜视").formatted(Formatting.AQUA));

        } else {
            tooltip.add(Text.literal("按下Shift查看更多信息").formatted(Formatting.BLUE));
        }


        super.appendTooltip(stack, world, tooltip, context);
    }
}
