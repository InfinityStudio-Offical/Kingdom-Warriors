
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdomwarriors.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.kingdomwarriors.client.gui.SMixerGUIScreen;
import net.mcreator.kingdomwarriors.client.gui.CompresserGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KingdomWarriorsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KingdomWarriorsModMenus.COMPRESSER_GUI, CompresserGUIScreen::new);
			MenuScreens.register(KingdomWarriorsModMenus.S_MIXER_GUI, SMixerGUIScreen::new);
		});
	}
}
