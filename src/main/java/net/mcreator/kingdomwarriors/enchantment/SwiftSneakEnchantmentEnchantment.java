
package net.mcreator.kingdomwarriors.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModItems;

import java.util.List;

public class SwiftSneakEnchantmentEnchantment extends Enchantment {
	public SwiftSneakEnchantmentEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.ARMOR_FEET, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(KingdomWarriorsModItems.DIAMONDS_BOOTS.get(), KingdomWarriorsModItems.NETHERITHES_BOOTS.get()).contains(item);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
