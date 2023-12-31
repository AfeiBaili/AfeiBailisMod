package online.afeibaili.afeibailismod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import online.afeibaili.afeibailismod.AfeiBailisMod;
import online.afeibaili.afeibailismod.item.custom.*;

//物品注册
public class ModItems {

    public static final Item DIAMOND_APPLE = registerItems("diamond_apple",
            new Item(new FabricItemSettings().rarity(Rarity.RARE).food(new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3600, 2), 1.0f).alwaysEdible().build())));
    public static final Item ENCHANTED_DIAMOND_APPLE = registerItems("enchanted_diamond_apple",
            new EnchantedDiamondAppleItem(new FabricItemSettings().rarity(Rarity.EPIC).food((new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4800, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 3600, 0), 0.7f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 9600, 4), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 0), 0.1f).alwaysEdible().build()))));
    public static final Item SAPPHIRE = registerItems("sapphire",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_DUST  = registerItems("sapphire_dust",
            new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItems("ruby",
            new Item(new FabricItemSettings()));
    public static final Item RUBY_DUST = registerItems("ruby_dust",
            new Item(new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE = registerItems("violet_gemstone",
            new Item(new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE_DUST = registerItems("violet_gemstone_dust",
            new Item(new FabricItemSettings()));
    public static final Item CERULEAN_STICK = registerItems("cerulean_stick",
            new Item(new FabricItemSettings()));
    public static final Item SMELLY_CAT = registerItems("smelly_cat",
            new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).food(new FoodComponent.Builder().hunger(1).saturationModifier(114514f).alwaysEdible().build())));
    //神器
    public static final Item OCEAN_DREAM = registerItems("ocean_dream",
            new OceanDream(ModToolMaterials.LEGENDARY, 2, 0f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item INFERNO_DRAGON = registerItems("inferno_dragon",
            new InfernoDragonItem(ModToolMaterials.LEGENDARY, 7, -3f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item AGE_OF_DIVINE_FARMERS = registerItems("age_of_divine_farmers",
            new AgeOfDivineFarmers(ModToolMaterials.LEGENDARY, 5, -2.4f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item SHADOWED_SHOVEL_BLADE = registerItems("shadowed_shovel_blade",
            new ShadowedShovelBlade(ModToolMaterials.LEGENDARY, 6, -2.8f, new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item QINGYUN_SHARP_PICKAXE = registerItems("qingyun_sharp_pickaxe",
            new QingyunSharpPickaxe(ModToolMaterials.LEGENDARY, 4, -2f, new FabricItemSettings().rarity(Rarity.EPIC)));
    //红宝石
    public static final Item RUBY_SWORD = registerItems("ruby_sword",
            new ModRubySwordItem(ModToolMaterials.RUBY, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItems("ruby_axe",
            new ModRubyAxeItem(ModToolMaterials.RUBY, 5, -3f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItems("ruby_shovel",
            new ModRubyShovelItem(ModToolMaterials.RUBY, 1.5f, -3f, new FabricItemSettings()));
    public static final Item RUBY_PICKAXE = registerItems("ruby_pickaxe",
            new ModRubyPickaxeItem(ModToolMaterials.RUBY, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItems("ruby_hoe",
            new ModRubyHoeItem(ModToolMaterials.RUBY, -3, 0f, new FabricItemSettings()));
    //蓝宝石

    public static final Item SAPPHIRE_SWORD = registerItems("sapphire_sword",
            new ModSapphireSwordItem(ModToolMaterials.SAPPHIRE, 3, -2.4f, new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItems("sapphire_axe",
            new ModSapphireAxeItem(ModToolMaterials.SAPPHIRE, 5, -3f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItems("sapphire_shovel",
            new ModSapphireShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3f, new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItems("sapphire_pickaxe",
            new ModSapphirePickaxeItem(ModToolMaterials.SAPPHIRE, 1, -2.8f, new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItems("sapphire_hoe",
            new ModSapphireHoeItem(ModToolMaterials.SAPPHIRE, -3, 0f, new FabricItemSettings()));

    //紫宝石

    public static final Item VIOLET_GEMSTONE_SWORD = registerItems("violet_gemstone_sword",
            new ModVioletGemstoneSwordItem(ModToolMaterials.VIOLET_GEMSTONE,3,-2.4f,new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE_AXE = registerItems("violet_gemstone_axe",
            new ModVioletGemstoneAxeItem(ModToolMaterials.VIOLET_GEMSTONE,5,-3f,new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE_SHOVEL = registerItems("violet_gemstone_shovel",
            new ModVioletGemstoneShovelItem(ModToolMaterials.VIOLET_GEMSTONE,1.5f,-3f,new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE_PICKAXE = registerItems("violet_gemstone_pickaxe",
            new ModVioletGemstonePickaxeItem(ModToolMaterials.VIOLET_GEMSTONE,1,-2.8f,new FabricItemSettings()));
    public static final Item VIOLET_GEMSTONE_HOE = registerItems("violet_gemstone_hoe",
            new ModVioletGemstoneHoeItem(ModToolMaterials.VIOLET_GEMSTONE,-3,0f,new FabricItemSettings()));
    //嗜血之刃
    public static final Item BLOODTHIRSTY_BLADE = registerItems("bloodthirsty_blade",
            new ModBloodthirstyBladeItem(ModToolMaterials.LEGENDARY,10,-3.3f,new FabricItemSettings().rarity(Rarity.EPIC)));
    //刀
    public static final Item DAGGER_KNIFE = registerItems("dagger_knife",
            new ModDaggerKnifeItem(ModToolMaterials.LEGENDARY,3,-2.4f,new FabricItemSettings().rarity(Rarity.EPIC)));
    //弓箭
    public static final Item ICE_FIRE_BOW = registerItems("ice_fire_bow",
            new ModIceFireBowItem(new FabricItemSettings().rarity(Rarity.EPIC).maxDamage(975709430)));
    //海景石镰刀
    public static final Item PRISMARINE_SCYTHE = registerItems("prismarine_scythe",
            new ModPrismarineScytheItem(ModToolMaterials.LEGENDARY,6,-3f,new FabricItemSettings().rarity(Rarity.EPIC)));

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, DIAMOND_APPLE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, ENCHANTED_DIAMOND_APPLE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, SAPPHIRE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, SAPPHIRE_DUST);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, RUBY);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, RUBY_DUST);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, VIOLET_GEMSTONE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, VIOLET_GEMSTONE_DUST);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_ITEMS, CERULEAN_STICK);

        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, BLOODTHIRSTY_BLADE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, DAGGER_KNIFE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, ICE_FIRE_BOW);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, PRISMARINE_SCYTHE);

        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, VIOLET_GEMSTONE_SWORD);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, VIOLET_GEMSTONE_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, VIOLET_GEMSTONE_SHOVEL);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, VIOLET_GEMSTONE_PICKAXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, VIOLET_GEMSTONE_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, VIOLET_GEMSTONE_HOE);

        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, RUBY_SWORD);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, RUBY_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, RUBY_SHOVEL);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, RUBY_PICKAXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, RUBY_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, RUBY_HOE);

        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, SAPPHIRE_SWORD);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, SAPPHIRE_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, SAPPHIRE_SHOVEL);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, SAPPHIRE_PICKAXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, SAPPHIRE_AXE);
        addToItemGroup(ModItemGroup.AFEIBAILISMOD_TOOLS, SAPPHIRE_HOE);

//        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, OCEAN_DREAM);
//        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, INFERNO_DRAGON);
//        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, AGE_OF_DIVINE_FARMERS);
//        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, SHADOWED_SHOVEL_BLADE);
//        addToItemGroup(ModItemGroup.AFEIBAILISMOD_COMBAT, QINGYUN_SHARP_PICKAXE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AfeiBailisMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AfeiBailisMod.LOGGER.info("Registering Mod Item for" + AfeiBailisMod.MOD_ID);
        addItemsToItemGroup();
    }

}