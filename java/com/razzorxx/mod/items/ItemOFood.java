package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraft.item.ItemFood;


public class ItemOFood extends ItemFood{

	public ItemOFood() {
		super(8, 2, true);
		setUnlocalizedName(Reference.ModItems.OFOOD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OFOOD.getRegistryName());
		
		setCreativeTab(ModClass.modTab);


	}

}
