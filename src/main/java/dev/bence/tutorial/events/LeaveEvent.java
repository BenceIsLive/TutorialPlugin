package dev.bence.tutorial.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.WHITE + "(" +ChatColor.DARK_RED + "-" + ChatColor.WHITE + ") " + ChatColor.GRAY+ player.getName());
    }
}
