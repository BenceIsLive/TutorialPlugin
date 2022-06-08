package dev.bence.tutorial.commands;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class GamemodeCommand implements CommandExecutor, TabCompleter {


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
                } else if (args[0].equalsIgnoreCase("spectator")) {
                    player.sendMessage(ChatColor.GREEN + "Je bent nu gamemode spectator!");
                    player.setGameMode(GameMode.SPECTATOR);
                } else {
                    player.sendMessage(ChatColor.RED + "Gebruik /gamemodes survival/creative/adventure/spectator");
                }
            }
                return false;
            }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        List<String> arguments = Arrays.asList("survival", "creative", "adventure", "spectator");
        List<String> Flist = Lists.newArrayList();
        if (args.length == 1) {
            for (String s : arguments) {
                if (s.toLowerCase().startsWith(args[0].toLowerCase())) Flist.add(s);
            }
            return Flist;
        }
        return null;

    }
}
