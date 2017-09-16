package com.razzorxx.mod.blocks;

import java.util.Random;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;
import com.razzorxx.mod.init.ModItems;
//import com.razzorxx.mod.worldgen.OreGen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockObsidianOre extends Block{

	public BlockObsidianOre() {
		super(Material.IRON);
		setUnlocalizedName(Reference.ModBlocks.OBSIDIANORE.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OBSIDIANORE.getRegistryName());
		
		setCreativeTab(ModClass.modTab);

		
		
		//Block Properties
		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.3F);
		this.setLightOpacity(10);
		this.setSoundType(blockSoundType);
		
		//16 - X = Y
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ModItems.dude;
		
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
	
	

}
