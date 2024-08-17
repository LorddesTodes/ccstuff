package net.leon.ccstuff.block.entity;

import net.leon.ccstuff.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;


public class ModBlockEntities extends BlockEntity {

    public ModBlockEntities(BlockPos pos, BlockState state) {
        super(ModBlocks.TELEPORTER_BLOCK.get(), pos, state);
    }

    public ModBlockEntities(BlockEntityType<?> pType, BlockPos pPos, BlockState pBlockState) {
        super(pType, pPos, pBlockState);
    }
}
