package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianBoot extends ItemArmor{

	public ItemObsidianBoot(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.ModItems.OBOOT.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OBOOT.getRegistryName());

		setCreativeTab(ModClass.modTab);

	}

}
