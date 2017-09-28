package com.razzorxx.mod.potion;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionFly extends Potion{
	
	public PotionFly() {
		super(false, 8376831);
		setPotionName("effect.fly");
		CreativeTabs.BREWING.getTabIconItem();
		setIconIndex(3, 2);
		setRegistryName(new ResourceLocation(Reference.MOD_ID + ":" + "fly"));
	}

}
