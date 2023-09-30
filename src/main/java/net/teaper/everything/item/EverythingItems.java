package net.teaper.everything.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.everything.Everything;

public class EverythingItems {

    public static final Item WAFFLE = registerItem("waffle",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(EverythingFoodComponents.WAFFLE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Everything.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Everything.LOGGER.debug("Registering Mod Items for " + Everything.MOD_ID);

    }
}
