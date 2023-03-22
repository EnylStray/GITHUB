package net.mcreator.celesty.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.celesty.world.inventory.NeedleGUIMenu;
import net.mcreator.celesty.network.NeedleGUIButtonMessage;
import net.mcreator.celesty.CelestyMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class NeedleGUIScreen extends AbstractContainerScreen<NeedleGUIMenu> {
	private final static HashMap<String, Object> guistate = NeedleGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_needle_button_24_gui_texture;

	public NeedleGUIScreen(NeedleGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 188;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("celesty:textures/screens/needle_gui_recolor_again_gui_texture.png"));
		this.blit(ms, this.leftPos + 0, this.topPos + 1, 0, 0, 176, 188, 176, 188);

		RenderSystem.setShaderTexture(0, new ResourceLocation("celesty:textures/screens/gui_needle_100.png"));
		this.blit(ms, this.leftPos + 35, this.topPos + 4, 0, 0, 100, 100, 100, 100);

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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.celesty.needle_gui.label_knitting"), 4, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_needle_button_24_gui_texture = new ImageButton(this.leftPos + 137, this.topPos + 76, 24, 24, 0, 0, 24, new ResourceLocation("celesty:textures/screens/atlas/imagebutton_needle_button_24_gui_texture.png"), 24, 48, e -> {
			if (true) {
				CelestyMod.PACKET_HANDLER.sendToServer(new NeedleGUIButtonMessage(0, x, y, z));
				NeedleGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_needle_button_24_gui_texture", imagebutton_needle_button_24_gui_texture);
		this.addRenderableWidget(imagebutton_needle_button_24_gui_texture);
	}
}
