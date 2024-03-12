package net.mcreator.falloutwastelands.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.falloutwastelands.world.inventory.BASEInventoryMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BASEInventoryScreen extends AbstractContainerScreen<BASEInventoryMenu> {
	private final static HashMap<String, Object> guistate = BASEInventoryMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BASEInventoryScreen(BASEInventoryMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 112;
		this.imageHeight = 110;
	}

	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/screens/base_inventory.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_inventory"), -88, -57, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_note_to_make_the_white_ui_disap"), -153, 105, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_inventory.label_a"), -153, 121, -16777216, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
