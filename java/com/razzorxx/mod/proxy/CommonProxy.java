package com.razzorxx.mod.proxy;

public interface CommonProxy {

	public void init();
	
		public void preInit();
		
		public boolean isSinglePlayer();

		public boolean isDedicatedServer();

	
}
