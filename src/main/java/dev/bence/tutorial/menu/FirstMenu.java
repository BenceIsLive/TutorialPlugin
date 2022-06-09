package dev.bence.tutorial.menu;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.libaries.ItemBuilder;
import dev.bence.tutorial.utils.ChatUtils;
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


    Tutorial tutorial = Tutorial.getPlugin(Tutorial.class);
    public FirstMenu(Player player) {

        Inventory inv = Bukkit.createInventory(player, 27, ChatColor.RED + "First Menu");

        ItemStack sword = new ItemBuilder(Material.getMaterial(tutorial.getConfig().getString("GUI.item1.material")))
                .setName(ChatUtils.format(tutorial.getConfig().getString("GUI.item1.displayname")))
                .setAmount(tutorial.getConfig().getInt("GUI.item1.amount"))
                .build();
            inv.setItem(11, sword);

        ItemStack heal = new ItemBuilder(Material.getMaterial(tutorial.getConfig().getString("GUI.item2.material")))
                .setName(ChatUtils.format(tutorial.getConfig().getString("GUI.item2.displayname")))
                .setAmount(tutorial.getConfig().getInt("GUI.item2.amount"))
                .build();
            inv.setItem(13, heal);

        ItemStack speed = new ItemBuilder(Material.getMaterial(tutorial.getConfig().getString("GUI.item3.material")))
                .setName(ChatUtils.format(tutorial.getConfig().getString("GUI.item3.displayname")))
                .setAmount(tutorial.getConfig().getInt("GUI.item3.amount"))
                .build();
            inv.setItem(15, speed);


//                ItemStack speed = new ItemStack(Material.SPLASH_POTION, 1);
//                ItemMeta speedMeta = speed.getItemMeta();
//                speedMeta.setDisplayName(ChatColor.GOLD + "Speed");
//                ArrayList<String> speedLore = new ArrayList<>();
//                speedLore.add(ChatColor.GRAY + "Klik om speed te krijgen");
//                speedMeta.setLore(speedLore);
//                speedMeta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
//                speed.setItemMeta(speedMeta);
//                inv.setItem(15, speed);






        player.openInventory(inv);

    }
}
