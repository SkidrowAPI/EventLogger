package ru.skidrowapi.eventlogger;


import org.bukkit.plugin.java.JavaPlugin;
import ru.skidrowapi.eventlogger.executor.ExecutorBlock;
import ru.skidrowapi.eventlogger.eventlist.Block;
import ru.skidrowapi.eventlogger.executor.ExecutorLogger;
import ru.skidrowapi.eventlogger.logger.BlockLogger;
import ru.skidrowapi.eventlogger.map.MapBlock;


public class EventLogger extends JavaPlugin {
    EventLogger plugin = this;

    @Override
    public void onEnable() {
        MapBlock mapBlock = new MapBlock(plugin);
        mapBlock.MapBlock();
        ListEvent listEvent = new ListEvent(plugin);
        listEvent.listevent();
        ExecutorBlock exb = new ExecutorBlock(plugin);
        ExecutorLogger ExecutorLogger = new ExecutorLogger(plugin);
        getServer().getPluginManager().registerEvents(new Block(this), this);
        plugin.getLogger().info("logger on console is " + plugin.getConfig().getBoolean("console"));
        plugin.getLogger().info("logger on file is " + plugin.getConfig().getBoolean("file"));
        plugin.getLogger().info("help in command " + "/eventlogger");
        getCommand("eventblock").setExecutor(exb);
        getCommand("eventlogger").setExecutor(ExecutorLogger);
    }

    @Override
    public void onDisable() {
        plugin.getLogger().info("Logger file delete!");
        BlockLogger blockLogger = new BlockLogger(plugin);
        blockLogger.deleteloggerblock();
    }
}