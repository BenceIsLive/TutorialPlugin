package dev.bence.tutorial.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class TestEvent implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {

        Player player = e.getPlayer();

        player.sendMessage(ChatColor.GREEN + "Je hebt het " + e.getBlock().getType() + " gebroken!");

    }
}
