package com.razzorxx.mod.blocks.activators;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

public class CustomBlockFence extends BlockFence {

	public CustomBlockFence(String name, float resistance, float hardness) {
		super(Material.WOOD, Material.IRON.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
	
	}

}
