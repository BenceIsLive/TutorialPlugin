package dev.bence.tutorial;

import dev.bence.tutorial.commands.*;
import dev.bence.tutorial.events.*;
import dev.bence.tutorial.manager.BroadcastTimer;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Tutorial extends JavaPlugin {

    public static Tutorial instance;
    int interval = getConfig().getInt("interval") * 20;

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Plugin enabled");
        instance = this;


        // COMMANDS
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("geef").setExecutor(new GiveCommand());
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("menu").setExecutor(new MenuCommand());
        getCommand("stats").setExecutor(new StatsCommand());
        getCommand("vlieg").setExecutor(new FlyCommand());
        getCommand("gamemodes").setExecutor(new GamemodeCommand());
        getCommand("selector").setExecutor(new SelectorCommand());
        getCommand("setjoinmessage").setExecutor(new SetJoinMessageCommand());
        getCommand("reload").setExecutor(new ReloadCommand());
        getCommand("punish").setExecutor(new PunishCommand());

        //EVENTS
        this.getServer().getPluginManager().registerEvents(new TestEvent(), this);
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        this.getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
        this.getServer().getPluginManager().registerEvents(new InventoryEvent(), this);
        this.getServer().getPluginManager().registerEvents(new PingEvent(), this);
        this.getServer().getPluginManager().registerEvents(new PlayerInteractEvent(), this);
        this.getServer().getPluginManager().registerEvents(new PunishEvent(), this);

        // YML FILES
        if (!new File(getDataFolder(), "config.yml").exists());
        saveDefaultConfig();

        new BroadcastTimer(this).runTaskTimer(this, 0, interval);

    }

    public static Tutorial getInstance() {
        return instance;
    }
}
