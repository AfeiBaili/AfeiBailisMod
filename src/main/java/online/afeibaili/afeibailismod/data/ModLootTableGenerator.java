package online.afeibaili.afeibailismod.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import online.afeibaili.afeibailismod.block.ModBlocks;
import online.afeibaili.afeibailismod.item.ModItems;

//战利品数据生成
public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.STRIPPED_CERULEAN_WOOD);
        addDrop(ModBlocks.STRIPPED_CERULEAN_LOG);
        addDrop(ModBlocks.CERULEAN_LOG);
        addDrop(ModBlocks.CERULEAN_WOOD);
        addDrop(ModBlocks.CERULEAN_SAPLING);
        addDrop(ModBlocks.CERULEAN_PLANKS);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.WITHERED_LOG);
        addDrop(ModBlocks.WITHERED_WOOD);
        addDrop(ModBlocks.STRIPPED_WITHERED_LOG);
        addDrop(ModBlocks.STRIPPED_WITHERED_WOOD);
        addDrop(ModBlocks.WITHERED_PLANKS);


        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
    }
}
