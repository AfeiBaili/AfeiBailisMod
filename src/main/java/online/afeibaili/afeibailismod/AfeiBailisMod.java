package online.afeibaili.afeibailismod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import online.afeibaili.afeibailismod.block.ModBlocks;
import online.afeibaili.afeibailismod.block.ModFlammableBlockRegistry;
import online.afeibaili.afeibailismod.item.ModItemGroup;
import online.afeibaili.afeibailismod.item.ModItems;
import online.afeibaili.afeibailismod.world.dimension.ModPortals;
import online.afeibaili.afeibailismod.world.gen.ModWorldGeneration;

import java.util.logging.Logger;

//总入口
public class AfeiBailisMod implements ModInitializer {
    public static final String MOD_ID = "afeibailismod";
    public static final Logger LOGGER = Logger.getLogger("AfeiBailisMod");


    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();//物品组
        ModItems.registerModItems();//物品
        ModBlocks.registerModBlocks();//方块
        ModWorldGeneration.generateModWorldGen();//树
        ModPortals.registerPortals();//传送门
        ModFlammableBlockRegistry.registerFlammableBlocks();//易燃物
        //可剥离的
        StrippableBlockRegistry.register(ModBlocks.CERULEAN_LOG, ModBlocks.STRIPPED_CERULEAN_LOG);
        StrippableBlockRegistry.register(ModBlocks.CERULEAN_WOOD, ModBlocks.STRIPPED_CERULEAN_WOOD);

        StrippableBlockRegistry.register(ModBlocks.WITHERED_LOG,ModBlocks.STRIPPED_WITHERED_LOG);
        StrippableBlockRegistry.register(ModBlocks.WITHERED_WOOD,ModBlocks.STRIPPED_WITHERED_WOOD);

        
    }
}
