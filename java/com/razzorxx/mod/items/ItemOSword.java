package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemOSword extends ItemSword{

	
	
	
	public ItemOSword(ToolMaterial material) {
		super(material);
		
	;
		setUnlocalizedName(Reference.ModItems.OSWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OSWORD.getRegistryName());
		setCreativeTab(ModClass.modTab);
		
		this.setFull3D();

	}

}
