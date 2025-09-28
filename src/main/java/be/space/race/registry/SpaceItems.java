package be.space.race.registry;

import be.space.race.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class SpaceItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);



    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }
}
