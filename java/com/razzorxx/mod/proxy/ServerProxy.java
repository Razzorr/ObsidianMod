package com.razzorxx.mod.proxy;

import com.razzorxx.mod.init.ModArmour;
import com.razzorxx.mod.init.ModBlocks;
import com.razzorxx.mod.init.ModItems;

public class ServerProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmour.registerRenders();
		ModItems.registerItemColours();
		
		
		
	}

	@Override
	public void preInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSinglePlayer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		// TODO Auto-generated method stub
		return false;
	}

}
