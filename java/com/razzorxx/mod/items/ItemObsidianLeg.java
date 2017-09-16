package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemObsidianLeg extends ItemArmor{

	public ItemObsidianLeg(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(Reference.ModItems.OLEG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OLEG.getRegistryName());

		setCreativeTab(ModClass.modTab);

	}

}
