package be.space.race.registry;

import be.space.race.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class SpaceBlocks {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
