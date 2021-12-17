package me.arctic.fallenout;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

//TODO: redo texture.
public class stimpack {
public static final FoodComponent STIMPACK_FOODCOMP = (new FoodComponent.Builder()).hunger(20).saturationModifier(1.4F).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 10), 0.8F).snack().alwaysEdible().build();
public static final Item STIMPACK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(STIMPACK_FOODCOMP));
}
