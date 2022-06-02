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

public class FirstMenu {


    public FirstMenu(Player player) {

        Inventory inv = Bukkit.createInventory(player, 27, ChatColor.RED + "First Menu");

        ItemStack zwaard = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta zwaardMeta = zwaard.getItemMeta();
        zwaardMeta.setDisplayName(ChatColor.GOLD + "Kit");
        ArrayList<String> zwaardLore = new ArrayList<>();
        zwaardLore.add(ChatColor.GRAY + "Klik om een kit te krijgen");
        zwaardMeta.setLore(zwaardLore);
        zwaardMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        zwaard.setItemMeta(zwaardMeta);
        inv.setItem(11, zwaard);

        ItemStack heal = new ItemStack(Material.POPPY, 1);
        ItemMeta healMeta = heal.getItemMeta();
        healMeta.setDisplayName(ChatColor.GOLD + "Heal");
        ArrayList<String> healLore = new ArrayList<>();
        healLore.add(ChatColor.GRAY + "Klik om geheald te worden");
        healMeta.setLore(healLore);
        heal.setItemMeta(healMeta);
        inv.setItem(13, heal);

        ItemStack speed = new ItemStack(Material.SPLASH_POTION, 1);
        ItemMeta speedMeta = speed.getItemMeta();
        speedMeta.setDisplayName(ChatColor.GOLD + "Speed");
        ArrayList<String> speedLore = new ArrayList<>();
        speedLore.add(ChatColor.GRAY + "Klik om speed te krijgen");
        speedMeta.setLore(zwaardLore);
        speedMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        speed.setItemMeta(speedMeta);
        inv.setItem(15, speed);




        player.openInventory(inv);

    }
}
