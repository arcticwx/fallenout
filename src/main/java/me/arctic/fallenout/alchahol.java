package me.arctic.fallenout;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class alchahol {
    /*Beer item*/
    public static final FoodComponent BEER_FOODCOMP = (new FoodComponent.Builder()).hunger(-2).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 2000, 4), 1F).build();
    public static final Item BEER = new Item(new Item.Settings().group(ItemGroup.FOOD).food(BEER_FOODCOMP));
    /*End of beer item*/

    /*Wine item*/
    public static final FoodComponent WINE_FOODCOMP = (new FoodComponent.Builder()).hunger(-2).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000, 2), 1F).build();
    public static final Item WINE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(WINE_FOODCOMP));
    /*End of wine item*/

    /*Vodka item*/
    public static final FoodComponent VODKA_FOODCOMP = (new FoodComponent.Builder()).hunger(-2).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10000, 9), 1F).build();
    public static final Item VODKA = new Item(new Item.Settings().group(ItemGroup.FOOD).food(VODKA_FOODCOMP));
    /*End of vodka item*/
}
