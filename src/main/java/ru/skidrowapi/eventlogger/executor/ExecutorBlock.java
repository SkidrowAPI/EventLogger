package ru.skidrowapi.eventlogger.executor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import ru.skidrowapi.eventlogger.EventLogger;
import ru.skidrowapi.eventlogger.map.MapBlock;

import java.util.HashMap;
import java.util.Map;


public class ExecutorBlock implements CommandExecutor {
    public ExecutorBlock(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;
    private String argname;
    private static Map<String, Boolean> eventblock = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        getMapBlock();

        if (eventblock.get(args[0]) == false) {
            argname = args[0];
            replacetrue();
            plugin.getLogger().info(args[0] + " enable!");
        } else if (eventblock.get(args[0]) == true) {
            argname = args[0];
            replacefalse();
            plugin.getLogger().info(args[0] + " disable!");
        } else if (args.length == 0) {
            sender.sendMessage("event don't find!");
            sender.sendMessage("read event's list on " + plugin.getDataFolder().getAbsolutePath() + "/listevent.yml");
        }
        return true;
    }

    public Map<String, Boolean> replacetrue() {
        eventblock.replace(argname, true);
        return eventblock;
    }

    public Map<String, Boolean> replacefalse() {
        eventblock.replace(argname, false);
        return eventblock;
    }

    public void getMapBlock() {
        eventblock = MapBlock.getMapBlock();
    }
}