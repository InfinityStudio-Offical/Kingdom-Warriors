package net.mcreator.kingdomwarriors.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.kingdomwarriors.network.KingdomWarriorsModVariables;
import net.mcreator.kingdomwarriors.KingdomWarriorsMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.DEDICATED_SERVER})
public class ServerLoaderProcedure {
	@SubscribeEvent
	public static void init(FMLDedicatedServerSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		KingdomWarriorsMod.LOGGER.info(("Loaded Kingdom Warrior " + KingdomWarriorsModVariables.Mod_Version));
	}
}
