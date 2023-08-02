package online.afeibaili.afeibailismod.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import online.afeibaili.afeibailismod.world.gen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

//树苗生长
public class CeruleanSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.CERULEAN_KEY;
    }
}
