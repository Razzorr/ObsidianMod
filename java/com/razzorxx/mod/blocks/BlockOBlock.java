package com.razzorxx.mod.blocks;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockOBlock extends BlockObsidian{
	

	public BlockOBlock() {
		super();
		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.5F);
		this.setLightOpacity(10);
		this.setSoundType(blockSoundType);
		
		setUnlocalizedName(Reference.ModBlocks.OBLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OBLOCK.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
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
