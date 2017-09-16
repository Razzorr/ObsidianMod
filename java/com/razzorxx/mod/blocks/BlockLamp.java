package com.razzorxx.mod.blocks;

import java.util.List;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLamp extends Block {
	
	// 1/16 = 0.0625
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.0625 * 3, 0, 0.0625 * 3, 0.0625 * 13,  0.0625 * 17, 0.0625 * 13);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625 * 4, 0, 0.0625 * 4, 0.0625 * 12,  0.0625 * 16, 0.0625 * 12);

	public BlockLamp() {
		super(Material.GLASS);
		
		setUnlocalizedName(Reference.ModBlocks.OLAMP.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OLAMP.getRegistryName());
		
		setCreativeTab(ModClass.modTab);
		
		
		this.setHardness(20.0F);
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(1.0F);
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
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOX_BOUNDING;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
	}

}
