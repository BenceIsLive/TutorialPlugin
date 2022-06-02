package dev.bence.tutorial.Commands;

import dev.bence.tutorial.Menu.FirstMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MenuCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            // OPEN THE MENU
            new FirstMenu(player);


        }

        return false;
    }
}
