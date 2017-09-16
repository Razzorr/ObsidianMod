package com.razzorxx.mod.items;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemDude extends Item {
	
	public ItemDude() {
		setUnlocalizedName(Reference.ModItems.DUDE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.DUDE.getRegistryName());

		setCreativeTab(ModClass.modTab);
		
		
		
		
		
		
		
	}
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("speed"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("jump_boost"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("night_vision"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("invisibility"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("water_breathing"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("fire_resistance"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("regeneration"));
		playerIn.removeActivePotionEffect(Potion.getPotionFromResourceLocation("health_boost"));
		
		
		
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("speed"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("jump_boost"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("night_vision"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("invisibility"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("water_breathing"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("fire_resistance"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("regeneration"));
		playerIn.removePotionEffect(Potion.getPotionFromResourceLocation("health_boost"));
		
		
		
		
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
	
	

}
