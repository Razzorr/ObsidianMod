package com.razzorxx.mod.gui;

import com.razzorxx.mod.Reference;
import com.razzorxx.mod.tileentity.TileEntityDualFurnace;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiDualFurnace extends GuiContainer{
	
	private static final ResourceLocation DUAL_FURNACE_TEXTURES = new ResourceLocation("rx:textures/gui/container/dual_furnace.png");
	//private static final ResourceLocation gui = new ResourceLocation("rx:textures/gui/container/dual_furnace.png");
	
	private final InventoryPlayer player;
	private final TileEntityDualFurnace tileentity;
	
	public GuiDualFurnace(InventoryPlayer player, TileEntityDualFurnace tileentity) {
		super(new ContainerDualFurnace(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}
	//@Override
	//protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		//String s = I18n.format("container.block_breaker"); //Gets the formatted name for the block breaker from the language file
		//this.mc.fontRendererObj.drawString(s, this.xSize / 2 - this.mc.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); //Draws the block breaker name in the center on the top of the gui
		//this.mc.fontRendererObj.drawString(this.playerInv.getDisplayName().getFormattedText(), 8, 73, 4210752); //The player's inventory name
		
		//this.progressBar.setMin(cooldown).setMax(maxCooldown);
		///this.progressBar.draw(this.mc);
		
		//int actualMouseX = mouseX - ((this.width - this.xSize) / 2);
		////int actualMouseY = mouseY - ((this.height - this.ySize) / 2);
		//if(actualMouseX >= 134 && actualMouseX <= 149 && actualMouseY >= 17 && actualMouseY <= 32 && te.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).getStackInSlot(9) == ItemStack.EMPTY) {
			//List<String> text = new ArrayList<String>();
			//text.add(TextFormatting.GRAY + I18n.format("gui.block_breaker.enchanted_book.tooltip"));
			//this.drawHoveringText(text, actualMouseX, actualMouseY);
		//}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(DUAL_FURNACE_TEXTURES);
		//this.mc.getTextureManager().bindTexture(gui);
		this.mc.displayGuiScreen(new GuiDualFurnace(player, tileentity));
		mc.displayGuiScreen(new GuiDualFurnace(player, tileentity));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		
		this.mc.fontRenderer.drawString(this.player.getDisplayName().getFormattedText(), 8, 73, 4210752);
		
		String s = I18n.format("container.dual_furnace"); //Gets the formatted name for the block breaker from the language file
		
		if(TileEntityDualFurnace.isBurning(this.tileentity)) {
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(this.guiLeft + 80, this.guiTop + 42 + 12 - k, 176, 12 - k, 14, k + 1);
		}
		
		int l = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 43, this.guiTop + 18, 176, 14, l + 1, 16);
		int r = this.getCookProgressScaled(24);
		this.drawTexturedModalRect(this.guiLeft + 109, this.guiTop + 18, 176, 31, 23 - r, 16);
	}
	
	private int getBurnLeftScaled(int pixels) {
		int i = this.tileentity.getField(1);
		
		if(i == 0)
			i = 200;
		return this.tileentity.getField(0) * pixels / i;
	}
	
	private int getCookProgressScaled(int pixels) {
		int i = this.tileentity.getField(2);
        int j = this.tileentity.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
	}

}
