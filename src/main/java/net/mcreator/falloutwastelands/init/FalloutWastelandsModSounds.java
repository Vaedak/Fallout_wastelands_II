
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FalloutWastelandsMod.MODID);
	public static final RegistryObject<SoundEvent> PISTOL32FIRING = REGISTRY.register("pistol32firing", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fallout_wastelands_", "pistol32firing")));
}
