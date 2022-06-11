package dev.bence.tutorial.manager;

import dev.bence.tutorial.Tutorial;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BroadcastTimer extends BukkitRunnable {

    private List<String> messages;
    private int interval;
    private int message_index = 0;
    public BroadcastTimer(Tutorial plugin)
    {
        this.messages = plugin.getConfig().getStringList("messages");
        this.interval = plugin.getConfig().getInt("interval");
    }

    @Override
    public void run() {
        if (message_index == messages.size()) {
            message_index = 0;

        }
        Bukkit.broadcastMessage(messages.get(message_index));
        message_index++;

    }
}


