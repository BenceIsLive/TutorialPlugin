package dev.bence.tutorial.events;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.persistence.PersistentDataType;

public class PunishEvent implements Listener {

    @EventHandler
    public void onPunish(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(ChatUtils.format("&bPunish Menu")) && e.getCurrentItem() != null) {
            e.setCancelled(true);
            String persistentData = e.getCurrentItem().getItemMeta().getPersistentDataContainer().get(new NamespacedKey(Tutorial.getInstance(), "Naam"), PersistentDataType.STRING);
            switch (e.getRawSlot()) {
                case 11: // kit
                    Bukkit.getServer().getBanList(BanList.Type.NAME).addBan(persistentData, "poep", null, null);
                    Bukkit.getServer().getPlayer(persistentData).kickPlayer("Hoi");
                    player.sendMessage("Je hebt de kit ontvangen.");
                default:
                    return;
            }

        }
        player.closeInventory();
    }
}