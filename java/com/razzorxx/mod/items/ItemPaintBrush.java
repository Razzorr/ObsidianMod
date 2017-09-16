package com.razzorxx.mod.items;

import java.util.List;

import com.razzorxx.mod.Reference;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class ItemPaintBrush extends Item {
	
	public ItemPaintBrush(String unlocalizedName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
	
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		if(stack.hasTagCompound()) 
			if(stack.getTagCompound().hasKey("colour"))
				tooltip.add(TextFormatting.GRAY + I18n.format(getUnlocalizedName() + ".tooltip", String.format("#%06X", (0xFFFFFF & stack.getTagCompound().getInteger("colour")))));
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		if(stack.hasTagCompound())
			if(stack.getTagCompound().hasKey("colour"))
				tooltip.add(TextFormatting.GRAY + I18n.format(getUnlocalizedName() + ".tooltip", String.format("#%06X", (0xFFFFFF & stack.getTagCompound().getInteger("colour")))));
		super.addInformation(stack, worldIn, tooltip, flagIn);
	}

	public void getSubItems(Item itemIn, CreativeTabs tab, NonNullList<ItemStack> subitems) {
		ItemStack stack = new ItemStack(itemIn);
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("colour", 0xFFFFFF);
		stack.setTagCompound(nbt);
		subitems.add(stack);

	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> subitems) {
	

		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setInteger("colour", 0xFFFFFF);
		

		super.getSubItems(tab, subitems);
	}

}
