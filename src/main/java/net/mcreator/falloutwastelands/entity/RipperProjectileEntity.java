
package net.mcreator.falloutwastelands.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.falloutwastelands.procedures.DespawnRipperProjectileProcedure;
import net.mcreator.falloutwastelands.procedures.DeleteAtShortRangeProcedure;
import net.mcreator.falloutwastelands.init.FalloutWastelandsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RipperProjectileEntity extends AbstractArrow implements ItemSupplier {
	public RipperProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(FalloutWastelandsModEntities.RIPPER_PROJECTILE.get(), world);
	}

	public RipperProjectileEntity(EntityType<? extends RipperProjectileEntity> type, Level world) {
		super(type, world);
	}

	public RipperProjectileEntity(EntityType<? extends RipperProjectileEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RipperProjectileEntity(EntityType<? extends RipperProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		DespawnRipperProjectileProcedure.execute(entityHitResult.getEntity(), this);
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		DespawnRipperProjectileProcedure.execute(this.getOwner(), this);
	}

	@Override
	public void tick() {
		super.tick();
		DeleteAtShortRangeProcedure.execute(this);
		if (this.inGround)
			this.discard();
	}

	public static RipperProjectileEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RipperProjectileEntity entityarrow = new RipperProjectileEntity(FalloutWastelandsModEntities.RIPPER_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static RipperProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		RipperProjectileEntity entityarrow = new RipperProjectileEntity(FalloutWastelandsModEntities.RIPPER_PROJECTILE.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(15);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		return entityarrow;
	}
}
