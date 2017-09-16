package com.razzorxx.mod.init;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;
import com.razzorxx.mod.blocks.BlockDualFurnace;
import com.razzorxx.mod.blocks.BlockGrill;
import com.razzorxx.mod.blocks.BlockHi;
import com.razzorxx.mod.blocks.BlockLamp;
import com.razzorxx.mod.blocks.BlockOBlock;
import com.razzorxx.mod.blocks.BlockOSlab;
import com.razzorxx.mod.blocks.BlockOSlabDouble;
import com.razzorxx.mod.blocks.BlockOSlabHalf;
import com.razzorxx.mod.blocks.BlockObsidianOre;
import com.razzorxx.mod.blocks.CustomBlockStairs;
import com.razzorxx.mod.blocks.activators.CustomBlockButton;
import com.razzorxx.mod.blocks.activators.CustomBlockPressurePlate;
import com.razzorxx.mod.blocks.itemvariants.ItemBlockVariants;
import com.razzorxx.mod.blocks.obsidianwood.CustomBlockPlanks;
import com.razzorxx.mod.tileentity.TileEntityDualFurnace;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	public static Block obsidianore;
	public static Block hi;
	public static Block lamp;
	public static Block grill;
	public static Block oblock;
	public static BlockOSlab obsidian_slab_half;
	public static BlockOSlab obsidian_slab_double;
	public static CustomBlockButton obsidian_button;
	public static CustomBlockPressurePlate obsidian_pressure_plate;
	public static CustomBlockStairs obsidian_stairs;
	public static BlockDualFurnace dual_furnace;
	public static Block planks;

	
	public static void init() {
		obsidianore = new BlockObsidianOre();
		hi = new BlockHi();
		lamp = new BlockLamp();
		grill = new BlockGrill();
		oblock = new BlockOBlock();
		obsidian_slab_half = new BlockOSlabHalf("obsidian_slab_half");
		obsidian_slab_double = new BlockOSlabDouble("obsidian_slab_double");
		obsidian_button = new CustomBlockButton("obsidian_button", 20.5F, 20.5F);
		obsidian_pressure_plate = new CustomBlockPressurePlate("obsidian_pressure_plate", 2.5F, 4.5F);
		obsidian_stairs = new CustomBlockStairs("obsidian_stairs", oblock.getDefaultState());
		dual_furnace = new BlockDualFurnace();
		planks = new CustomBlockPlanks("planks");
	
	}
	
	public static void register() {
	
		registerBlock(obsidianore);
		registerBlock(hi);
		registerBlock(lamp);
		registerBlock(grill);
		registerBlock(oblock);
		registerBlock(obsidian_slab_half, new ItemSlab(obsidian_slab_half, obsidian_slab_half, obsidian_slab_double));
		registerBlock(obsidian_button);
		registerBlock(obsidian_pressure_plate);
		registerBlock(obsidian_stairs);
		registerBlock(dual_furnace);
		registerBlockWithVariants(planks, new ItemBlockVariants(planks));
		
		GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dual_furnace");
	}
	
	private static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(obsidianore);
		ForgeRegistries.BLOCKS.register(hi);
		ForgeRegistries.BLOCKS.register(lamp);
		ForgeRegistries.BLOCKS.register(grill);
		ForgeRegistries.BLOCKS.register(oblock);
		ForgeRegistries.BLOCKS.register(obsidian_slab_half);
		ForgeRegistries.BLOCKS.register(obsidian_slab_double);
		ForgeRegistries.BLOCKS.register(obsidian_button);
		ForgeRegistries.BLOCKS.register(obsidian_pressure_plate);
		ForgeRegistries.BLOCKS.register(obsidian_stairs);
		ForgeRegistries.BLOCKS.register(dual_furnace);
		ForgeRegistries.BLOCKS.register(planks);
		
		
		
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(ModClass.modTab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static void registerBlock(Block block, ItemBlock itemblock) {
		
		ForgeRegistries.BLOCKS.register(block);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
		block.setCreativeTab(ModClass.modTab);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerRenders() {
		
		for(int i = 0; i < CustomBlockPlanks.EnumType.values().length; i++)
		{
			registerRender(planks, i, "planks_" + CustomBlockPlanks.EnumType.values()[i].getName());
		}
		
		
		registerRender(obsidianore);
		registerRender(hi);
		registerRender(lamp);
		registerRender(grill);
		registerRender(oblock);
		registerRender(obsidian_slab_half);
		registerRender(obsidian_slab_double);
		registerRender(obsidian_pressure_plate);
		registerRender(obsidian_stairs);
		registerRender(dual_furnace);
		registerRender(planks);
		
		
	}
	
	public static void registerBlockWithVariants(Block block, ItemBlock itemblock)
	{
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(ModClass.modTab);
		itemblock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemblock);
	}
	
	public static void registerRender(Block block, int meta, String filename)
	{
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), "inventory"));
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
