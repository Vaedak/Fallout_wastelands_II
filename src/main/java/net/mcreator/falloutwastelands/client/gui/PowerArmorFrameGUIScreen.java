package net.mcreator.falloutwastelands.client.gui;

public class PowerArmorFrameGUIScreen extends AbstractContainerScreen<PowerArmorFrameGUIMenu> {

	private final static HashMap<String, Object> guistate = PowerArmorFrameGUIMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_pickup;

	public PowerArmorFrameGUIScreen(PowerArmorFrameGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("fallout_wastelands_:textures/screens/power_armor_frame_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		if (

		HelperProcedureGetFrameEntityProcedure.execute()

		instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 46, this.topPos + 68, 30, 0f, 0, livingEntity);
		}

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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_pickup = Button.builder(Component.translatable("gui.fallout_wastelands_.power_armor_frame_gui.button_pickup"), e -> {
			if (true) {
				FalloutWastelandsMod.PACKET_HANDLER.sendToServer(new PowerArmorFrameGUIButtonMessage(0, x, y, z));
				PowerArmorFrameGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 158, this.topPos + 59, 56, 20).build();

		guistate.put("button:button_pickup", button_pickup);
		this.addRenderableWidget(button_pickup);

	}

}