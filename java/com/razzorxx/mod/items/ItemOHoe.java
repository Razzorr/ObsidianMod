package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraft.item.ItemHoe;


public class ItemOHoe extends ItemHoe{

	public ItemOHoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.ModItems.OHOE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OHOE.getRegistryName());
		this.setFull3D();
	
		setCreativeTab(ModClass.modTab);

	}

}
