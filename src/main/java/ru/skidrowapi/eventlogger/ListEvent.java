package ru.skidrowapi.eventlogger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ListEvent {
    public ListEvent(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;

    public void listevent() {
        File list = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "listevent.yml");
        if (!list.exists()) {
            FileConfiguration listcon = new YamlConfiguration();
            try {
                listcon.save(list);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (plugin.getConfig().getBoolean("language_ru") == true) {
            language_ru();
        }
        if (plugin.getConfig().getBoolean("language_en") == true) {
            language_en();
        }
    }

    public void language_en() {
        File list = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "listevent.yml");
        FileConfiguration listevent = YamlConfiguration.loadConfiguration(list);
        listevent.createSection("----- EVENT BLOCK -----");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockBreakEvent", "- called when the player breaks the block.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockBurnEvent", "- called when the block burns.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockCanBuildEvent", "- called when we try to put a block to see if we can do it.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockDamageEvent", "- called when the block was damaged by the player.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockDispenseEvent", "- called when any thing is thrown out of the block (Example: distributor)");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockExpEvent", "- called when the block is dropping experience.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockFadeEvent", "- called when the block is subjected to world conditions. (Example: melting).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockFormEvent", "- called when the block is formed due to world conditions (Example: water freezing).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockFromToEvent", "- called when spreading lava/water and teleporting the ender egg.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockGrowEvent", "- called when a block grows. (For example, grass, mushroom, wheat).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockIgniteEvent", "- called when the block is lit.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockPhysicsEvent", "- called when the block is subjected to physics (Example: sand fall).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockPistonEvent", " - called when the block moves the piston. (Even air transfer).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockPistonExtendEvent", " - additional event piston.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockPistonRetractEvent", " - additional piston events.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockPlaceEvent", " - called when a player puts a block.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockDispenseEvent", " - called when throwing any thing out of the block (example: distributor)");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockRedstoneEvent", " - called when a redstone signal is transmitted.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockSpreadEvent", " - called when a block is distributed on conditions. (For example, the spread of fire).");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("EntityBlockFormEvent", " - called when an entity forms a block.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("LeavesDecayEvent", " - is called when leaves disappear on their own.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("NotePlayEvent", " when the player plays sounds in the music block.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("SignChangeEvent", " - called when the player has already written something on the plate.");
        listevent.getConfigurationSection("----- EVENT BLOCK -----").set("BlockMultiPlaceEvent", " - called when another block is initialized (example: bed).");

        try {
            listevent.save(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void language_ru() {
        File list = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "listevent.yml");
        FileConfiguration listevent = YamlConfiguration.loadConfiguration(list);
        listevent.createSection("-----EVENT BLOCK-----");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockBreakEvent", "- вызывается, когда игрок ломает блок.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockBurnEvent", "- вызывается, когда блок сгорает.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockCanBuildEvent", "- вызывается, когда мы пытаемся поставить блок, что бы увидеть, можем ли мы это сделать.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockDamageEvent", "- вызывается, когда блок повредился от игрока.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockDispenseEvent", "- вызывается, когда любая вещь выкидывается из блока (Пример: раздатчик)");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockExpEvent", "- вызывается, когда блок дропает опыт.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockFadeEvent", "- вызывается, когда блок подвергается мировым условиям. (Пример: таяние).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockFormEvent", " - вызывается, когда блок формируется из-за мировых условий (Пример: замерзание воды).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockFromToEvent", "- вызывается при растекании лавы/воды и телепортирования яйца ендера.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockGrowEvent", "- вызывается, когда какой-то блок вырастает. (Например, трава, гриб, пшеница).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockIgniteEvent", "- вызывается, когда блок горит.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockPhysicsEvent", "- вызывается, когда блок подвергается физике (Пример: падение песка).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockPistonEvent", "- вызывается, когда блок сдвигается поршнем. (Даже сдвиг воздуха).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockPistonExtendEvent", "- доп. события поршня.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockPistonRetractEvent", "- доп. события поршня.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockPlaceEvent", "- вызывается, когда игрок ставит блок.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockDispenseEvent", "- вызывается, когда любая вещь выкидывается из блока (Пример: раздатчик)");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockRedstoneEvent", "- вызывается, когда передается редстоун сигнал.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockSpreadEvent", "- вызывается, когда блок распространяется по мировым условиям. (Например: распространение огня).");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("EntityBlockFormEvent", "- вызывается, когда Entity формирует какой-то блок.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("LeavesDecayEvent", "- вызывается, когда листья исчезают самостоятельно.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("NotePlayEvent", "- когда игрок проигрывает звуки на нотном блоке.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("SignChangeEvent", "- вызывается, когда игрок уже написал что-то на табличке.");
        listevent.getConfigurationSection("-----EVENT BLOCK-----").set("BlockMultiPlaceEvent", "- вызывается, когда при инициализации одного блока ставится еще один(Например: кровать).");
        try {
            listevent.save(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}