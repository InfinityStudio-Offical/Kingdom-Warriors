
package net.mcreator.kingdomwarriors.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModTabs;

public class EletricalIngotItem extends Item {
	public EletricalIngotItem() {
		super(new Item.Properties().tab(KingdomWarriorsModTabs.TAB_ORES).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
