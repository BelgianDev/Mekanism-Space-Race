package be.space.race.tile;

import be.space.race.block.multiblock.launchpad.LaunchpadMultiblockData;
import be.space.race.registry.SpaceBlocks;
import mekanism.common.lib.multiblock.MultiblockManager;
import mekanism.common.tile.prefab.TileEntityMultiblock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LaunchpadControllerTileEntity extends TileEntityMultiblock<LaunchpadMultiblockData> {
    public LaunchpadControllerTileEntity(BlockPos pos, BlockState state) {
        this(SpaceBlocks.LAUNCHPAD_CONTROLLER, pos, state);
    }

    public LaunchpadControllerTileEntity(Holder<Block> blockProvider, BlockPos pos, BlockState state) {
        super(blockProvider, pos, state);
    }

    @Override
    public LaunchpadMultiblockData createMultiblock() {
        return new LaunchpadMultiblockData(this);
    }

    @Override
    public MultiblockManager<LaunchpadMultiblockData> getManager() {
        return LaunchpadMultiblockData.MANAGER;
    }
}
