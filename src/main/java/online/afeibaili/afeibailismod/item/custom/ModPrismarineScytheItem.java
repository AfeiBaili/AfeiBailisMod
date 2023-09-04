package online.afeibaili.afeibailismod.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ModPrismarineScytheItem extends SwordItem {
    public ModPrismarineScytheItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
    // 构造函数等省略

    // 右键使用时的方法
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            StatusEffectInstance effectInstance = new StatusEffectInstance(StatusEffects.SPEED, 900, 2);
            StatusEffectInstance effectInstance2 = new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 900, 2);
            StatusEffectInstance effectInstance3 = new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 1200, 0);
            player.addStatusEffect(effectInstance);
            player.addStatusEffect(effectInstance2);
            player.addStatusEffect(effectInstance3);
            world.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 0.4F, 2.0F);
        }
        player.getItemCooldownManager().set(this,2400);

        return TypedActionResult.consume(player.getStackInHand(hand));
    }
}
