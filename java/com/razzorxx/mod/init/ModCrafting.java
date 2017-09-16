package com.razzorxx.mod.init;

import com.razzorxx.mod.util.RecipeItemColour;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.ModClassLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent.Register;

public class ModCrafting {
	
	
	
	public static void registerArmourRecipe(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot) {
		GameRegistry.addShapedRecipe(new ResourceLocation("adfdsf"), new ResourceLocation("ddddad"), new ItemStack(helmet), new Object[] { "III","I I","   ",'I',ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("00dddddd0"), new ResourceLocation("1sdf11"), new ItemStack(helmet), new Object[] { "   ","III","I I",'I',ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("00asdf0"), new ResourceLocation("1134521"), new ItemStack(chestplate), new Object[] { "I I","III","III",'I',ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("0asdffc00"), new ResourceLocation("11351"), new ItemStack(leggings), new Object[] { "III","I I","I I",'I',ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("00afgav0"), new ResourceLocation("11441"), new ItemStack(boots), new Object[] { "I I","I I","   ",'I',ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("0hfdh00"), new ResourceLocation("1122341"), new ItemStack(boots), new Object[] { "   ","I I","I I",'I',ingot});
	}
	
	public static void registerCraftingRecipes( ) {
		
		RecipeSorter.register("itemColour", RecipeItemColour.class, Category.SHAPELESS, "after:minecraft:shapeless"); 
		//ForgeRegistries.RECIPES.register(new RecipeItemColour(new ItemStack(ModItems.paintbrush)));
		//ForgeRegistries.RECIPES.register(new RecipeItemColour(new ItemStack(ModItems.paintbrush)));
		//GameRegistry.addShapedRecipe(new ResourceLocation("000"), new ResourceLocation("111"), new ItemStack(ModItems.paintbrush));
	
	
		
	
		
		
	
	}
	
	public static void register() {
		
		
		
		//Crafting
		GameRegistry.addShapedRecipe(new ResourceLocation("000"), new ResourceLocation("111"), new ItemStack(ModItems.obsidiansword), " O ", " O ", " S ", 'O', ModItems.dude, 'S', Items.STICK);  
		GameRegistry.addShapedRecipe(new ResourceLocation("0000"), new ResourceLocation("1111"), new ItemStack(ModItems.obsidianshovel), " O ", " S ", " S ", 'O', ModItems.dude, 'S', Items.STICK);  
		GameRegistry.addShapedRecipe(new ResourceLocation("00000"), new ResourceLocation("11111"), new ItemStack(ModItems.obsidianpicaxe), "OOO", " S ", " S ", 'O', ModItems.dude, 'S', Items.STICK);  
		GameRegistry.addShapedRecipe(new ResourceLocation("0000000"), new ResourceLocation("111111"), new ItemStack(Blocks.OBSIDIAN), "OOO", "OOO", "OOO", 'O', ModItems.dude );
		GameRegistry.addShapedRecipe(new ResourceLocation("00000000"), new ResourceLocation("1111111"), new ItemStack(ModItems.obsidianhoe), "OO ", " S ", " S ", 'O', ModItems.dude, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ResourceLocation("0000000"), new ResourceLocation("111111"), new ItemStack(ModBlocks.oblock), "OOO", "OOO", "OOO", 'O', ModItems.dude );
		
		//PaintBrush
		
		//RecipeSorter.register("itemColour", RecipeItemColour.class, Category.SHAPELESS, "after:minecraft:shapeless"); 
	
		
		
		
		//ForgeRegistries.RECIPES.register(new RecipeItemColour(new ItemStack(ModItems.paintbrush)));
		
		//RecipeSorter.register("clearColour", RecipeClearColour.class, Category.SHAPELESS, "after:minecraft:shapeless"); 
		//GameRegistry.addRecipe(new RecipeClearColour(new ItemStack(ModBlocks.canvas)));
		
		//Armor
		GameRegistry.addShapedRecipe(new ResourceLocation("0d00"), new ResourceLocation("11af1"), new ItemStack(ModItems.emeraldsword), " E ", " E ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
		registerArmourRecipe(ModArmour.obsidianhelmet, ModArmour.obsidianchest, ModArmour.obsidianleg, ModArmour.obsidianboot, ModItems.dude);
		
		//Foood
		GameRegistry.addShapedRecipe(new ResourceLocation("0d0da0"), new ResourceLocation("11afaf1"), new ItemStack(ModItems.obsidianfood), " A ", " G ", " G ", 'A', Items.APPLE, 'G', Items.GOLDEN_APPLE);
		GameRegistry.addShapedRecipe(new ResourceLocation("0d0da0"), new ResourceLocation("11afaf1"), new ItemStack(ModItems.obsidiancookedfood), " A ", " G ", "OGO", 'A', Items.APPLE, 'G', Items.GOLDEN_APPLE, 'O', ModItems.obsidianfood);
		
		//Slabs and Plate
		
		GameRegistry.addShapedRecipe(new ResourceLocation("00000asf00"), new ResourceLocation("112341111"), new ItemStack(ModBlocks.obsidian_slab_double), " O ", " O ", " O ", 'O', ModBlocks.oblock);
		GameRegistry.addShapedRecipe(new ResourceLocation("0000asa000"), new ResourceLocation("111asd3111"), new ItemStack(ModBlocks.obsidian_slab_half), " O ", " O ", " O ", 'O', ModBlocks.oblock);
		GameRegistry.addShapedRecipe(new ResourceLocation("0ffd000000"), new ResourceLocation("111fff111"), new ItemStack(ModBlocks.obsidian_slab_double), " O ", " O ", " O ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ResourceLocation("000fd0000"), new ResourceLocation("11115411"), new ItemStack(ModBlocks.obsidian_slab_half), " O ", " O ", " O ", 'O', Blocks.OBSIDIAN);
		
		GameRegistry.addShapedRecipe(new ResourceLocation("000000asdf0"), new ResourceLocation("111asd4f111"), new ItemStack(ModBlocks.obsidian_pressure_plate), " O ", " O ", "   ", 'O', ModBlocks.oblock);
		GameRegistry.addShapedRecipe(new ResourceLocation("0000asd000"), new ResourceLocation("111132411"), new ItemStack(ModBlocks.obsidian_pressure_plate), " O ", " O ", "   ", 'O', Blocks.OBSIDIAN);
		
		//Decoration
		
		GameRegistry.addShapedRecipe(new ResourceLocation("0002"), new ResourceLocation("3111"), new ItemStack(ModBlocks.lamp), "GGG", "GDG", "ORO", 'O', ModBlocks.oblock, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'D', Blocks.GLOWSTONE);  
		GameRegistry.addShapedRecipe(new ResourceLocation("00da02"), new ResourceLocation("311dd1"), new ItemStack(ModBlocks.lamp), "GGG", "GDG", "ORO", 'O', Blocks.OBSIDIAN, 'G', Blocks.GLASS, 'R', Items.REDSTONE, 'D', Blocks.GLOWSTONE);  
		GameRegistry.addShapedRecipe(new ResourceLocation("0002"), new ResourceLocation("314411"), new ItemStack(ModBlocks.grill), "CCC", "CGC", "CRC", 'C', Blocks.CONCRETE, 'G', Blocks.GLASS, 'R', Items.REDSTONE);  
		GameRegistry.addShapedRecipe(new ResourceLocation("0002"), new ResourceLocation("313211"), new ItemStack(ModBlocks.hi), "GGG", "GDG", "CCO", 'O', ModBlocks.oblock, 'G', Blocks.GLASS, 'C', Blocks.CONCRETE, 'D', Blocks.DIAMOND_BLOCK); 
		GameRegistry.addShapedRecipe(new ResourceLocation("0002"), new ResourceLocation("3124511"), new ItemStack(ModBlocks.hi), "GGG", "GDG", "CCO", 'O', Blocks.OBSIDIAN, 'G', Blocks.GLASS, 'C', Blocks.CONCRETE, 'D', Blocks.DIAMOND_BLOCK);
		
		
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("rx:itemdude"), new ResourceLocation("23481"), new ItemStack(ModItems.dude, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.oblock))}); 
		GameRegistry.addShapelessRecipe(new ResourceLocation("rx:itemdadfude"), new ResourceLocation("2asdf3481"), new ItemStack(ModItems.dude, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(Blocks.OBSIDIAN))});   
		GameRegistry.addShapelessRecipe(new ResourceLocation("rx:adffe"), new ResourceLocation("23asdd481"), new ItemStack(ModBlocks.obsidian_button, 1), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(Blocks.OBSIDIAN))}); 
		GameRegistry.addShapelessRecipe(new ResourceLocation("rx:adffe"), new ResourceLocation("23asdd481"), new ItemStack(ModBlocks.obsidian_button, 1), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.oblock))});
		//Smelting
		
		GameRegistry.addSmelting(Blocks.OBSIDIAN, new ItemStack(ModItems.dude), 1.0F);
		GameRegistry.addSmelting(ModBlocks.obsidianore, new ItemStack(ModItems.dude), 1.0F);
		GameRegistry.addSmelting(ModBlocks.oblock, new ItemStack(ModItems.dude), 1.0F);
		
		GameRegistry.addSmelting(ModItems.obsidianfood, new ItemStack(ModItems.obsidiancookedfood), 1.0F);
		
	}

	
	
	
}
	


