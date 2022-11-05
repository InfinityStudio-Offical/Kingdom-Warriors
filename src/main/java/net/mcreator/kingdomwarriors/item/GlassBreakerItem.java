
package net.mcreator.kingdomwarriors.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModTabs;

public class GlassBreakerItem extends Item {
	public GlassBreakerItem() {
		super(new Item.Properties().tab(KingdomWarriorsModTabs.TAB_SCIENCES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
