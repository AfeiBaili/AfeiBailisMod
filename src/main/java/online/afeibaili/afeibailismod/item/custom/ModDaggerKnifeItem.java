package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModDaggerKnifeItem extends SwordItem {
    private static final String FENGLI = "FengLi";

    public ModDaggerKnifeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);


    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.isUndead() && target.isDead()){
            int fengLi = getFengLi(stack);
            fengLi++;
            setFengLi(stack, fengLi);
        }
        addSharpnessEnchantment(stack);

        return super.postHit(stack, target, attacker);
    }

    private void addSharpnessEnchantment(ItemStack stack) {
        NbtCompound tag = stack.getOrCreateNbt();
        int kills = tag.getInt(FENGLI);
        int enchantmentLevel = 0;
        int killsNeededForEnchantment = 100;
        if (kills >= killsNeededForEnchantment) {
            // 达到杀怪数量要求，添加锋利附魔
            enchantmentLevel = Math.min(kills / killsNeededForEnchantment, 10);
        }
        if (enchantmentLevel >= 1){
            Map<Enchantment, Integer> enchantments = new HashMap<>();
            enchantments.put(Enchantments.SHARPNESS, enchantmentLevel);
            EnchantmentHelper.set(enchantments, stack);
        }
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        NbtCompound tag = stack.getOrCreateNbt();
        int jiSha = tag.getInt(FENGLI);
        tooltip.add(Text.literal("完美锋利！"+"已击杀"+jiSha+"个亡灵").formatted(Formatting.YELLOW));
    }
    private int getFengLi (ItemStack stack){
        NbtCompound tag = stack.getOrCreateNbt();
        return tag.getInt(FENGLI);
    }
    private void setFengLi(ItemStack stack, int fengLi) {
        NbtCompound tag = stack.getOrCreateNbt();
        tag.putInt(FENGLI, fengLi);
    }
}
