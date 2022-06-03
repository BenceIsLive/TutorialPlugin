package dev.bence.tutorial.Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.WHITE + "(" + ChatColor.GREEN + "+" + ChatColor.WHITE + ") " + ChatColor.GRAY + player.getName());

        PlayerInventory pinv = player.getInventory();
        ItemStack is = new ItemStack(Material.NETHER_STAR, 1);
        pinv.setItem(4, is);
    }
}
