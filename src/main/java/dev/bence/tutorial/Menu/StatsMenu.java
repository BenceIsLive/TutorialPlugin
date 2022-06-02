package dev.bence.tutorial.Menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class StatsMenu {

    public StatsMenu(Player player) {


        Inventory inv = Bukkit.createInventory(player, 54, ChatColor.RED + "Statics Menu");

        ItemStack bedrock = new ItemStack(Material.PLAYER_HEAD, 1);
        ItemMeta  bedrockMeta = bedrock.getItemMeta();
        bedrockMeta.setDisplayName(ChatColor.GOLD + player.getDisplayName());
        ArrayList<String> bedrockLore = new ArrayList<>();
        bedrockLore.add(ChatColor.BOLD.toString() + ChatColor.WHITE + "-----------------");
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Level: " + ChatColor.RED + player.getLevel());
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Health: " + ChatColor.RED + player.getHealth());
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Hunger: " + ChatColor.RED + player.getFoodLevel());
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "World: " + ChatColor.RED + player.getWorld().getName());
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Deaths: " + ChatColor.RED + player.getStatistic(Statistic.DEATHS));
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Walked: " + ChatColor.RED + player.getStatistic(Statistic.WALK_ONE_CM) + " CM");
        bedrockLore.add(ChatColor.GOLD + "• " + ChatColor.WHITE + "Jumps: " + ChatColor.RED + player.getStatistic(Statistic.JUMP));
        bedrockLore.add(ChatColor.BOLD.toString() + ChatColor.WHITE + "-----------------");
        bedrockMeta.setLore(bedrockLore);
        bedrock.setItemMeta(bedrockMeta);
        inv.setItem(0, bedrock);


        player.openInventory(inv);
    }
}
