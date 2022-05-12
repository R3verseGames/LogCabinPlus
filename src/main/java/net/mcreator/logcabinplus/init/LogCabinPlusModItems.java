
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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
