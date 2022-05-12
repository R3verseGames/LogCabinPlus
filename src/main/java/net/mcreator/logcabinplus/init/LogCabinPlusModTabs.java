
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.logcabinplus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LogCabinPlusModTabs {
	public static CreativeModeTab TAB_LOG_CABIN_PLUS_TAB;

	public static void load() {
		TAB_LOG_CABIN_PLUS_TAB = new CreativeModeTab("tablog_cabin_plus_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LogCabinPlusModBlocks.ROUND_OAK_LOG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
