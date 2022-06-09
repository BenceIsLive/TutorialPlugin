package dev.bence.tutorial.events;

import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerInteractEvent implements Listener {

    @EventHandler
    public void onPlayerInteract(org.bukkit.event.player.PlayerInteractEvent e) {

        Player player = (Player) e.getPlayer();

        if (e.hasItem()) {
            if (e.getItem().getType().equals(Material.DIAMOND_HOE)) {

                player.launchProjectile(Snowball.class);

            } else if (e.getItem().getType().equals(Material.IRON_HOE)) {

                player.launchProjectile(Egg.class);

            }
        }




    }
}
