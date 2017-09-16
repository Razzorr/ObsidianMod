package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.item.ItemFood;

public class ItemCookedFood extends ItemFood {

	public ItemCookedFood() {
		super(10, 6, true);
		setUnlocalizedName(Reference.ModItems.OCFOOD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OCFOOD.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
	}

}
