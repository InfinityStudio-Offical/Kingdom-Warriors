package net.mcreator.kingdomwarriors.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModEnchantments;

public class SwiftRunClientProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_RUN_ENCHANTMENT.get(), itemstack) != 0) {
			if (entity.isSprinting()) {
				if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_RUN_ENCHANTMENT.get(), itemstack) == 1) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 1, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_RUN_ENCHANTMENT.get(), itemstack) == 2) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 2, (false), (false)));
				} else if (EnchantmentHelper.getItemEnchantmentLevel(KingdomWarriorsModEnchantments.SWIFT_RUN_ENCHANTMENT.get(), itemstack) == 3) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 3, (false), (false)));
				}
			}
		}
	}
}
