package dev.bence.tutorial.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;

            if(args.length == 1) {
                if(Bukkit.getPlayer(args[0]) != null) {
                    Player target = Bukkit.getPlayer(args[0]);

                    target.setHealth(20);
                    target.setFoodLevel(20);
                    target.sendMessage(ChatColor.GREEN + "Je bent gehealed door: " + player.getName());
                    player.sendMessage(ChatColor.GREEN + "Je hebt " + target.getName() + " gehealed!");

                } else {
                    player.sendMessage(ChatColor.RED + "De speler die je probeert te healen is niet online of bestaat niet!");
                }
            } else {
                player.sendMessage(ChatColor.RED + "Gebruik /heal (playername)");
            }
        } else {
            System.out.println(ChatColor.RED + "Je moet een player zijn om dit te kunnen doen!");
        }

        return false;
    }
}
