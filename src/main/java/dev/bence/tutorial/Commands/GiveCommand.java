package dev.bence.tutorial.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("apple")){
                    player.sendMessage(ChatColor.GREEN + "Appel gegeven!");
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 1));
                } else if(args[0].equalsIgnoreCase("brood")){
                    player.sendMessage(ChatColor.GREEN + "Brood gegeven!");
                    player.getInventory().addItem(new ItemStack(Material.BREAD, 2));
                } else {
                    player.sendMessage(ChatColor.RED + "Gebruik /geef appel/brood");
                }

            } else {
                player.sendMessage(ChatColor.RED + "Gebruik /geef [item[");
            }


        }

        return false;
    }
}
