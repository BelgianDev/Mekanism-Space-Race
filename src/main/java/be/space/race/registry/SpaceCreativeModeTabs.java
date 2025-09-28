package be.space.race.registry;

import be.space.race.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class SpaceCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);

    public static final Supplier<CreativeModeTab> SPACE_RACE_ITEMS_TAB = CREATIVE_MODE_TAB.register("space_race_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SpaceItems.SPACE_ROCK.get()))
                    .title(Component.translatable("category.space_race.space_race"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(SpaceItems.SPACE_ROCK);
                        output.accept(SpaceBlocks.DUST_BLOCK);
                        output.accept(SpaceBlocks.LAUNCHPAD_SCAFFOLDING);
                    }).build());

    public static void init(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }
}
