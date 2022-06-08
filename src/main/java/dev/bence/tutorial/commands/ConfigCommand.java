package dev.bence.tutorial.commands;

import dev.bence.tutorial.Tutorial;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ConfigCommand implements CommandExecutor {

    private Tutorial tutorial;

    public ConfigCommand(Tutorial tutorial) {
        this.tutorial = tutorial;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            player.sendMessage(tutorial.getConfig().getString("Word"));
            player.sendMessage(tutorial.getConfig().getInt("Number") + "");
            if (tutorial.getConfig().getBoolean("Boolean")) {
                player.sendMessage("Deze methode staat aan!");
            } else {
                player.sendMessage("Deze methode staat uit");
            }
            for (String string : tutorial.getConfig().getStringList("String-list")) {
                player.sendMessage(string);
            }
        }
        return false;
    }
}
