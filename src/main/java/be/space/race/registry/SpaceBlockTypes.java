package be.space.race.registry;

import be.space.race.SpaceRaceLang;
import be.space.race.tile.LaunchpadScaffoldingTileEntity;
import mekanism.common.content.blocktype.BlockTypeTile;

public final class SpaceBlockTypes {
    public static final BlockTypeTile<LaunchpadScaffoldingTileEntity> LAUNCHPAD_SCAFFOLDING = BlockTypeTile.BlockTileBuilder
            .createBlock(() -> SpaceTileEntityTypes.LAUNCHPAD_SCAFFOLDING_TILE_ENTITY, SpaceRaceLang.LAUNCHPAD_SCAFFOLDING_DESCRIPTION)
            .externalMultiblock()
            .build();


}
