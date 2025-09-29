package be.space.race.datagen;

import be.space.race.Constants;
import be.space.race.registry.SpaceItems;
import be.space.race.util.SpaceTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class SpaceItemTagProvider extends ItemTagsProvider {
    public SpaceItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(SpaceTags.Items.TRANSFORMABLE_ITEMS)
                .add(SpaceItems.SPACE_ROCK.get());
    }
}
