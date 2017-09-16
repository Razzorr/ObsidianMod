package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianChest extends ItemArmor {

	public ItemObsidianChest(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.ModItems.OCHEST.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OCHEST.getRegistryName());

		setCreativeTab(ModClass.modTab);

		
	}

}
