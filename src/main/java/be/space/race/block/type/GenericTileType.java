package be.space.race.block.type;

import mekanism.api.text.ILangEntry;
import mekanism.common.content.blocktype.BlockTypeTile;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.base.TileEntityMekanism;

import java.util.function.Supplier;

public class GenericTileType<T extends TileEntityMekanism> extends BlockTypeTile<T> {
    public GenericTileType(Supplier<TileEntityTypeRegistryObject<T>> tileEntityRegistrar, ILangEntry description) {
        super(tileEntityRegistrar, description);
    }

    public static class GenericBuilder<GENERIC extends GenericTileType<TILE>, TILE extends TileEntityMekanism, T extends GenericBuilder<GENERIC, TILE, T>> extends BlockTileBuilder<GENERIC, TILE, T> {

        protected GenericBuilder(GENERIC holder) {
            super(holder);
        }

        public static <TILE extends TileEntityMekanism> GenericBuilder<GenericTileType<TILE>, TILE, ?> createGeneric(Supplier<TileEntityTypeRegistryObject<TILE>> tileEntityRegistrar,
                                                                                                                     ILangEntry description) {
            return new GenericBuilder<>(new GenericTileType<>(tileEntityRegistrar, description));
        }
    }
}
