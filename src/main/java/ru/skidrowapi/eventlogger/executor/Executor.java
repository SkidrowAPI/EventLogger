package ru.skidrowapi.eventlogger.executor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.skidrowapi.eventlogger.EventLogger;
import ru.skidrowapi.eventlogger.map.MapEvent;

import java.util.HashMap;
import java.util.Map;


public class Executor implements CommandExecutor {
    public Executor(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;
    private String argname;
    private static Map<String, Boolean> event = new HashMap<>();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (args.length == 0) {

            if (sender instanceof Player) {
                sender.sendMessage(ChatColor.AQUA + "/eventlogger console - регистрирует евенты блоков в консоль");
                sender.sendMessage(ChatColor.AQUA + "/eventlogger file - регистрирует евенты блоков в файл");
                sender.sendMessage(ChatColor.AQUA + "/eventlogger language_ru - регистрирует евенты блоков на русском языке");
                sender.sendMessage(ChatColor.AQUA + "/eventlogger language_en - регистрирует евенты блоков на английском языке");
                sender.sendMessage(ChatColor.YELLOW + "/eventblock <название ивента> - регистрирует евенты блоков");
                sender.sendMessage(ChatColor.RED + "При повторном вводе команды регистрация прекращается!");
            } else {
                sender.sendMessage("/eventlogger console - registers event blocks in a console");
                sender.sendMessage("/eventlogger file - registers event blocks in a file");
                sender.sendMessage("/eventlogger language_ru - registers event blocks in Russian language");
                sender.sendMessage("/eventlogger language_en - registers event blocks in English language");
                sender.sendMessage("/eventblock <name of event > - registers event blocks");
            }

            return true;
        }


                if (args[0].equalsIgnoreCase("console")) {
                    if (plugin.getConfig().getBoolean("console") == false) {
                        plugin.getConfig().set("console", true);
                        sender.sendMessage("logger on console is " + plugin.getConfig().getBoolean("console"));
                    } else {
                        plugin.getConfig().set("console", false);
                        sender.sendMessage("logger on console is " + plugin.getConfig().getBoolean("console"));
                    }

                } else if (args[0].equalsIgnoreCase("file")) {
                    if (plugin.getConfig().getBoolean("file") == false) {
                        plugin.getConfig().set("file", true);
                        sender.sendMessage("logger on file is " + plugin.getConfig().getBoolean("file"));
                    } else {
                        plugin.getConfig().set("file", false);
                        sender.sendMessage("logger on file is " + plugin.getConfig().getBoolean("file"));
                    }
                }

        getMapEvent();
        if (event.get(args[0]) == false) {
            argname = args[0];
            replacetrue();
            plugin.getLogger().info(args[0] + " enable!");
        } else if (event.get(args[0]) == true) {
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
        event.replace(argname, true);
        return event;
    }

    public Map<String, Boolean> replacefalse() {
        event.replace(argname, false);
        return event;
    }

    public void getMapEvent() {
        event = MapEvent.getMapEvent();
    }
}
