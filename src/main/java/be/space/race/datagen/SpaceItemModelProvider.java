package be.space.race.datagen;

import be.space.race.Constants;
import be.space.race.registry.SpaceItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class SpaceItemModelProvider extends ItemModelProvider {
    public SpaceItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(SpaceItems.TEST_ITEM.get());
    }
}
