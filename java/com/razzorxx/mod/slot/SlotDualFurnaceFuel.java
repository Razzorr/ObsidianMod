package com.razzorxx.mod.slot;

import com.razzorxx.mod.tileentity.TileEntityDualFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;


public class SlotDualFurnaceFuel extends Slot {

	public SlotDualFurnaceFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);

	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityDualFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}

}
