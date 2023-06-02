package com.timeshipmodding.createlectrified.content.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.awt.*;

public class CopperCableBlock extends DirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public CopperCableBlock(Properties properties) {
        super(properties);
    }

    private static final VoxelShape X_AXIS =
            Block.box(0, 6, 6, 16, 10, 10);
    private static final VoxelShape Y_AXIS =
            Block.box(6, 0, 6, 10, 16, 10);
    private static final VoxelShape Z_AXIS =
            Block.box(6, 6, 0, 10, 10, 16);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return switch (pState.getValue(FACING).getAxis()) {
            case X -> X_AXIS;
            case Y -> Y_AXIS;
            case Z -> Z_AXIS;
        };
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
