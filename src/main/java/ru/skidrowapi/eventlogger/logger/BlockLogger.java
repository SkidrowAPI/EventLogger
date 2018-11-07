package ru.skidrowapi.eventlogger.logger;

import org.bukkit.Instrument;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.inventory.ItemStack;
import ru.skidrowapi.eventlogger.EventLogger;
import ru.skidrowapi.eventlogger.map.MapBlock;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


public class BlockLogger {
    public BlockLogger(EventLogger instance) {
        plugin = instance;
        getMapBlock();
        loggerblock();
    }

    private static Map<String, Boolean> eventblock = new HashMap<>();
    private String info;
    private EventLogger plugin;
    private String time;

    public void BlockBreakEvent(Player p, Block b) {
        if (eventblock.get("BlockBreakEvent") == true) {
            info = "@BlockBreakEvent: " + "player-" + p.getName() + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockBurnEvent(Block b) {
        if (eventblock.get("BlockBurnEvent") == true) {
            info = "@BlockBurnEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockCanBuildEvent(Material m, Boolean b) {
        if (eventblock.get("BlockCanBuildEvent") == true) {
            info = "@BlockCanBuildEvent: " + "material-" + m + ", isBuildable-" + b;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockDamageEvent(Player p, Block b) {
        if (eventblock.get("BlockDamageEvent") == true) {
            info = "@BlockDamageEvent: " + "player-" + p.getName() + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockDispenseEvent(ItemStack i) {
        if (eventblock.get("BlockDispenseEvent") == true) {
            info = "@BlockDispenseEvent: " + "drop item-" + i;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockExpEvent(Integer exp, Block b) {
        if (eventblock.get("BlockExpEvent") == true) {
            info = "@BlockExpEvent: " + "exp-" + exp + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockFadeEvent(Block b) {
        if (eventblock.get("BlockFadeEvent") == true) {
            info = "@BlockFadeEvent: " + " block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockFormEvent(Block b) {
        if (eventblock.get("BlockFormEvent") == true) {
            info = "@BlockFormEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }

    }

    public void BlockFromToEvent(Block b, BlockFace bf) {
        if (eventblock.get("BlockFromToEvent") == true) {
            info = "@BlockFromToEvent: " + "blockface-" + bf + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }

    }

    public void BlockGrowEvent(Block b) {
        if (eventblock.get("BlockGrowEvent") == true) {
            info = "@BlockGrowEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockIgniteEvent(Block b, Entity e, BlockIgniteEvent.IgniteCause c) {
        if (eventblock.get("BlockIgniteEvent")) {
            info = "@BlockIgniteEvent: " + "cause-" + c + ", entity-" + e + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockPhysicsEvent(Block b, Material m) {
        if (eventblock.get("BlockPhysicsEvent") == true) {
            info = "@BlockPhysicsEvent: " + "material-" + m + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockPistonEvent(Block b, BlockFace bf) {
        if (eventblock.get("BlockPistonEvent") == true) {
            info = "@BlockPistonEvent: " + "blockface-" + bf + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }

    }

    public void BlockPistonExtendEvent(Block b) {
        if (eventblock.get("BlockPistonExtendEvent") == true) {
            info = "@BlockPistonExtendEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockPistonRetractEvent(Block b) {
        if (eventblock.get("BlockPistonRetractEvent") == true) {
            info = "@BlockPistonRetractEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockPlaceEvent(Player p, Block b, Boolean isBuildable) {
        if (eventblock.get("BlockPlaceEvent") == true) {
            info = "@BlockPlaceEvent: " + "player-" + p.getName() + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + " isBuildable-" + isBuildable;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockRedstoneEvent(Block b, Integer oldcur, Integer newcur) {
        if (eventblock.get("BlockRedstoneEvent") == true) {
            info = "@BlockRedstoneEvent: " + " block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + ", oldcurrent-" + oldcur + ", newcurrent-" + newcur;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockSpreadEvent(Block b, Block bs) {
        if (eventblock.get("BlockSpreadEvent") == true) {
            info = "@BlockSpreadEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + ", " + "blocksource-" + bs.getType() + " (" + bs.getX() + " " + bs.getY() + " " + bs.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }

    }

    public void EntityBlockFormEvent(Block b, Entity e) {
        if (eventblock.get("EntityBlockFormEvent") == true) {
            info = "@EntityBlockFormEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + ", entity-" + e.getType();
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }

    }

    public void LeavesDecayEvent(Block b) {
        if (eventblock.get("LeavesDecayEvent") == true) {
            info = "@LeavesDecayEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void NotePlayEvent(Block b, Note n, Instrument inst) {
        if (eventblock.get("NotePlayEvent") == true) {
            info = "@NotePlayEvent: " + "block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + ", note-" + n + ", instrument-" + inst;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void SignChangeEvent(Player p, Block b) {
        if (eventblock.get("SignChangeEvent") == true) {
            info = "@SignChangeEvent: " + "player-" + p.getName() + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")";
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void BlockMultiPlaceEvent(Player p, Block b, BlockState bs) {
        if (eventblock.get("BlockMultiPlaceEvent") == true) {
            info = "@BlockMultiPlaceEvent: " + "player-" + p.getName() + ", block-" + b.getType() + " (" + b.getX() + " " + b.getY() + " " + b.getZ() + ")" + ", blockstate-" + bs;
            if (plugin.getConfig().getBoolean("file") == true) {
                saveloggerblock();
            }
            if (plugin.getConfig().getBoolean("console") == true) {
                plugin.getLogger().info(info);
            }
        }
    }

    public void getMapBlock() {
        eventblock = MapBlock.getMapBlock();
    }

    public void loggerblock() {
        File log = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "loggerblock.yml");
        if (!log.exists()) {
            FileConfiguration logcon = new YamlConfiguration();
            try {
                logcon.save(log);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileConfiguration logger = YamlConfiguration.loadConfiguration(log);

    }

    public void saveloggerblock() {
        File log = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "loggerblock.yml");
        FileConfiguration logger = YamlConfiguration.loadConfiguration(log);
        Calendar cal = Calendar.getInstance();
        time = String.valueOf(cal.getTime());
        logger.set(time, info);
        try {
            logger.save(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteloggerblock() {
        File log = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "loggerblock.yml");
        log.delete();

    }

}