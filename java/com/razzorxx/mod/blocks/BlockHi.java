package com.razzorxx.mod.blocks;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;

public class BlockHi extends Block {

	public BlockHi() {
		super(Material.GLASS);
		
		setUnlocalizedName(Reference.ModBlocks.OHI.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OHI.getRegistryName());
		
		setCreativeTab(ModClass.modTab);

		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(0.5F);
		this.setLightOpacity(10);
		this.setSoundType(blockSoundType);
		
		
		
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
		
	}
	
	

}
