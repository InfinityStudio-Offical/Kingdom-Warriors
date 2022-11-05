package net.mcreator.kingdomwarriors.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModEnchantments;

public class SwiftSneakClientProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("kingdom_warriors:dark_city")))) {
			if (entity.isShiftKeyDown()
					&& EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 5, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) == 2) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 10, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) == 3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 15, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) == 4) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 20, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_SNEAK_ENCHANTMENT.get(), itemstack) == 5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 25, (false), (false)));
				}
			}
		}
	}
}
