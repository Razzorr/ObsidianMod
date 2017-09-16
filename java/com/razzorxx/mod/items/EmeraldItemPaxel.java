package com.razzorxx.mod.items;

import java.util.Set;

import com.google.common.collect.Sets;
import com.razzorxx.mod.ModClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class EmeraldItemPaxel extends ItemTool {
	
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST,
			Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.ACTIVATOR_RAIL,
			Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK,
			Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK,
			Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, 
			Blocks.DIRT, Blocks.GRASS, Blocks.OBSIDIAN, com.razzorxx.mod.init.ModBlocks.oblock, com.razzorxx.mod.init.ModBlocks.obsidianore, com.razzorxx.mod.init.ModBlocks.dual_furnace});

	public EmeraldItemPaxel(Item.ToolMaterial material, String name, float damage, float speed) {
		super(material, EFFECTIVE_ON);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(ModClass.modTab);
		this.damageVsEntity = damage;
		this.attackSpeed = speed;
		
	}
	
	public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();

        if (block == Blocks.OBSIDIAN)
        {
            return this.toolMaterial.getHarvestLevel() >= 3;
        }
        else if (block != Blocks.DIAMOND_BLOCK && block != Blocks.DIAMOND_ORE)
        {
            if (block != Blocks.EMERALD_ORE && block != Blocks.EMERALD_BLOCK)
            {
                if (block != Blocks.GOLD_BLOCK && block != Blocks.GOLD_ORE)
                {
                    if (block != Blocks.IRON_BLOCK && block != Blocks.IRON_ORE)
                    {
                        if (block != Blocks.LAPIS_BLOCK && block != Blocks.LAPIS_ORE)
                        {
                            if (block != Blocks.REDSTONE_ORE && block != Blocks.LIT_REDSTONE_ORE)
                            {
                                Material material = blockIn.getMaterial();
                                return material == Material.ROCK ? true : (material == Material.IRON ? true : material == Material.ANVIL ? true : material == Material.WOOD ? true :
                                	material == Material.PLANTS ? true : material == Material.VINE);
                            }
                            else
                            {
                                return this.toolMaterial.getHarvestLevel() >= 3;
                            }
                        }
                        else
                        {
                            return this.toolMaterial.getHarvestLevel() >= 3;
                        }
                    }
                    else
                    {
                        return this.toolMaterial.getHarvestLevel() >= 3;
                    }
                }
                else
                {
                    return this.toolMaterial.getHarvestLevel() >= 3;
                }
            }
            else
            {
                return this.toolMaterial.getHarvestLevel() >= 3;
            }
        }
        else
        {
            return this.toolMaterial.getHarvestLevel() >= 3;
        }
        
        
    }
	
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS &&
				material != Material.VINE && material != Material.IRON && material != Material.ANVIL &&
				material != Material.ROCK ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;     
    	
    }
	
	

}
