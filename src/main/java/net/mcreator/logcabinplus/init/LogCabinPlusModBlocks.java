
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.logcabinplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.logcabinplus.block.WindowTTopBlock;
import net.mcreator.logcabinplus.block.WindowTBottomBlock;
import net.mcreator.logcabinplus.block.WindowOakTopBlock;
import net.mcreator.logcabinplus.block.WindowOakRightBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeTopRightBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeTopCenterBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeRightCenterBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeCenterBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeBottomRightBlock;
import net.mcreator.logcabinplus.block.WindowOakLargeBottomCenterBlock;
import net.mcreator.logcabinplus.block.WindowOakCenterXBlock;
import net.mcreator.logcabinplus.block.WindowOakCenterClosedBlock;
import net.mcreator.logcabinplus.block.WindowOakBottomBlock;
import net.mcreator.logcabinplus.block.RoundWarpedLogBlock;
import net.mcreator.logcabinplus.block.RoundSpruceLogBlock;
import net.mcreator.logcabinplus.block.RoundOakLogBlock;
import net.mcreator.logcabinplus.block.RoundJungleLogBlock;
import net.mcreator.logcabinplus.block.RoundDarkOakLogBlock;
import net.mcreator.logcabinplus.block.RoundCrimsonLogBlock;
import net.mcreator.logcabinplus.block.RoundBirchLogBlock;
import net.mcreator.logcabinplus.block.RoundAcaciaLogBlock;
import net.mcreator.logcabinplus.block.LogWallOakBlock;
import net.mcreator.logcabinplus.block.LogWallCornerOffsetOakBlock;
import net.mcreator.logcabinplus.LogCabinPlusMod;

public class LogCabinPlusModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LogCabinPlusMod.MODID);
	public static final RegistryObject<Block> ROUND_OAK_LOG = REGISTRY.register("round_oak_log", () -> new RoundOakLogBlock());
	public static final RegistryObject<Block> ROUND_DARK_OAK_LOG = REGISTRY.register("round_dark_oak_log", () -> new RoundDarkOakLogBlock());
	public static final RegistryObject<Block> ROUND_BIRCH_LOG = REGISTRY.register("round_birch_log", () -> new RoundBirchLogBlock());
	public static final RegistryObject<Block> ROUND_SPRUCE_LOG = REGISTRY.register("round_spruce_log", () -> new RoundSpruceLogBlock());
	public static final RegistryObject<Block> ROUND_JUNGLE_LOG = REGISTRY.register("round_jungle_log", () -> new RoundJungleLogBlock());
	public static final RegistryObject<Block> ROUND_ACACIA_LOG = REGISTRY.register("round_acacia_log", () -> new RoundAcaciaLogBlock());
	public static final RegistryObject<Block> ROUND_WARPED_LOG = REGISTRY.register("round_warped_log", () -> new RoundWarpedLogBlock());
	public static final RegistryObject<Block> ROUND_CRIMSON_LOG = REGISTRY.register("round_crimson_log", () -> new RoundCrimsonLogBlock());
	public static final RegistryObject<Block> LOG_WALL_OAK = REGISTRY.register("log_wall_oak", () -> new LogWallOakBlock());
	public static final RegistryObject<Block> LOG_WALL_CORNER_OFFSET_OAK = REGISTRY.register("log_wall_corner_offset_oak",
			() -> new LogWallCornerOffsetOakBlock());
	public static final RegistryObject<Block> WINDOW_OAK_CENTER_CLOSED = REGISTRY.register("window_oak_center_closed",
			() -> new WindowOakCenterClosedBlock());
	public static final RegistryObject<Block> WINDOW_OAK_CENTER_X = REGISTRY.register("window_oak_center_x", () -> new WindowOakCenterXBlock());
	public static final RegistryObject<Block> WINDOW_OAK_TOP = REGISTRY.register("window_oak_top", () -> new WindowOakTopBlock());
	public static final RegistryObject<Block> WINDOW_OAK_BOTTOM = REGISTRY.register("window_oak_bottom", () -> new WindowOakBottomBlock());
	public static final RegistryObject<Block> WINDOW_OAK_RIGHT = REGISTRY.register("window_oak_right", () -> new WindowOakRightBlock());
	public static final RegistryObject<Block> WINDOW_T_BOTTOM = REGISTRY.register("window_t_bottom", () -> new WindowTBottomBlock());
	public static final RegistryObject<Block> WINDOW_T_TOP = REGISTRY.register("window_t_top", () -> new WindowTTopBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_TOP_RIGHT = REGISTRY.register("window_oak_large_top_right",
			() -> new WindowOakLargeTopRightBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_BOTTOM_RIGHT = REGISTRY.register("window_oak_large_bottom_right",
			() -> new WindowOakLargeBottomRightBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_CENTER = REGISTRY.register("window_oak_large_center",
			() -> new WindowOakLargeCenterBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_TOP_CENTER = REGISTRY.register("window_oak_large_top_center",
			() -> new WindowOakLargeTopCenterBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_BOTTOM_CENTER = REGISTRY.register("window_oak_large_bottom_center",
			() -> new WindowOakLargeBottomCenterBlock());
	public static final RegistryObject<Block> WINDOW_OAK_LARGE_RIGHT_CENTER = REGISTRY.register("window_oak_large_right_center",
			() -> new WindowOakLargeRightCenterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RoundOakLogBlock.registerRenderLayer();
			RoundDarkOakLogBlock.registerRenderLayer();
			RoundBirchLogBlock.registerRenderLayer();
			RoundSpruceLogBlock.registerRenderLayer();
			RoundJungleLogBlock.registerRenderLayer();
			RoundAcaciaLogBlock.registerRenderLayer();
			RoundWarpedLogBlock.registerRenderLayer();
			RoundCrimsonLogBlock.registerRenderLayer();
			LogWallOakBlock.registerRenderLayer();
			LogWallCornerOffsetOakBlock.registerRenderLayer();
			WindowOakCenterClosedBlock.registerRenderLayer();
			WindowOakCenterXBlock.registerRenderLayer();
			WindowOakTopBlock.registerRenderLayer();
			WindowOakBottomBlock.registerRenderLayer();
			WindowOakRightBlock.registerRenderLayer();
			WindowTBottomBlock.registerRenderLayer();
			WindowTTopBlock.registerRenderLayer();
			WindowOakLargeTopRightBlock.registerRenderLayer();
			WindowOakLargeBottomRightBlock.registerRenderLayer();
			WindowOakLargeCenterBlock.registerRenderLayer();
			WindowOakLargeTopCenterBlock.registerRenderLayer();
			WindowOakLargeBottomCenterBlock.registerRenderLayer();
			WindowOakLargeRightCenterBlock.registerRenderLayer();
		}
	}
}
