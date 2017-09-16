package com.razzorxx.mod.gui;

import net.minecraft.item.ItemStack;

public abstract interface ISimpleInventory
{
	public int getSize();

	public ItemStack getItem(int i);
	
	public void clear();
}

