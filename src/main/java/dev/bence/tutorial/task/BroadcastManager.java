package dev.bence.tutorial.task;

import dev.bence.tutorial.Tutorial;
import org.bukkit.Bukkit;

import java.util.ArrayList;
import java.util.List;

public class BroadcastManager {
    private Tutorial main = Tutorial.instance;

//    private ArrayList<String> messages = new ArrayList<>();
    private int index;

    public BroadcastManager() {
//        main.getConfig().getStringList("messages").forEach( (s) -> messages.add(s));
        List<String> messages1 = new ArrayList<>();
        main.getConfig().getStringList("messages").forEach( (s) -> messages1.add(s) );

        Bukkit.getScheduler().runTaskTimer(Tutorial.instance, () -> {
            index = messages1.size() > index ? index++ : 0;

            Bukkit.broadcastMessage(messages1.get(index));
        }, 0L, main.getConfig().getInt("delay")*20L);
    }

}
