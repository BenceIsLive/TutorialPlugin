//package dev.bence.tutorial.manager;
//
//import dev.bence.tutorial.Tutorial;
//import org.bukkit.Bukkit;
//import org.bukkit.scheduler.BukkitRunnable;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class BroadcastManager {
//
//    private Tutorial main = Tutorial.instance;
//    private List<String> messages;
//    private int lastMessages;
//    private boolean random;
//    }
//
//    public BroadcastManager(BroadcastTimer plugin)
//        public BroadcastManager() {
//            List<String> messages = new ArrayList<>();
//            main.getConfig().getStringList("messages").forEach( (s) -> messages.add(s));
//
//            new BukkitRunnable() {
//
//            int message = 0;
//
//            @Override
//            public void run() {
//                String currentMessage = messages.get(message);
//                Bukkit.broadcastMessage("&6" + currentMessage);
//
//                message++;
//
//                if (!)
//                try
//                {
//                    message = messages.get(lastMessages + 1);
//                } catch ( )
//            }
//        }.runTaskTimer(main, 0, 60);
//    }
//
//}
