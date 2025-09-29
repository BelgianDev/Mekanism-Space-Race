package be.space.race.registry;

import be.space.race.SpaceRaceLang;
import be.space.race.block.type.GenericTileType;
import be.space.race.tile.LaunchpadScaffoldingTileEntity;

public final class SpaceBlockTypes {

    public static final GenericTileType<LaunchpadScaffoldingTileEntity> LAUNCHPAD_SCAFFOLDING = GenericTileType.GenericBuilder
            .createGeneric(() -> SpaceTileEntityTypes.LAUNCHPAD_SCAFFOLDING_TILE_ENTITY, SpaceRaceLang.LAUNCHPAD_SCAFFOLDING_DESCRIPTION)
            .build();
            
}
