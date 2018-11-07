package ru.skidrowapi.eventlogger.map;

import ru.skidrowapi.eventlogger.EventLogger;

import java.util.HashMap;
import java.util.Map;

public class MapBlock {
    public MapBlock(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;
    private static Map<String, Boolean> eventblock = new HashMap<>();

    public static Map<String, Boolean> getMapBlock() {
        return eventblock;
    }

    public void MapBlock() {
        eventblock.put("BlockBreakEvent", false);
        eventblock.put("BlockBurnEvent", false);
        eventblock.put("BlockCanBuildEvent", false);
        eventblock.put("BlockDamageEvent", false);
        eventblock.put("BlockDispenseEvent", false);
        eventblock.put("BlockExpEvent", false);
        eventblock.put("BlockFadeEvent", false);
        eventblock.put("BlockFormEvent", false);
        eventblock.put("BlockFromToEvent", false);
        eventblock.put("BlockGrowEvent", false);
        eventblock.put("BlockIgniteEvent", false);
        eventblock.put("BlockPhysicsEvent", false);
        eventblock.put("BlockPistonEvent", false);
        eventblock.put("BlockPistonExtendEvent", false);
        eventblock.put("BlockPistonRetractEvent", false);
        eventblock.put("BlockPlaceEvent", false);
        eventblock.put("BlockRedstoneEvent", false);
        eventblock.put("BlockSpreadEvent", false);
        eventblock.put("EntityBlockFormEvent", false);
        eventblock.put("LeavesDecayEvent", false);
        eventblock.put("NotePlayEvent", false);
        eventblock.put("SignChangeEvent", false);
        eventblock.put("BlockMultiPlaceEvent", false);
    }
}
