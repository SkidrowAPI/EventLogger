package ru.skidrowapi.eventlogger.map;

import ru.skidrowapi.eventlogger.EventLogger;

import java.util.HashMap;
import java.util.Map;

public class MapEvent {
    public MapEvent(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;
    private static Map<String, Boolean> event = new HashMap<>();

    public static Map<String, Boolean> getMapEvent() {
        return event;
    }

    public void MapEvent() {
        event.put("BlockBreakEvent", false);
        event.put("BlockBurnEvent", false);
        event.put("BlockCanBuildEvent", false);
        event.put("BlockDamageEvent", false);
        event.put("BlockDispenseEvent", false);
        event.put("BlockExpEvent", false);
        event.put("BlockFadeEvent", false);
        event.put("BlockFormEvent", false);
        event.put("BlockFromToEvent", false);
        event.put("BlockGrowEvent", false);
        event.put("BlockIgniteEvent", false);
        event.put("BlockPhysicsEvent", false);
        event.put("BlockPistonEvent", false);
        event.put("BlockPistonExtendEvent", false);
        event.put("BlockPistonRetractEvent", false);
        event.put("BlockPlaceEvent", false);
        event.put("BlockRedstoneEvent", false);
        event.put("BlockSpreadEvent", false);
        event.put("EntityBlockFormEvent", false);
        event.put("LeavesDecayEvent", false);
        event.put("NotePlayEvent", false);
        event.put("SignChangeEvent", false);
        event.put("BlockMultiPlaceEvent", false);
        //------------------------------------------------------\\
        event.put("CreatureSpawnEvent", false);
        event.put("CreeperPowerEvent", false);
        event.put("EntityBreakDoorEvent", false);
        event.put("EntityChangeBlockEvent", false);
        event.put("EntityCombustByBlockEvent", false);
        event.put("EntityCombustByEntityEvent", false);
        event.put("EntityCombustEvent", false);

    }
}
