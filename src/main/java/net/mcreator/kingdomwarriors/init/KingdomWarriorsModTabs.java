
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdomwarriors.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class KingdomWarriorsModTabs {
	public static CreativeModeTab TAB_ORES;
	public static CreativeModeTab TAB_SCIENCES;

	public static void load() {
		TAB_ORES = new CreativeModeTab("tabores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KingdomWarriorsModItems.SLIVER_DUST.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_SCIENCES = new CreativeModeTab("tabsciences") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(KingdomWarriorsModItems.GLASS_BREAKER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
