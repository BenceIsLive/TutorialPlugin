package dev.bence.tutorial.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("survival")) {
                    player.sendMessage(ChatColor.GREEN + "Je bent nu gamemode survival!");
                    player.setGameMode(GameMode.SURVIVAL);
                } else if (args[0].equalsIgnoreCase("creative")) {
                    player.sendMessage(ChatColor.GREEN + "Je bent nu gamemode creative!");
                    player.setGameMode(GameMode.CREATIVE);
                } else if (args[0].equalsIgnoreCase("adventure")) {
                    player.sendMessage(ChatColor.GREEN + "Je bent nu gamemode adventure!");
                    player.setGameMode(GameMode.ADVENTURE);
                } else {
                    player.sendMessage(ChatColor.RED + "Gebruik /gamemodes survival/creative/adventure");
                }

            } else {
                player.sendMessage(ChatColor.RED + "Gebruik /gamemodes (gamemode))");
            }
                return false;
            }
        return false;
    }
}
