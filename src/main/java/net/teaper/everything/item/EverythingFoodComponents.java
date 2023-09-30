package net.teaper.everything.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.everything.Everything;

public class EverythingFoodComponents {
    public static final FoodComponent WAFFLE = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
}
