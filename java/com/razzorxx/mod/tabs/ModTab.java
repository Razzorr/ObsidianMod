package com.razzorxx.mod.tabs;

import com.razzorxx.mod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs{

	public ModTab(String label) {
		super("modTab");
		this.setBackgroundImageName("mod.png");

	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.dude); 
	}

}
