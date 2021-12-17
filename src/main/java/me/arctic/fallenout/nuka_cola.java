package me.arctic.fallenout;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class nuka_cola {
    public static final FoodComponent NUKA_COLA_FOODCOMP = (new FoodComponent.Builder()).hunger(20).saturationModifier(1.4F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 2), 1F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,300, 3), 1F).snack().alwaysEdible().build();
    public static final Item NUKA_COLA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(NUKA_COLA_FOODCOMP));
}
