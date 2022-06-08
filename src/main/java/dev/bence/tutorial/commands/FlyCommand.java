package dev.bence.tutorial.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;


            if(player.getAllowFlight() == false) {
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.GREEN + "Vliegen ingeschakeld");
                return true;
            }
                player.setAllowFlight(false);
                player.sendMessage(ChatColor.RED + "Vliegen uitgeschakeld");
            }

            return false;

        }
    }
