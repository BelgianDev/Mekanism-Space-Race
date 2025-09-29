package be.space.race;

import mekanism.api.annotations.NothingNullByDefault;
import mekanism.api.text.ILangEntry;
import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;

@NothingNullByDefault
public enum SpaceRaceLang implements ILangEntry {
    LAUNCHPAD_SCAFFOLDING_DESCRIPTION("description", "launchpad_scaffolding");

    private final String key;

    SpaceRaceLang(String key) {
        this.key = key;
    }

    SpaceRaceLang(String type, String key) {
        this(Util.makeDescriptionId(type, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, key)));
    }

    @Override
    public String getTranslationKey() {
        return this.key;
    }
}
