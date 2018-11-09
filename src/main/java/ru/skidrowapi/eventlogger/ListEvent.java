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
        language_ru();

    }


    public void language_ru() {
        File list = new File(plugin.getDataFolder().getAbsolutePath() + File.separator + "listevent.yml");
        FileConfiguration listevent = YamlConfiguration.loadConfiguration(list);
        listevent.createSection("-----EVENT'S-----");
        listevent.getConfigurationSection("-----EVENT'S-----").set("BlockBreakEvent", "- вызывается, когда игрок ломает блок.");
        listevent.getConfigurationSection("-----EVENT'S-----").set("BlockBurnEvent", "- вызывается, когда блок сгорает.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockCanBuildEvent", "- вызывается, когда мы пытаемся поставить блок, что бы увидеть, можем ли мы это сделать.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockDamageEvent", "- вызывается, когда блок повредился от игрока.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockDispenseEvent", "- вызывается, когда любая вещь выкидывается из блока (Пример: раздатчик)");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockExpEvent", "- вызывается, когда блок дропает опыт.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockFadeEvent", "- вызывается, когда блок подвергается мировым условиям. (Пример: таяние).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockFormEvent", " - вызывается, когда блок формируется из-за мировых условий (Пример: замерзание воды).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockFromToEvent", "- вызывается при растекании лавы/воды и телепортирования яйца ендера.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockGrowEvent", "- вызывается, когда какой-то блок вырастает. (Например, трава, гриб, пшеница).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockIgniteEvent", "- вызывается, когда блок горит.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockPhysicsEvent", "- вы-зывается, когда блок подвергается физике (Пример: падение песка).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockPistonEvent", "- вызывается, когда блок сдвигается поршнем. (Даже сдвиг воздуха).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockPistonExtendEvent", "- доп. события поршня.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockPistonRetractEvent", "- доп. события поршня.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockPlaceEvent", "- вызывается, когда игрок ставит блок.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockDispenseEvent", "- вызывается, когда любая вещь выкидывается из блока (Пример: раздатчик)");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockRedstoneEvent", "- вызывается, когда передается редстоун сигнал.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockSpreadEvent", "- вызывается, когда блок распространяется по мировым условиям. (Например: распространение огня).");


        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityBlockFormEvent", "- вызывается, когда Entity формирует какой-то блок.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("LeavesDecayEvent", "- вызывается, когда листья исчезают самостоятельно.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("NotePlayEvent", "- когда игрок проигрывает звуки на нотном блоке.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("SignChangeEvent", "- вызывается, когда игрок уже написал что-то на табличке.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("BlockMultiPlaceEvent", "- вызывается, когда при инициализации одного блока ставится еще один(Например: кровать).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("CreatureSpawnEvent", "- спавн моба в мире.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("CreeperPowerEvent", "- вы-зывается, когда крипера ударяет молния.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityBreakDoorEvent", "- вызывается, когда Entity ломает дверь.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityChangeBlockEvent", "- вызывается, когда блок меняется в следствии воздействия Entity (Пример: падающий блок превращается в нормальный).");
        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityCombustByBlockEvent", "- вызывается, когда Entity загорается в следствии воздействия на него блока или огня.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityCombustByEntityEvent", "- вызывается, когда Entity загорается в следствии воздействия другого Entity.");
        listevent.getConfigurationSection("-----EVENT’S-----").set("EntityCombustEvent", "- вы-зывается, когда Entity загорается.");





    try {
            listevent.save(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}