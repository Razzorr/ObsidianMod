package com.tutorial.mod.handlers;

import com.tutorial.mod.Reference;
import com.tutorial.mod.TutorialMod;
import com.tutorial.mod.container.ContainerMicrowave;
import com.tutorial.mod.gui.GuiMicrowave;
import com.tutorial.mod.tileentity.TileEntityMicrowave;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GUIHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		
		if(entity != null)
		{
			switch(ID)
			{
			case Reference.GUI_MICROWAVE:
				if(entity instanceof TileEntityMicrowave) 
				{
					return new ContainerMicrowave(player.inventory, (TileEntityMicrowave)entity);
				}
			}
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(new BlockPos(x,y,z));
		
		if(entity != null)
		{
			switch(ID)
			{
			case Reference.GUI_MICROWAVE:
				if(entity instanceof TileEntityMicrowave) 
				{
					return new GuiMicrowave(player.inventory, (TileEntityMicrowave)entity);
				}
				
				return null;
			}
		}
		
		return null;
	}
	
	public static void register()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(TutorialMod.INSTANCE, new GUIHandler());
	}

}
