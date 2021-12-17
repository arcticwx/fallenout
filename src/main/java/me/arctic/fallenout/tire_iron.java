package me.arctic.fallenout;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

//TODO: Add texture to tire_iron.
public class tire_iron extends SwordItem {
    public tire_iron(tire_iron_material toolMaterial) {
        super(toolMaterial, -1, -2F, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
