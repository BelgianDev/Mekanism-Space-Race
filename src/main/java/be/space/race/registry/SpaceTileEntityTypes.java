package be.space.race.registry;

import be.space.race.Constants;
import be.space.race.tile.LaunchpadScaffoldingTileEntity;
import mekanism.common.registration.impl.TileEntityTypeDeferredRegister;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import net.neoforged.bus.api.IEventBus;

public final class SpaceTileEntityTypes {
    private static final TileEntityTypeDeferredRegister TILE_ENTITY_TYPES = new TileEntityTypeDeferredRegister(Constants.MOD_ID);

    public static final TileEntityTypeRegistryObject<LaunchpadScaffoldingTileEntity> LAUNCHPAD_SCAFFOLDING_TILE_ENTITY = TILE_ENTITY_TYPES
            .mekBuilder(SpaceBlocks.LAUNCHPAD_SCAFFOLDING, LaunchpadScaffoldingTileEntity::new).build();

    public static void init(IEventBus bus) {
        TILE_ENTITY_TYPES.register(bus);
    }
}
