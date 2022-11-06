package net.mcreator.kingdomwarriors.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class IronEnchantmentBootsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		SwiftRunClientProcedure.execute(entity, itemstack);
	}
}
