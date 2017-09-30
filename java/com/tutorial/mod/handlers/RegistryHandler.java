package com.tutorial.mod.handlers;

import com.tutorial.mod.init.ArmourInit;
import com.tutorial.mod.init.BlockInit;
import com.tutorial.mod.init.ItemInit;
import com.tutorial.mod.init.ToolInit;
import com.tutorial.mod.world.gen.TutorialOreGen;

public class RegistryHandler 
{
	public static void Client()
	{	
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
	}
	
	public static void Common()
	{
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		BlockInit.registerRenders();
		
		ToolInit.init();
		ToolInit.register();
		
		ArmourInit.init();
		ArmourInit.register();
		
		TutorialOreGen.register();
		
		TileEntityHandler.register();
		GUIHandler.register();
	}
}
