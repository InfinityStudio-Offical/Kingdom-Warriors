
package net.mcreator.kingdomwarriors.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.kingdomwarriors.init.KingdomWarriorsModTabs;

import java.util.List;

public class SoildWithCurshedIronoreBottleItem extends Item {
	public SoildWithCurshedIronoreBottleItem() {
		super(new Item.Properties().tab(KingdomWarriorsModTabs.TAB_SCIENCES).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Used to store \u00A78Soild Blocks\u00A7r."));
	}
}
