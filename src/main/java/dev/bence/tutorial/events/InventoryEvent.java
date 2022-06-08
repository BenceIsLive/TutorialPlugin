package dev.bence.tutorial.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class InventoryEvent implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equals(ChatColor.RED + "First Menu") && e.getCurrentItem() != null) {
            e.setCancelled(true);
            switch (e.getRawSlot()) {
                case 11: // kit
                        player.performCommand("kit");
                        player.sendMessage("Je hebt de kit ontvangen.");
                    break;
                case 13: // heal
                        player.setHealth(20);
                        player.setFoodLevel(20);
                        player.sendMessage("Je bent volledig geheald!");
                    break;
                case 15: // speed
                    player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 20*600, 2));
                    player.sendMessage("Je hebt nu speed 2 voor 5 minuten!");
                    break;
                default:
                    return;
            }
            player.closeInventory();

        }

    }
}
