package com.tutorial.mod.init.items;

import com.tutorial.mod.TutorialMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends Item
{
	public CustomIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}
