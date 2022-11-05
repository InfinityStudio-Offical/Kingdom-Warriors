
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdomwarriors.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.kingdomwarriors.world.inventory.SMixerGUIMenu;
import net.mcreator.kingdomwarriors.world.inventory.CompresserGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KingdomWarriorsModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CompresserGUIMenu> COMPRESSER_GUI = register("compresser_gui",
			(id, inv, extraData) -> new CompresserGUIMenu(id, inv, extraData));
	public static final MenuType<SMixerGUIMenu> S_MIXER_GUI = register("s_mixer_gui", (id, inv, extraData) -> new SMixerGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
