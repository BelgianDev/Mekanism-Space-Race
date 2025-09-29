package be.space.race.block.multiblock.launchpad;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import mekanism.common.lib.math.voxel.IShape;
import mekanism.common.lib.multiblock.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.ChunkAccess;

public class LaunchpadValidator implements IStructureValidator<LaunchpadMultiblockData> {

    @Override
    public void init(Level world, MultiblockManager<LaunchpadMultiblockData> manager, Structure structure) {

    }

    @Override
    public boolean precheck() {
        return false;
    }

    @Override
    public FormationProtocol.FormationResult validate(FormationProtocol<LaunchpadMultiblockData> ctx, Long2ObjectMap<ChunkAccess> chunkMap) {
        return FormationProtocol.FormationResult.fail(Component.literal("No yet implemented."));
    }

    @Override
    public FormationProtocol.FormationResult postcheck(LaunchpadMultiblockData structure, Long2ObjectMap<ChunkAccess> chunkMap) {
        return FormationProtocol.FormationResult.fail(Component.literal("No yet implemented."));
    }

    @Override
    public IShape getShape() {
        return null;
    }
}
