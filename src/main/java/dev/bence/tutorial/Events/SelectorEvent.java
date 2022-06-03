package dev.bence.tutorial.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;


public class SelectorEvent implements Listener {


        @EventHandler
        public void onSelect(PlayerInteractEvent e) {

            Player player = e.getPlayer();

            if(e.getItem().getType() == Material.NETHER_STAR) {
                player.performCommand("selector");
            }
        }
}
