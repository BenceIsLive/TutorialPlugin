package dev.bence.tutorial.commands;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {

    Tutorial tutorial = Tutorial.getPlugin(Tutorial.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
                tutorial.reloadConfig();
                player.sendMessage(ChatUtils.format("&aConfig herladen!"));

        }
        return false;
    }
}
