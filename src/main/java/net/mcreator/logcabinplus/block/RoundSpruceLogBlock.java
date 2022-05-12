
package net.mcreator.logcabinplus.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.logcabinplus.init.LogCabinPlusModBlocks;

import java.util.List;
import java.util.Collections;

public class RoundSpruceLogBlock extends Block {
	public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

	public RoundSpruceLogBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(AXIS, Direction.Axis.Y));
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		Vec3 offset = state.getOffset(world, pos);
		switch ((Direction.Axis) state.getValue(AXIS)) {
			case X :
				return Shapes.or(box(0, 5, 0, 16, 11, 1), box(0, 3, 1, 16, 13, 2), box(0, 2, 2, 16, 14, 3), box(0, 1, 3, 16, 15, 5),
						box(0, 0, 5, 16, 16, 11), box(0, 1, 11, 16, 15, 13), box(0, 2, 13, 16, 14, 14), box(0, 3, 14, 16, 13, 15),
						box(0, 5, 15, 16, 11, 16)).move(offset.x, offset.y, offset.z);
			case Y :
			default :
				return Shapes.or(box(0, 0, 5, 1, 16, 11), box(1, 0, 3, 2, 16, 13), box(2, 0, 2, 3, 16, 14), box(3, 0, 1, 5, 16, 15),
						box(5, 0, 0, 11, 16, 16), box(11, 0, 1, 13, 16, 15), box(13, 0, 2, 14, 16, 14), box(14, 0, 3, 15, 16, 13),
						box(15, 0, 5, 16, 16, 11)).move(offset.x, offset.y, offset.z);
			case Z :
				return Shapes.or(box(0, 5, 0, 1, 11, 16), box(1, 3, 0, 2, 13, 16), box(2, 2, 0, 3, 14, 16), box(3, 1, 0, 5, 15, 16),
						box(5, 0, 0, 11, 16, 16), box(11, 1, 0, 13, 15, 16), box(13, 2, 0, 14, 14, 16), box(14, 3, 0, 15, 13, 16),
						box(15, 5, 0, 16, 11, 16)).move(offset.x, offset.y, offset.z);
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(AXIS);
	}

	@Override
	public BlockState rotate(BlockState state, Rotation rot) {
		if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
			if ((Direction.Axis) state.getValue(AXIS) == Direction.Axis.X) {
				return state.setValue(AXIS, Direction.Axis.Z);
			} else if ((Direction.Axis) state.getValue(AXIS) == Direction.Axis.Z) {
				return state.setValue(AXIS, Direction.Axis.X);
			}
		}
		return state;
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		Direction.Axis axis = context.getClickedFace().getAxis();;
		return this.defaultBlockState().setValue(AXIS, axis);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(LogCabinPlusModBlocks.ROUND_SPRUCE_LOG.get(), renderType -> renderType == RenderType.cutout());
	}
}
