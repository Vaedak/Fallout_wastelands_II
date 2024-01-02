
package net.mcreator.falloutwastelands.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BaseGunItemEntity extends AbstractArrow implements ItemSupplier {
	public BaseGunItemEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(FalloutWastelandsModEntities.BASE_GUN_ITEM.get(), world);
	}

	public BaseGunItemEntity(EntityType<? extends BaseGunItemEntity> type, Level world) {
		super(type, world);
	}

	public BaseGunItemEntity(EntityType<? extends BaseGunItemEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BaseGunItemEntity(EntityType<? extends BaseGunItemEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.SUSPICIOUS_GRAVEL);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		GunProjectileHitsBlockProcedure.execute();
	}

	@Override
	public void tick() {
		super.tick();
		WhileProjectileFlyingTickProcedure.execute();
		if (this.inGround)
			this.discard();
	}

	public static BaseGunItemEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		BaseGunItemEntity entityarrow = new BaseGunItemEntity(FalloutWastelandsModEntities.BASE_GUN_ITEM.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static BaseGunItemEntity shoot(LivingEntity entity, LivingEntity target) {
		BaseGunItemEntity entityarrow = new BaseGunItemEntity(FalloutWastelandsModEntities.BASE_GUN_ITEM.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 0.1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
