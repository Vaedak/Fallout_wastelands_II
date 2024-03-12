package net.mcreator.falloutwastelands.client.gui;

public class BASEMenuUIScreen extends AbstractContainerScreen<BASEMenuUIMenu> {

	private final static HashMap<String, Object> guistate = BASEMenuUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox NameInput;

	ImageButton imagebutton_locker_storage;
	ImageButton imagebutton_buttonplaceholdertexture;
	ImageButton imagebutton_buttonplaceholdertexture1;
	ImageButton imagebutton_buttonplaceholdertexture2;

	public BASEMenuUIScreen(BASEMenuUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		NameInput.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		if (NameInput.isFocused())
			return NameInput.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		NameInput.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_inventory"), 65, 56, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_empty"), -121, -26, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_d"), -89, -16, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done"), 67, 73, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done1"), -84, 43, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_done2"), -83, 106, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_caps"), -83, 70, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_input_caps"), -92, 88, -3368704, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.fallout_wastelands_.base_menu_ui.label_caps_expense"), -92, 133, -6750208, false);
		guiGraphics.drawString(this.font,

				BASEMenuUIWhileThisGUIIsOpenTickProcedure.execute(), -92, -2, -16724992, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		NameInput = new EditBox(this.font, this.leftPos + -101, this.topPos + 16, 120, 20, Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput")) {
			{
				setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);

				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.fallout_wastelands_.base_menu_ui.NameInput").getString());
				else
					setSuggestion(null);
			}
		};
		NameInput.setMaxLength(32767);

		guistate.put("text:NameInput", NameInput);
		this.addWidget(this.NameInput);

		imagebutton_locker_storage = new ImageButton(this.leftPos + 109, this.topPos + 52, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_locker_storage.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(0, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});

		guistate.put("button:imagebutton_locker_storage", imagebutton_locker_storage);
		this.addRenderableWidget(imagebutton_locker_storage);

		imagebutton_buttonplaceholdertexture = new ImageButton(this.leftPos + 94, this.topPos + 70, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(1, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});

		guistate.put("button:imagebutton_buttonplaceholdertexture", imagebutton_buttonplaceholdertexture);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture);

		imagebutton_buttonplaceholdertexture1 = new ImageButton(this.leftPos + -59, this.topPos + 40, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture1.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(2, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});

		guistate.put("button:imagebutton_buttonplaceholdertexture1", imagebutton_buttonplaceholdertexture1);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture1);

		imagebutton_buttonplaceholdertexture2 = new ImageButton(this.leftPos + -56, this.topPos + 106, 16, 16, 0, 0, 16, new ResourceLocation("fallout_wastelands_:textures/screens/atlas/imagebutton_buttonplaceholdertexture2.png"), 16, 32, e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new BASEMenuUIButtonMessage(3, x, y, z));
				BASEMenuUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});

		guistate.put("button:imagebutton_buttonplaceholdertexture2", imagebutton_buttonplaceholdertexture2);
		this.addRenderableWidget(imagebutton_buttonplaceholdertexture2);

	}

}
