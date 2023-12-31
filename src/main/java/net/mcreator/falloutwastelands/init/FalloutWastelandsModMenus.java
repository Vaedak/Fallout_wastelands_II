
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.falloutwastelands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.falloutwastelands.world.inventory.LockerStorageMenu;
import net.mcreator.falloutwastelands.FalloutWastelandsMod;

public class FalloutWastelandsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, FalloutWastelandsMod.MODID);
	public static final RegistryObject<MenuType<LockerStorageMenu>> LOCKER_STORAGE = REGISTRY.register("locker_storage", () -> IForgeMenuType.create(LockerStorageMenu::new));
}
