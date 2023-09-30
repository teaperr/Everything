package net.teaper.everything;

import net.fabricmc.api.ModInitializer;
import net.teaper.everything.item.EverythingFoodComponents;
import net.teaper.everything.item.EverythingItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Everything implements ModInitializer {
    public static final String MOD_ID = "everything";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        EverythingItems.registerModItems();

    }
}
