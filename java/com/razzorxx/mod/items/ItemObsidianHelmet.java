package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianHelmet extends ItemArmor {

	public ItemObsidianHelmet(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.ModItems.OHELMET.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OHELMET.getRegistryName());

		setCreativeTab(ModClass.modTab);

	
	}

}
