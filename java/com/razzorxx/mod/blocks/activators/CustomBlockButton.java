package com.razzorxx.mod.blocks.activators;

import net.minecraft.block.BlockButton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomBlockButton extends BlockButton{

	public CustomBlockButton(String name, float harndess, float resistance) {
		
		super(true);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(1.0F);
		
	
	}

	@Override
	protected void playClickSound(EntityPlayer player, World worldIn, BlockPos pos) {
		worldIn.playSound(player, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON, SoundCategory.BLOCKS, 1.0F, 1.0F);
	}

	@Override
	protected void playReleaseSound(World worldIn, BlockPos pos) {
	
		worldIn.playSound(null, pos, SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF, SoundCategory.BLOCKS, 1.0F, 1.0F);
	}

}
