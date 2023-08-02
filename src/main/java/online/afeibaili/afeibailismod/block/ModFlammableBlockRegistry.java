package online.afeibaili.afeibailismod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

//易燃物设置
public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.CERULEAN_LOG, 2, 2);
        registry.add(ModBlocks.CERULEAN_WOOD, 2, 2);
        registry.add(ModBlocks.STRIPPED_CERULEAN_LOG, 2, 2);
        registry.add(ModBlocks.STRIPPED_CERULEAN_WOOD, 2, 2);

        registry.add(ModBlocks.CERULEAN_LEAVES, 15, 30);
        registry.add(ModBlocks.CERULEAN_PLANKS, 2, 10);
    }
}
