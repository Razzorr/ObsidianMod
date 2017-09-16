package com.razzorxx.mod.blocks;

import java.util.Random;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;
import com.razzorxx.mod.init.ModBlocks;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BlockOSlab extends BlockSlab {

	public BlockOSlab(String unlocalizedName) {
		super(Material.IRON);
		setUnlocalizedName(unlocalizedName);
		setRegistryName(unlocalizedName);
		
		this.setHardness(3.0F);
		
		setCreativeTab(ModClass.modTab);
		this.setResistance(20.0F);
		
		IBlockState state = this.blockState.getBaseState();
		
		if (!this.isDouble()) 
		{
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		setDefaultState(state);
		this.useNeighborBrightness = true;
	}
	
	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
		
	}
	
	@Override 
	public IProperty<?> getVariantProperty() {
		return HALF;
		
	}
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return EnumBlockHalf.BOTTOM;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) 
	{
		if (!this.isDouble()) 
		{
			return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta %  EnumBlockHalf.values().length]);
		}
		return this.getDefaultState();
	}
	
	@Override 
	public int getMetaFromState(IBlockState state) 
	{
		if (this.isDouble())
		{
			return 0;
		}
		return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(ModBlocks.obsidian_slab_half);
	}
	
	@Override 
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] { HALF }); 
		}
	}
		
	


