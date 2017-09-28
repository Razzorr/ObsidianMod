package com.razzorxx.mod.gen;

import java.util.Random;

import com.razzorxx.mod.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ObsidianOreGen implements IWorldGenerator{
	
	private WorldGenerator obsidianore, nether, end;
	
	
	public ObsidianOreGen()
	{
		obsidianore = new WorldGenMinable(ModBlocks.obsidianore.getDefaultState(), 9);	
		nether = new WorldGenMinable(ModBlocks.obsidianorenether.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		end = new WorldGenMinable(ModBlocks.obsidianoreend.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch(world.provider.getDimension())
		{
		case 0:
			
			runGenerator(obsidianore, world, random, chunkX, chunkZ, 50, 0, 50);
			
			break;
			
			
		case 1:
			
			runGenerator(end, world, random, chunkX, chunkZ, 50, 0, 255);
			runGenerator(end, world, random, chunkX, chunkZ, 50, 0, 255);
			
			break;
			
			
		case -1:
			
			runGenerator(nether, world, random, chunkX, chunkZ, 50, 0, 50);
			
			break;
		}
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Ore Generated out of bounds");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i ++) 
		{
				int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        
		        generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
