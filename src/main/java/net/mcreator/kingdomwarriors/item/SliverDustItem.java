
package net.mcreator.kingdomwarriors.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModTabs;

public class SliverDustItem extends Item {
	public SliverDustItem() {
		super(new Item.Properties().tab(KingdomWarriorsModTabs.TAB_ORES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
