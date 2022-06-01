package dev.bence.tutorial.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KitCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack zwaard = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta zwaardMeta = zwaard.getItemMeta();
            zwaardMeta.setDisplayName(ChatColor.GOLD + "Bence's zwaard!");
            ArrayList<String> zwaardLore = new ArrayList<>();
            zwaardLore.add(ChatColor.GREEN + "Dit is lore 1");
            zwaardLore.add(ChatColor.RED + "Dit is lore 2");
            zwaardMeta.setLore(zwaardLore);
            zwaardMeta.setUnbreakable(true);
            zwaardMeta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
            zwaard.setItemMeta(zwaardMeta);

            ItemStack chestplate = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
            ItemMeta chestplateMeta = chestplate.getItemMeta();
            chestplateMeta.setDisplayName(ChatColor.GREEN + "Bence's Chestplate");
            chestplateMeta.setUnbreakable(true);
            chestplate.setItemMeta(chestplateMeta);

            player.getInventory().setChestplate(chestplate);
            player.getInventory().addItem(zwaard);

        }
        return false;
    }
}
