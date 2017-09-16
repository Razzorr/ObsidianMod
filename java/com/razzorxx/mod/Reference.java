package com.razzorxx.mod;

public class Reference {
	
	public static final String MOD_ID = "rx";
	public static final String NAME = "RazzorXX's Obsidian Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.1]";
	
	//Int Variables
	public static final int maxStackSize1 = 4;
	
	public static final String CLIENT_PROXY_CLASS = "com.razzorxx.mod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.razzorxx.mod.proxy.ServerProxy";
	
	public static enum ModItems {
		DUDE("dude", "ItemDude"),
		OSWORD("obsidiansword", "ItemOSword"),
		OAXE("obsidianaxe", "ItemOAxe"),
		OPICAXE("obsidianpicaxe", "ItemOPickaxe"),
		OHOE("obsidianhoe", "ItemOHoe"),
		OSHOVEL("obsidianshovel", "ItemOShovel"),
		OFOOD("obsidianfood", "ItemOFood"),
		ESWORD("emeraldsword", "ItemEmeraldSword"),
		OHELMET("obsidianhelmet", "ItemObsidianHelmet"),
		OCHEST("obsidianchest", "ItemObsidianChest"),
		OLEG("obsidianleg", "ItemObsidianLeg"),
		OBOOT("obsidianboot", "ItemObsidianBoot"),
		OCFOOD("obsidiancookedfood", "ItemCookedFood");
		
		
		private String unlocalizedName;
		private String registryName;
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		
		public String getUnlocalizedName( )
		{
			return unlocalizedName;
		}
		
		 public String getRegistryName() 
		 {
			 return registryName;
		 }
		 
	  }
	
	 public static enum ModBlocks {
			OBSIDIANORE("obsidianore", "BlockObsidianOre"),
		 	OHI("hi", "BlockHi"),
		 	OLAMP("lamp", "BlockLamp"),
		 	OGRILL("grill", "BlockGrill"),
		 	OBLOCK("block", "BlockOBLock"),
		 	OSLAB("oslab", "BlockOSlab");
		 
			
			private String unlocalizedName;
			private String registryName;
	 
	 ModBlocks(String unlocalizedName, String registryName) 
	 	{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		
		public String getUnlocalizedName( )
		{
			return unlocalizedName;
		}
		
		 public String getRegistryName() 
		 {
			 return registryName;
		 }
		 
	 }
	 

		public interface IRegistry 
		{
			public String getUnocalizedName();
			public String getRegistryName();
		}
	
	

}
