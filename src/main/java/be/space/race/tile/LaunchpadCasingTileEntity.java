package be.space.race.tile;

import be.space.race.block.multiblock.launchpad.LaunchpadMultiblockData;
import be.space.race.registry.SpaceBlocks;
import mekanism.common.lib.multiblock.MultiblockManager;
import mekanism.common.tile.prefab.TileEntityMultiblock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class LaunchpadCasingTileEntity extends TileEntityMultiblock<LaunchpadMultiblockData> {
    public LaunchpadCasingTileEntity(BlockPos pos, BlockState state) {
        this(SpaceBlocks.LAUNCHPAD_CASING, pos, state);
    }

    public LaunchpadCasingTileEntity(Holder<Block> blockProvider, BlockPos pos, BlockState state) {
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

    @Override
    public boolean canBeMaster() {
        return false;
    }
}
