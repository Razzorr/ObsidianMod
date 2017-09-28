package com.razzorxx.mod.potion;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PotionTypeRegistry {
	
	public static final PotionType FLY = new PotionType("fly", new PotionEffect[] {new PotionEffect(ModClass.FLY_POTION, 2400)}).setRegistryName("fly");
	public static final PotionType LONG_FLY = new PotionType("fly", new PotionEffect[] {new PotionEffect(ModClass.FLY_POTION, 9600)}).setRegistryName("fly");

	
	public static void registerPotionTypes() {
		ForgeRegistries.POTION_TYPES.register(FLY);
		ForgeRegistries.POTION_TYPES.register(LONG_FLY);
		PotionHelper.addMix(PotionTypes.INVISIBILITY, Items.ENDER_EYE, FLY);
		PotionHelper.addMix(FLY, Items.REDSTONE, LONG_FLY);
	}

}
