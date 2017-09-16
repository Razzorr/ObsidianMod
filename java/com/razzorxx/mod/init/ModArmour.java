package com.razzorxx.mod.init;

import com.razzorxx.mod.Reference;
import com.razzorxx.mod.items.ItemObsidianBoot;
import com.razzorxx.mod.items.ItemObsidianChest;
import com.razzorxx.mod.items.ItemObsidianHelmet;
import com.razzorxx.mod.items.ItemObsidianLeg;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModArmour 
{
	//public static final ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("obsidianArmorMaterial", Reference.MOD_ID + ":obsidian", durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	public static final ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("obsidianArmorMaterial", Reference.MOD_ID + ":obsidian", 50, new int[]{3, 7, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F);
	
	public static Item obsidianhelmet;
	public static Item obsidianchest;
	public static Item obsidianleg;
	public static Item obsidianboot;
	
	
	public static void init() {
		
		obsidianhelmet = new ItemObsidianHelmet("obsidianhelmet", obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD);
		obsidianchest = new ItemObsidianChest("obsidianchest", obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST);
		obsidianleg = new ItemObsidianLeg("obsidianleg", obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS);
		obsidianboot = new ItemObsidianBoot("obsidianboot", obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register() {
		ForgeRegistries.ITEMS.register(obsidianhelmet); 
		ForgeRegistries.ITEMS.register(obsidianchest); 
		ForgeRegistries.ITEMS.register(obsidianleg); 
		ForgeRegistries.ITEMS.register(obsidianboot); 
	}
	
	public static void registerRenders() {
		registerRender(obsidianhelmet);
		registerRender(obsidianchest);
		registerRender(obsidianleg);
		registerRender(obsidianboot);
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	

}

