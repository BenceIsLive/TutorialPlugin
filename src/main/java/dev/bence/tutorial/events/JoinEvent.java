package dev.bence.tutorial.events;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class JoinEvent implements Listener {

    Tutorial tutorial = Tutorial.getPlugin(Tutorial.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        String joinMessageOld = ChatUtils.format(tutorial.getConfig().getString("join-message"));
        String joinMessage =  joinMessageOld.replaceAll("%player%", player.getDisplayName());

        ItemStack joinItem = new ItemStack(Material.getMaterial(tutorial.getConfig().getString
                ("join-item.material"))
                , tutorial.getConfig().getInt("join-item.amount"));

        e.setJoinMessage(joinMessage);

        if(tutorial.getConfig().getBoolean("join-item.give-item")) {
            player.getInventory().addItem(joinItem);
        }
    }
}
