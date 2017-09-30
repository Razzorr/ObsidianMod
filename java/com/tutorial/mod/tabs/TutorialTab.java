package com.tutorial.mod.tabs;

import com.tutorial.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs
{
	public TutorialTab(String label) { super("tutorialtab"); 
	this.setBackgroundImageName("tutorial.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.tutorial_ingot);}
}
