package ru.skidrowapi.eventlogger;


import org.bukkit.plugin.java.JavaPlugin;
import ru.skidrowapi.eventlogger.eventlist.EventList;
import ru.skidrowapi.eventlogger.executor.Executor;
import ru.skidrowapi.eventlogger.logger.Logger;
import ru.skidrowapi.eventlogger.map.MapEvent;


public class EventLogger extends JavaPlugin {
    EventLogger plugin = this;

    @Override
    public void onEnable() {
        MapEvent map = new MapEvent(plugin);
        map.MapEvent();
        ListEvent listEvent = new ListEvent(plugin);
        listEvent.listevent();
        Executor ex=new Executor(plugin);
        getServer().getPluginManager().registerEvents(new EventList(this), this);
        plugin.getLogger().info("logger on console is " + plugin.getConfig().getBoolean("console"));
        plugin.getLogger().info("logger on file is " + plugin.getConfig().getBoolean("file"));
        plugin.getLogger().info("help in command " + "/eventlogger");
        getCommand("eventlogger").setExecutor(ex);
    }

    @Override
    public void onDisable() {
        Logger logger = new Logger(plugin);
        logger.deletelogger();
        plugin.getLogger().info("Logger file delete!");
    }
}