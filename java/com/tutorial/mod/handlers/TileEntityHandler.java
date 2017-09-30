package com.tutorial.mod.handlers;

import com.tutorial.mod.tileentity.TileEntityMicrowave;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void register()
	{
		GameRegistry.registerTileEntity(TileEntityMicrowave.class, "microwave");
	}
}
