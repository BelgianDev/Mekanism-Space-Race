package be.space.race.datagen;

import be.space.race.registry.SpaceBlocks;
import be.space.race.registry.SpaceItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class SpaceRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SpaceRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SpaceItems.TEST_ITEM.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', SpaceBlocks.MOON_DUST.get())
                .unlockedBy("has_dust_block", has(SpaceBlocks.MOON_DUST)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, SpaceBlocks.MOON_DUST.get(), 1)
                .requires(SpaceItems.TEST_ITEM)
                .unlockedBy("has_space_rock", has(SpaceItems.TEST_ITEM)).save(recipeOutput);
    }
}
