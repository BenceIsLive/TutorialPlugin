package dev.bence.tutorial.manager;

import dev.bence.tutorial.Tutorial;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Random;

public class BroadcastTimer extends BukkitRunnable {

    private List<String> messages;
    private boolean random;
    private int lastMessages;

    public BroadcastTimer(Tutorial plugin)
    {
        this.random = plugin.getConfig().getBoolean("random");
        this.messages = plugin.getConfig().getStringList("messages");
    }

    @Override
    public void run() {

        String message = "";

        if (!random) {

            try {
                message = messages.get(lastMessages + 1);
                lastMessages++;
            } catch (ArrayIndexOutOfBoundsException e)
            {
                message = messages.get(0);
                lastMessages = 0;
            }
        } else
        {
            Random random = new Random();
            int nextMessage = random.nextInt(messages.size());
            while (nextMessage == lastMessages)
            {
                random.nextInt(messages.size());
            }
            message = messages.get(nextMessage);
            lastMessages = nextMessage;
        }

    }
}


