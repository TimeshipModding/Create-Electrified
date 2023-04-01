package com.example.createlectrified.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class RodBlock extends DirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public RodBlock(Properties properties) {
        super(properties);
    }

    public static final VoxelShape X_AXIS =
            Block.box(0, 7, 7, 16, 9, 9);
    public static final VoxelShape Y_AXIS =
            Block.box(7, 0, 7, 9, 16, 9);
    public static final VoxelShape Z_AXIS =
            Block.box(7, 7, 0, 9, 9, 16);

    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING).getAxis()) {
            case X:
            default:
                return X_AXIS;
            case Y:
                return Y_AXIS;
            case Z:
                return Z_AXIS;
        }
    }

    // Facing

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getNearestLookingDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> Builder) {
        Builder.add(FACING);
    }
}
