
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.celesty.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.celesty.world.inventory.NeedleGUIMenu;
import net.mcreator.celesty.CelestyMod;

public class CelestyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CelestyMod.MODID);
	public static final RegistryObject<MenuType<NeedleGUIMenu>> NEEDLE_GUI = REGISTRY.register("needle_gui", () -> IForgeMenuType.create(NeedleGUIMenu::new));
}
