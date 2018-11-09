package ru.skidrowapi.eventlogger.eventlist;

import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.*;
import org.bukkit.inventory.ItemStack;
import ru.skidrowapi.eventlogger.EventLogger;
import ru.skidrowapi.eventlogger.logger.Logger;

public class EventList implements Listener {
    public EventList(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockBreakEvent(BlockBreakEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockBreakEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockBurnEvent(BlockBurnEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockBurnEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockCanBuildEvent(BlockCanBuildEvent e) {
        Material material = e.getMaterial();
        Boolean isBuildable = e.isBuildable();
        Logger log=new Logger(plugin);
        log.BlockCanBuildEvent(material, isBuildable);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockDamageEvent(BlockDamageEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockDamageEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockDispenseEvent(BlockDispenseEvent e) {
        ItemStack item = e.getItem();
        Logger log=new Logger(plugin);
        log.BlockDispenseEvent(item);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockExpEvent(BlockExpEvent e) {
        Integer exp = e.getExpToDrop();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockExpEvent(exp, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFadeEvent(BlockFadeEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockFadeEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFormEvent(BlockFormEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockFormEvent(block);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFromToEvent(BlockFromToEvent e) {
        BlockFace blockface = e.getFace();
        org.bukkit.block.Block block = e.getToBlock();
        Logger log=new Logger(plugin);
        log.BlockFromToEvent(block, blockface);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockGrowEvent(BlockGrowEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockGrowEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockIgniteEvent(BlockIgniteEvent e) {
        BlockIgniteEvent.IgniteCause cause = e.getCause();
        org.bukkit.block.Block block = e.getIgnitingBlock();
        org.bukkit.entity.Entity entity = e.getIgnitingEntity();
        Logger log=new Logger(plugin);
        log.BlockIgniteEvent(block, entity, cause);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPhysicsEvent(BlockPhysicsEvent e) {
        Material material = e.getChangedType();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockPhysicsEvent(block, material);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonEvent(BlockPistonEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockFace blockface = e.getDirection();
        Logger log=new Logger(plugin);
        log.BlockPistonEvent(block, blockface);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonExtendEvent(BlockPistonExtendEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockPistonExtendEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonRetractEvent(BlockPistonRetractEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.BlockPistonRetractEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPlaceEvent(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlockPlaced();
        Boolean isBuildable = e.canBuild();
        Logger log=new Logger(plugin);
        log.BlockPlaceEvent(player, block, isBuildable);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockRedstoneEvent(BlockRedstoneEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Integer newcur = e.getNewCurrent();
        Integer oldcur = e.getOldCurrent();
        Logger log=new Logger(plugin);
        log.BlockRedstoneEvent(block, oldcur, newcur);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockSpreadEvent(BlockSpreadEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        org.bukkit.block.Block blocksource = e.getSource();
        Logger log=new Logger(plugin);
        log.BlockSpreadEvent(block, blocksource);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onEntityBlockFormEvent(EntityBlockFormEvent e) {
        Entity entity = e.getEntity();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.EntityBlockFormEvent(block, entity);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onLeavesDecayEvent(LeavesDecayEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.LeavesDecayEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onNotePlayEvent(NotePlayEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Note note = e.getNote();
        Instrument instrument = e.getInstrument();
        Logger log=new Logger(plugin);
        log.NotePlayEvent(block, note, instrument);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onSignChangeEvent(SignChangeEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        Logger log=new Logger(plugin);
        log.SignChangeEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockMultiPlaceEvent(BlockMultiPlaceEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Player player = e.getPlayer();
        BlockState bs = e.getBlockReplacedState();
        Logger log=new Logger(plugin);
        log.BlockMultiPlaceEvent(player, block, bs);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onCreatureSpawnEvent(CreatureSpawnEvent e){
        LivingEntity entity=e.getEntity();
        Location loc=e.getLocation();
        Logger log=new Logger(plugin);
        log.CreatureSpawnEvent(entity,loc);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onCreeperPowerEvent(CreeperPowerEvent e){
        LivingEntity entity=e.getEntity();
        Location loc=entity.getLocation();
        Logger log=new Logger(plugin);
        log.CreeperPowerEvent(entity,loc);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onEntityBreakDoorEvent (EntityBreakDoorEvent e){
        LivingEntity entity=e.getEntity();
        Location loc=entity.getLocation();
        Logger log=new Logger(plugin);
        log.EntityBreakDoorEvent(entity,loc);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onEntityChangeBlockEvent(EntityChangeBlockEvent e){
        Material matd=e.getBlock().getType();
        Material matt=e.getTo();
        Location loc=e.getBlock().getLocation();
        Logger log=new Logger(plugin);
        log.EntityChangeBlockEvent(matd,matt,loc);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onEntityCombustByBlockEvent(EntityCombustByBlockEvent e){
        org.bukkit.entity.Entity entity=e.getEntity();
        Block b=e.getCombuster();
        Location loc=b.getLocation();
        Logger log=new Logger(plugin);
        log.EntityCombustByBlockEvent(entity,b,loc);
    }


}

