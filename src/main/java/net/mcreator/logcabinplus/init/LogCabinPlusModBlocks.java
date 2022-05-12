
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
		}
	}
}
