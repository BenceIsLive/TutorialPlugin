package dev.bence.tutorial.commands;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetJoinMessageCommand implements CommandExecutor {

    Tutorial tutorial = Tutorial.getPlugin(Tutorial.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(args.length >= 1) {
                StringBuilder joinMessage = new StringBuilder();
                for(int i = 0; i < args.length; i++) {
                    joinMessage.append(args[i]).append(" ");
                }

                tutorial.getConfig().set("join-message", joinMessage.toString());
                tutorial.saveConfig();

                player.sendMessage(ChatUtils.format("Join-message aangepast naar: " + joinMessage));

            } else {
                player.sendMessage(ChatUtils.format("&aGebruik /setjoinmessage <bericht>"));
            }
        }

        return true;
    }
}
