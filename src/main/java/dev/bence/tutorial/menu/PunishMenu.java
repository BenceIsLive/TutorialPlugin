package dev.bence.tutorial.menu;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.libaries.ItemBuilder;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PunishMenu {

    public PunishMenu(Player player, Player target) {

        Inventory inv = Bukkit.createInventory(player, 27, ChatUtils.format("&bPunish Menu"));

        ItemStack hart = new ItemBuilder(Material.BARRIER)
                .setName(ChatUtils.format("&cBan"))
                .setLore(ChatUtils.format("&7&oBan deze persoon permanent"))
                .setPersistentData("Naam", target.getName())
                .build();
        inv.setItem(11, hart);

        player.openInventory(inv);

    }
}
