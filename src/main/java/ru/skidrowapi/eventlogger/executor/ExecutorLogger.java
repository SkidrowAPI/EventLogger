package ru.skidrowapi.eventlogger.executor;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.skidrowapi.eventlogger.EventLogger;


public class ExecutorLogger implements CommandExecutor {
    public ExecutorLogger(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (plugin.getConfig().getBoolean("language_ru") == true) {
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
        }

        if (plugin.getConfig().getBoolean("language_en") == true) {
            if (args.length == 0) {
                if (sender instanceof Player) {
                    sender.sendMessage(ChatColor.AQUA + "/eventlogger console - registers event blocks in a console");
                    sender.sendMessage(ChatColor.AQUA + "/eventlogger file - registers event blocks in a file");
                    sender.sendMessage(ChatColor.AQUA + "/eventlogger language _ ru - registers event blocks in Russian language");
                    sender.sendMessage(ChatColor.AQUA + "/eventlogger language _ en - registers event blocks in English language");
                    sender.sendMessage(ChatColor.YELLOW + "/eventblock <name of event > - registers event blocks");
                    sender.sendMessage(ChatColor.RED + "At the repeated input of command registration ceases");
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
        }
        return true;
    }
}
