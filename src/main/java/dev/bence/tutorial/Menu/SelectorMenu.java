package dev.bence.tutorial.Menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SelectorMenu {


    public SelectorMenu(Player player) {

        Inventory inv = Bukkit.createInventory(player, 27, ChatColor.RED + "First Menu");

        ItemStack star = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta starMeta = star.getItemMeta();
        starMeta.setDisplayName(ChatColor.GOLD + "SURVIVAL");
        ArrayList<String> starLore = new ArrayList<>();
        starLore.add(ChatColor.GRAY + "Klik om ernaar toe te gaan!");
        starMeta.setLore(starLore);
        starMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        star.setItemMeta(starMeta);
        inv.setItem(13, star);


        player.openInventory(inv);

    }
}
