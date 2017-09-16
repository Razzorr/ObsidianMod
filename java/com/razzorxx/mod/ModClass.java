package com.razzorxx.mod;


import com.razzorxx.mod.gen.ObsidianOreGen;
import com.razzorxx.mod.gui.DualFurnaceGuiHandler;
import com.razzorxx.mod.init.ModArmour;
//import com.razzorxx.mod.handler.ConfigurationHandler;
import com.razzorxx.mod.init.ModBlocks;
import com.razzorxx.mod.init.ModCrafting;
import com.razzorxx.mod.init.ModItems;
import com.razzorxx.mod.proxy.CommonProxy;
import com.razzorxx.mod.tabs.ModTab;
import com.razzorxx.mod.tileentity.TileEntityDualFurnace;
import com.razzorxx.mod.util.RecipeItemColour;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Optional.Method;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLInterModComms.IMCMessage;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class ModClass {
	
	//public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 20, 3000, 20.0F, 20.0F, 30);   
	
	
	public static final CreativeTabs modTab = new ModTab("mod_tab");
	
	@Instance
	public static ModClass instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dual_furnace");
		
		
		
		ModArmour.init();
		ModArmour.register();
		
		ModCrafting.registerCraftingRecipes();
		
		
		
		
		
		GameRegistry.registerWorldGenerator(new ObsidianOreGen(), 0);
		
		
		proxy.preInit();
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new DualFurnaceGuiHandler());
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		System.out.println("Init");
		
		proxy.init();
		
		
		ModCrafting.register();
		
		
		ModItems.registerItemColours();
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new DualFurnaceGuiHandler());
		
		GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dual_furnace");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init");
		NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new DualFurnaceGuiHandler());
		GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dual_furnace");
	}

	public static Minecraft getMinecraftInstance() {

		return null;
	}
	
}


