package ru.skidrowapi.eventlogger.eventlist;

import org.bukkit.Instrument;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.inventory.ItemStack;
import ru.skidrowapi.eventlogger.EventLogger;
import ru.skidrowapi.eventlogger.logger.BlockLogger;


public class Block implements Listener {
    public Block(EventLogger instance) {
        plugin = instance;
    }

    private EventLogger plugin;

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockBreakEvent(BlockBreakEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockBreakEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockBurnEvent(BlockBurnEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockBurnEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockCanBuildEvent(BlockCanBuildEvent e) {
        Material material = e.getMaterial();
        Boolean isBuildable = e.isBuildable();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockCanBuildEvent(material, isBuildable);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockDamageEvent(BlockDamageEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockDamageEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockDispenseEvent(BlockDispenseEvent e) {
        ItemStack item = e.getItem();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockDispenseEvent(item);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockExpEvent(BlockExpEvent e) {
        Integer exp = e.getExpToDrop();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockExpEvent(exp, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFadeEvent(BlockFadeEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockFadeEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFormEvent(BlockFormEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockFormEvent(block);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockFromToEvent(BlockFromToEvent e) {
        BlockFace blockface = e.getFace();
        org.bukkit.block.Block block = e.getToBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockFromToEvent(block, blockface);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockGrowEvent(BlockGrowEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockGrowEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockIgniteEvent(BlockIgniteEvent e) {
        BlockIgniteEvent.IgniteCause cause = e.getCause();
        org.bukkit.block.Block block = e.getIgnitingBlock();
        Entity entity = e.getIgnitingEntity();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockIgniteEvent(block, entity, cause);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPhysicsEvent(BlockPhysicsEvent e) {
        Material material = e.getChangedType();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockPhysicsEvent(block, material);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonEvent(BlockPistonEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockFace blockface = e.getDirection();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockPistonEvent(block, blockface);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonExtendEvent(BlockPistonExtendEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockPistonExtendEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPistonRetractEvent(BlockPistonRetractEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockPistonRetractEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockPlaceEvent(BlockPlaceEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlockPlaced();
        Boolean isBuildable = e.canBuild();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockPlaceEvent(player, block, isBuildable);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockRedstoneEvent(BlockRedstoneEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Integer newcur = e.getNewCurrent();
        Integer oldcur = e.getOldCurrent();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockRedstoneEvent(block, oldcur, newcur);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockSpreadEvent(BlockSpreadEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        org.bukkit.block.Block blocksource = e.getSource();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockSpreadEvent(block, blocksource);

    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onEntityBlockFormEvent(EntityBlockFormEvent e) {
        Entity entity = e.getEntity();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.EntityBlockFormEvent(block, entity);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onLeavesDecayEvent(LeavesDecayEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.LeavesDecayEvent(block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onNotePlayEvent(NotePlayEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Note note = e.getNote();
        Instrument instrument = e.getInstrument();
        BlockLogger bl = new BlockLogger(plugin);
        bl.NotePlayEvent(block, note, instrument);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onSignChangeEvent(SignChangeEvent e) {
        Player player = e.getPlayer();
        org.bukkit.block.Block block = e.getBlock();
        BlockLogger bl = new BlockLogger(plugin);
        bl.SignChangeEvent(player, block);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onBlockMultiPlaceEvent(BlockMultiPlaceEvent e) {
        org.bukkit.block.Block block = e.getBlock();
        Player player = e.getPlayer();
        BlockState bs = e.getBlockReplacedState();
        BlockLogger bl = new BlockLogger(plugin);
        bl.BlockMultiPlaceEvent(player, block, bs);
    }
}
