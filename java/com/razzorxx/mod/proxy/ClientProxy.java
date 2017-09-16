package com.razzorxx.mod.proxy;

import com.razzorxx.mod.init.ModArmour;
import com.razzorxx.mod.init.ModBlocks;
import com.razzorxx.mod.init.ModCrafting;
import com.razzorxx.mod.init.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmour.registerRenders();
		ModItems.registerItemColours();

	

	}
	
	public void registerRenders()
	{

	}

	public World getClientWorld()
	{
		return null;
	}

	public EntityPlayer getClientPlayer()
	{
		return null;
	}

	@Override
	public boolean isSinglePlayer()
	{
		return false;
	}

	@Override
	public boolean isDedicatedServer()
	{
		return true;
	}

	@Override
	public void preInit()
	{
		
	}

}
