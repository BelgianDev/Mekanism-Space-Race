package be.space.race.block.multiblock.launchpad;

import mekanism.common.lib.multiblock.MultiblockData;
import mekanism.common.lib.multiblock.MultiblockManager;
import net.minecraft.world.level.block.entity.BlockEntity;

public final class LaunchpadMultiblockData extends MultiblockData {
    public static final MultiblockManager<LaunchpadMultiblockData> MANAGER = new MultiblockManager<>("launchpad", LaunchpadCache::new, LaunchpadValidator::new);

    public LaunchpadMultiblockData(BlockEntity tile) {
        super(tile);
    }
}
