package dev.bence.tutorial.menu;

import dev.bence.tutorial.libaries.ItemBuilder;
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

        ItemStack sword = new ItemBuilder(Material.STONE_SWORD)
                .setName("Test")
                .addLore("Klik om een kit te krijgen")
                .build();
        inv.setItem(11, sword);



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
        speedMeta.setLore(speedLore);
        speedMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        speed.setItemMeta(speedMeta);
        inv.setItem(15, speed);




        player.openInventory(inv);

    }
}
