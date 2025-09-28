package be.space.race;

import be.space.race.registry.SpaceBlocks;
import be.space.race.registry.SpaceItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(Constants.MOD_ID)
public final class MekanismSpaceRace {
    public MekanismSpaceRace(IEventBus bus, ModContainer modContainer) {
        SpaceBlocks.init(bus);
        SpaceItems.init(bus);
    }
}
