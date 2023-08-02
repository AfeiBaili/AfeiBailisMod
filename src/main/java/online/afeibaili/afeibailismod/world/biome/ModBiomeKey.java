package online.afeibaili.afeibailismod.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomeKey {
    public static final RegistryKey<Biome> PINK_BIOME = ModBiomeKey.register("pink_biome");
    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(name));
    }
}
