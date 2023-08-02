package online.afeibaili.afeibailismod.util;


import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import online.afeibaili.afeibailismod.AfeiBailisMod;


public class ModTags {
    public static class Items {
        public static final TagKey<Item> CERULEAN_WOODS = createTag("cerulean_woods");

        public static final TagKey<Item> WITHERED_WOODS = createTag("withered_woods");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AfeiBailisMod.MOD_ID, name));
        }
    }
}
