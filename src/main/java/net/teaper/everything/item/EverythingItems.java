package net.teaper.everything.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PotionItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.everything.Everything;

public class EverythingItems {

    public static final Item WAFFLE = registerItem("waffle",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(EverythingFoodComponents.WAFFLE)));
    public static final Item SUGAR_BREAD = registerItem("sugar_bread",
            new Item (new FabricItemSettings().group(ItemGroup.FOOD).food(EverythingFoodComponents.SUGAR_BREAD)));
    public static final Item SLOP_JUICE = registerItem("slop_juice",
            new EverythingSlop(new FabricItemSettings().group(ItemGroup.BREWING).food(EverythingFoodComponents.SLOP_JUICE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Everything.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Everything.LOGGER.debug("Registering Mod Items for " + Everything.MOD_ID);

    }
}
