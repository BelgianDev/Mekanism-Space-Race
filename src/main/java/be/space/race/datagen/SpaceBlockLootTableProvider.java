package be.space.race.datagen;

import be.space.race.registry.SpaceBlocks;
import be.space.race.registry.SpaceItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Set;

public class SpaceBlockLootTableProvider extends BlockLootSubProvider {


    protected SpaceBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(SpaceBlocks.DUST_BLOCK.get());

        add(SpaceBlocks.DUST_BLOCK.get(),
                block -> createOreDrop(SpaceBlocks.DUST_BLOCK.get(), SpaceItems.SPACE_ROCK.get()));
    }

    protected LootTable.Builder

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return SpaceBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
