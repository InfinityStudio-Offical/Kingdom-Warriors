package net.mcreator.kingdomwarriors.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class NetheriteEnchantmentBootsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		SwiftSneakClientProcedure.execute(entity, itemstack);
		SwiftRunClientProcedure.execute(entity, itemstack);
	}
}
