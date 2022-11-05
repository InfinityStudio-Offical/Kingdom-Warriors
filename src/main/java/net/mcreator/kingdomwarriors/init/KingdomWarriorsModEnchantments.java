
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdomwarriors.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.kingdomwarriors.enchantment.SwiftSneakEnchantmentEnchantment;
import net.mcreator.kingdomwarriors.enchantment.SwiftRunEnchantmentEnchantment;
import net.mcreator.kingdomwarriors.KingdomWarriorsMod;

public class KingdomWarriorsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, KingdomWarriorsMod.MODID);
	public static final RegistryObject<Enchantment> SWIFT_SNEAK_ENCHANTMENT = REGISTRY.register("swift_sneak_enchantment",
			() -> new SwiftSneakEnchantmentEnchantment());
	public static final RegistryObject<Enchantment> SWIFT_RUN_ENCHANTMENT = REGISTRY.register("swift_run_enchantment",
			() -> new SwiftRunEnchantmentEnchantment());
}
