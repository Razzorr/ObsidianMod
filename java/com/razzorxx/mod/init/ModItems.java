package com.razzorxx.mod.init;

import com.razzorxx.mod.items.EmeraldItemPaxel;
import com.razzorxx.mod.items.ItemCookedFood;
import com.razzorxx.mod.items.ItemDude;
import com.razzorxx.mod.items.ItemEmeraldSword;
import com.razzorxx.mod.items.ItemOAxe;
import com.razzorxx.mod.items.ItemOFood;
import com.razzorxx.mod.items.ItemOHoe;
import com.razzorxx.mod.items.ItemOPickaxe;
import com.razzorxx.mod.items.ItemOShovel;
import com.razzorxx.mod.items.ItemOSword;
import com.razzorxx.mod.items.ItemPaintBrush;
import com.razzorxx.mod.items.ObsidianItemPaxel;
import com.razzorxx.mod.util.Utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;




public class ModItems {
	
	public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 40, 4000, 40.0F, 5.0F, 30);   
	public static final ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 100, 10000, 80.0F, 10.0F, 30);   
	//public static final Item.ToolMaterial adsfjf = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	
	public static Item dude;
	public static Item obsidiansword;
	public static Item obsidianaxe;
	public static Item obsidianpicaxe;
	public static Item obsidianhoe;
	public static Item obsidianshovel;
	public static Item obsidiancookedfood;
	public static Item paintbrush;
	public static Item obsidian_paxel;
	public static Item emerald_paxel;
	
	public static Item obsidianfood;
	
	public static Item emeraldsword;
	
	
	public static void init() {
		dude = new ItemDude();
		obsidiansword = new ItemOSword(obsidianToolMaterial);
		obsidianaxe = new ItemOAxe("obsidianaxe", obsidianToolMaterial);
		obsidianpicaxe = new ItemOPickaxe(obsidianToolMaterial);
		obsidianhoe = new ItemOHoe(obsidianToolMaterial);
		obsidianshovel = new ItemOShovel(obsidianToolMaterial);
		obsidianfood = new ItemOFood();
		emeraldsword = new ItemEmeraldSword(emeraldToolMaterial);
		obsidiancookedfood = new ItemCookedFood();
		paintbrush = new ItemPaintBrush("paint_brush");
		obsidian_paxel = new ObsidianItemPaxel(obsidianToolMaterial, "obsidian_paxel", 20.0F, -3.0F);
		emerald_paxel = new EmeraldItemPaxel(emeraldToolMaterial, "emerald_paxel", 40.0F, -3.0F);
		
		
		
	}
	
	public static void register() {
		ForgeRegistries.ITEMS.register(dude); 
		ForgeRegistries.ITEMS.register(obsidiansword); 
		ForgeRegistries.ITEMS.register(obsidianaxe); 
		ForgeRegistries.ITEMS.register(obsidianpicaxe); 
		ForgeRegistries.ITEMS.register(obsidianhoe); 
		ForgeRegistries.ITEMS.register(obsidianshovel); 
		ForgeRegistries.ITEMS.register(obsidianfood);
		ForgeRegistries.ITEMS.register(emeraldsword);
		ForgeRegistries.ITEMS.register(obsidiancookedfood);
		ForgeRegistries.ITEMS.register(paintbrush);
		ForgeRegistries.ITEMS.register(obsidian_paxel);
		ForgeRegistries.ITEMS.register(emerald_paxel);
		
	}
	
	public static void registerRenders() {
		registerRender(dude);
		registerRender(obsidiansword);
		registerRender(obsidianaxe);
		registerRender(obsidianpicaxe);
		registerRender(obsidianhoe);
		registerRender(obsidianshovel);
		registerRender(obsidianfood);
		registerRender(emeraldsword);
		registerRender(obsidiancookedfood);
		registerRender(paintbrush);
		registerRender(obsidian_paxel);
		registerRender(emerald_paxel);
	
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerItemColours() {
		Minecraft.getMinecraft().getItemColors().registerItemColorHandler(new IItemColor() {
			
			@Override
			public int getColorFromItemstack(ItemStack stack, int tintIndex) {
				if(stack.hasTagCompound() && tintIndex == 1)
					if(stack.getTagCompound().hasKey("colour"))
						return stack.getTagCompound().getInteger("colour");
				return 0xFFFFFF;
			}
		}, paintbrush);
	
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	

}
