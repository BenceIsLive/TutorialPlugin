package dev.bence.tutorial.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.WHITE + "(" +ChatColor.GREEN + "+" + ChatColor.WHITE + ") " + ChatColor.GRAY+ player.getName());
    }
}
