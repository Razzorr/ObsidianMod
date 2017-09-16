package com.razzorxx.mod.blocks;

import java.util.Random;

import com.razzorxx.mod.ModClass;
import com.razzorxx.mod.Reference;
import com.razzorxx.mod.util.ParticleHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockGrill extends Block{
	
	

	public BlockGrill() 
	{
		super(Material.IRON);
		this.setHardness(1.5F);
		this.setCreativeTab(ModClass.modTab);
		
		
		setUnlocalizedName(Reference.ModBlocks.OGRILL.getUnlocalizedName());
		setRegistryName(Reference.ModBlocks.OGRILL.getRegistryName());

		
	
		this.setHarvestLevel("pickaxe", 1);
		this.setLightLevel(0.5F);
		this.setLightOpacity(10);
		this.setSoundType(blockSoundType);
	}

}