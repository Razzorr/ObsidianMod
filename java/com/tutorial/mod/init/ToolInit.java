package com.tutorial.mod.init;

import com.tutorial.mod.TutorialMod;
import com.tutorial.mod.init.tools.CustomAxe;
import com.tutorial.mod.init.tools.CustomHoe;
import com.tutorial.mod.init.tools.CustomMultitool;
import com.tutorial.mod.init.tools.CustomPickaxe;
import com.tutorial.mod.init.tools.CustomShovel;
import com.tutorial.mod.init.tools.CustomSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit 
{
	public static final ToolMaterial tutorial = EnumHelper.addToolMaterial("tutorial", 3, 1200, 7.0F, 2.5F, 8);
	
	public static Item tutorial_pickaxe, tutorial_axe, tutorial_hoe, tutorial_shovel, tutorial_sword, tutorial_multitool;
	
	public static void init()
	{
		tutorial_pickaxe = new CustomPickaxe("tutorial_pickaxe", tutorial);
		tutorial_axe = new CustomAxe("tutorial_axe", tutorial);
		tutorial_hoe = new CustomHoe("tutorial_hoe", tutorial);
		tutorial_shovel = new CustomShovel("tutorial_shovel", tutorial);
		tutorial_sword = new CustomSword("tutorial_sword", tutorial);
		tutorial_multitool = new CustomMultitool("tutorial_multitool", tutorial);
	}
	
	public static void register()
	{
		registerItem(tutorial_pickaxe);
		registerItem(tutorial_axe);
		registerItem(tutorial_hoe);
		registerItem(tutorial_shovel);
		registerItem(tutorial_sword);
		registerItem(tutorial_multitool);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(TutorialMod.tutorialtab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
