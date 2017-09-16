package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemOPickaxe extends ItemPickaxe{

	public ItemOPickaxe(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Reference.ModItems.OPICAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.OPICAXE.getRegistryName());
		this.setFull3D();
		
		setCreativeTab(ModClass.modTab);

	}

}
