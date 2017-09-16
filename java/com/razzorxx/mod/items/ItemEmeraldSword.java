package com.razzorxx.mod.items;

import java.awt.Color;

import javax.swing.text.html.parser.Entity;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;
import com.razzorxx.mod.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityMinecartCommandBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraft.item.Item.ToolMaterial;

public class ItemEmeraldSword extends ItemSword {

	
	
	
	public ItemEmeraldSword(ToolMaterial material) {
		super(material);
		
	
		setUnlocalizedName(Reference.ModItems.ESWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ESWORD.getRegistryName());
		setCreativeTab(ModClass.modTab);
		
		
	
		
		//Item Properties
		
		this.isFull3D();
		this.setMaxStackSize(Reference.maxStackSize1);
		this.setHarvestLevel("pickaxe", 1);

	}
	
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		EntityLightningBolt lightningbolt = new EntityLightningBolt(worldIn, playerIn.posX, 128, playerIn.posZ, true);
		EntityLightningBolt light_bolt = new EntityLightningBolt(worldIn, Entity.ENTITY, Entity.ENTITY, Entity.ENTITY, true);
		EntityLightningBolt lightning_bolt = new EntityLightningBolt(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, isFull3D());
		EntityStruckByLightningEvent lightbolt = new EntityStruckByLightningEvent(playerIn, lightningbolt);
		EntityStruckByLightningEvent lightningb = new EntityStruckByLightningEvent(playerIn, light_bolt);
		EntityStruckByLightningEvent lb = new EntityStruckByLightningEvent(playerIn, lightning_bolt);
		
		//Potion Effects
		
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("speed"), 9999999, 50, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("jump_boost"), 9999999, 2, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("night_vision"), 9999999, 255, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("invisibility"), 9999999, 255, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("water_breathing"), 9999999, 255, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("fire_resistance"), 9999999, 255, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("regeneration"), 9999999, 255, true, bFull3D));
		playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("health_boost"), 9999999, 255, true, bFull3D));
		
		onItemRightClick(new ItemStack(ModItems.emeraldsword), worldIn, playerIn);
		worldIn.getSpawnPoint();

		
		worldIn.spawnEntity(lightning_bolt);
		worldIn.spawnEntity(light_bolt);
		worldIn.spawnEntity(lightningbolt);
		
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
		

	}
	
	public boolean hitEntity(ItemStack itemstack, EntityLiving entityliving, EntityLiving entityliving1) {
		itemstack.damageItem(1, entityliving1);
		return true;
	}
	
	ActionResult<ItemStack> onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
		  
		
		EntityLightningBolt lightningbolt = new EntityLightningBolt(world, entityplayer.posX, 128, entityplayer.posZ, true);
		EntityLightningBolt light_bolt = new EntityLightningBolt(world, Entity.ENTITY, Entity.ENTITY, Entity.ENTITY, true);
		EntityLightningBolt lightning_bolt = new EntityLightningBolt(world, entityplayer.posX, entityplayer.posY, entityplayer.posZ, isFull3D());
		
		
				
		world.spawnEntity(lightningbolt);
		world.spawnEntity(light_bolt);
		world.spawnEntity(lightningbolt);

	
return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
}
	
	


}
