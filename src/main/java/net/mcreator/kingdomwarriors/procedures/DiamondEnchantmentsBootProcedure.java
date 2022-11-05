package net.mcreator.kingdomwarriors.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class DiamondEnchantmentsBootProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		SwiftSneakClientProcedure.execute(world, entity, itemstack);
	}
}
