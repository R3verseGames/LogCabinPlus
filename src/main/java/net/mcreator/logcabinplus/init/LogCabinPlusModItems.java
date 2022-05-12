
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.logcabinplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.logcabinplus.LogCabinPlusMod;

public class LogCabinPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LogCabinPlusMod.MODID);
	public static final RegistryObject<Item> ROUND_OAK_LOG = block(LogCabinPlusModBlocks.ROUND_OAK_LOG, LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_DARK_OAK_LOG = block(LogCabinPlusModBlocks.ROUND_DARK_OAK_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_BIRCH_LOG = block(LogCabinPlusModBlocks.ROUND_BIRCH_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_SPRUCE_LOG = block(LogCabinPlusModBlocks.ROUND_SPRUCE_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_JUNGLE_LOG = block(LogCabinPlusModBlocks.ROUND_JUNGLE_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_ACACIA_LOG = block(LogCabinPlusModBlocks.ROUND_ACACIA_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_WARPED_LOG = block(LogCabinPlusModBlocks.ROUND_WARPED_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> ROUND_CRIMSON_LOG = block(LogCabinPlusModBlocks.ROUND_CRIMSON_LOG,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> LOG_WALL_OAK = block(LogCabinPlusModBlocks.LOG_WALL_OAK, LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> LOG_WALL_CORNER_OFFSET_OAK = block(LogCabinPlusModBlocks.LOG_WALL_CORNER_OFFSET_OAK,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_CENTER_CLOSED = block(LogCabinPlusModBlocks.WINDOW_OAK_CENTER_CLOSED,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_CENTER_X = block(LogCabinPlusModBlocks.WINDOW_OAK_CENTER_X,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_TOP = block(LogCabinPlusModBlocks.WINDOW_OAK_TOP, LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_BOTTOM = block(LogCabinPlusModBlocks.WINDOW_OAK_BOTTOM,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_RIGHT = block(LogCabinPlusModBlocks.WINDOW_OAK_RIGHT,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_T_BOTTOM = block(LogCabinPlusModBlocks.WINDOW_T_BOTTOM,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_T_TOP = block(LogCabinPlusModBlocks.WINDOW_T_TOP, LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_TOP_RIGHT = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_TOP_RIGHT,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_BOTTOM_RIGHT = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_BOTTOM_RIGHT,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_CENTER = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_CENTER,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_TOP_CENTER = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_TOP_CENTER,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_BOTTOM_CENTER = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_BOTTOM_CENTER,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);
	public static final RegistryObject<Item> WINDOW_OAK_LARGE_RIGHT_CENTER = block(LogCabinPlusModBlocks.WINDOW_OAK_LARGE_RIGHT_CENTER,
			LogCabinPlusModTabs.TAB_LOG_CABIN_PLUS_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
