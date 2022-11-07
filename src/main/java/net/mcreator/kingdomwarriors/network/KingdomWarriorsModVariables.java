package net.mcreator.kingdomwarriors.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KingdomWarriorsModVariables {
	public static String Mod_Version = "1.0.0-PR4";

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
