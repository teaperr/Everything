package net.teaper.everything.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.everything.Everything;

public class EverythingFoodComponents {
    public static final FoodComponent WAFFLE = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 100, 1), 0.5f).build();
    public static final FoodComponent SLOP_JUICE = new FoodComponent.Builder().hunger(0).saturationModifier(0).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 180, 0), 1.0f).build();
    public static final FoodComponent SUGAR_BREAD = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1.0f).alwaysEdible().snack().build();
}
