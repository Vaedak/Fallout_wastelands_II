
package net.mcreator.falloutwastelands.network;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GunReloadKeybindMessage {

	int type, pressedms;

	public GunReloadKeybindMessage(int type, int pressedms) {
		this.type = type;
		this.pressedms = pressedms;
	}

	public GunReloadKeybindMessage(FriendlyByteBuf buffer) {
		this.type = buffer.readInt();
		this.pressedms = buffer.readInt();
	}

	public static void buffer(GunReloadKeybindMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.type);
		buffer.writeInt(message.pressedms);
	}

	public static void handler(GunReloadKeybindMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			pressAction(context.getSender(), message.type, message.pressedms);
		});
		context.setPacketHandled(true);
	}

	public static void pressAction(Player entity, int type, int pressedms) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(entity.blockPosition()))
			return;

		if (type == 0) {

			OnRkeyPressedProcedure.execute();
		}

	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		FalloutWastelandsMod.addNetworkMessage(GunReloadKeybindMessage.class, GunReloadKeybindMessage::buffer, GunReloadKeybindMessage::new, GunReloadKeybindMessage::handler);
	}

}
