package com.razzorxx.mod.blocks.activators;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomBlockPressurePlate extends BlockPressurePlate {
	
public CustomBlockPressurePlate(String name, float harndess, float resistance) {
		
		super(Material.IRON, Sensitivity.MOBS);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		
	
	}

	@Override
		protected void playClickOnSound(World worldIn, BlockPos color) {
		
		worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
			
		}
	
	@Override
	protected void playClickOffSound(World worldIn, BlockPos color) {
	
	worldIn.playSound((EntityPlayer)null, color, SoundEvents.BLOCK_METAL_PRESSPLATE_CLICK_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
		
	}

}
