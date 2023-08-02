package online.afeibaili.afeibailismod.world.dimension;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.block.ModBlocks;

//传送门配置
public class ModPortals {
    public static void registerPortals() {
        //不眠之夜
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.DEEPSLATE_BRICKS)
                .lightWithItem(Items.NETHER_STAR)
                .destDimID(new Identifier("afeibailismod:eternal_night"))
                .tintColor(50, 50, 50)
                .registerPortal();
        //霜冻棋盘
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.CERULEAN_WOOD)
                .lightWithItem(Items.NETHER_STAR)
                .destDimID(new Identifier("afeibailismod:extreme_cold"))
                .tintColor(150,190,240)
                .registerPortal();
    }
}
