package online.afeibaili.afeibailismod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    SAPPHIRE(MiningLevels.DIAMOND, 4137, 8.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    RUBY(MiningLevels.DIAMOND, 4137, 8.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    VIOLET_GEMSTONE(MiningLevels.DIAMOND, 4137, 8.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    LEGENDARY(MiningLevels.NETHERITE, 975709430, 8.0f, 4.0f, 520, () -> Ingredient.ofItems(Items.NETHER_STAR));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}