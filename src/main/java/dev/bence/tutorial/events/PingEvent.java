package dev.bence.tutorial.events;

import dev.bence.tutorial.Tutorial;
import dev.bence.tutorial.utils.ChatUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingEvent implements Listener {

    Tutorial tutorial = Tutorial.getPlugin(Tutorial.class);

    @EventHandler
    public void onPing(ServerListPingEvent e) {

        e.setMotd(ChatUtils.format(tutorial.getConfig().getString("motd")));
        e.setMaxPlayers(tutorial.getConfig().getInt("max-players"));
    }
}
