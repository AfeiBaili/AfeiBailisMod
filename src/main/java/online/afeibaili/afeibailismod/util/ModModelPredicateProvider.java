package online.afeibaili.afeibailismod.util;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.item.ModItems;

public class ModModelPredicateProvider {
    public static void registerModModels() {
        registerBow(ModItems.ICE_FIRE_BOW);
    }

    private static void registerBow(Item bow) {
        FabricModelPredicateProviderRegistry.register(bow, new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0f;
                    }
                    if (entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;

                });
        FabricModelPredicateProviderRegistry.register(bow,new Identifier("pulling"),
                ((stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                && entity.getActiveItem()==stack ? 1.0f : 0.0f));
    }
}
