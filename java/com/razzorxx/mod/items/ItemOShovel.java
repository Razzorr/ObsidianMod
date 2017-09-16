package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemOShovel extends ItemSpade{

	public ItemOShovel(ToolMaterial material) {
		super(material);

		setUnlocalizedName(Reference.ModItems.OSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OSHOVEL.getRegistryName());
		setCreativeTab(ModClass.modTab);
		
		this.setFull3D();
	}

}
