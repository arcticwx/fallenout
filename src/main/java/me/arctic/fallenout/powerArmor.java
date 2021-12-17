package me.arctic.fallenout;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

//TODO: Work on textures in future
public class powerArmor extends ArmorItem {
    public powerArmor(ArmorMaterial material, EquipmentSlot slot){
        super(material, slot, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
