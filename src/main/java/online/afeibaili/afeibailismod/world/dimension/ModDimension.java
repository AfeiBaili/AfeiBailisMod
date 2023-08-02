package online.afeibaili.afeibailismod.world.dimension;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import online.afeibaili.afeibailismod.AfeiBailisMod;

//维度配置
public class ModDimension {
    //永夜
    public static final RegistryKey<World> ETERNAL_NIGHT_KEY = RegistryKey.of(RegistryKeys.WORLD, new Identifier(AfeiBailisMod.MOD_ID, "eternal_night"));
    public static final RegistryKey<DimensionType> ETERNAL_NIGHT_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier(AfeiBailisMod.MOD_ID, "eternal_night_type"));

    //极寒
    public static final RegistryKey<World> EXTREME_COLD_KEY = RegistryKey.of(RegistryKeys.WORLD, new Identifier(AfeiBailisMod.MOD_ID, "frosty_chessboard"));
    public static final RegistryKey<DimensionType> EXTREME_COLD_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, new Identifier(AfeiBailisMod.MOD_ID, "frosty_chessboard_type"));
}