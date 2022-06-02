package dev.bence.tutorial;

import dev.bence.tutorial.Commands.GiveCommand;
import dev.bence.tutorial.Commands.HealCommand;
import dev.bence.tutorial.Commands.KitCommand;
import dev.bence.tutorial.Commands.MenuCommand;
import dev.bence.tutorial.Events.InventoryEvent;
import dev.bence.tutorial.Events.JoinEvent;
import dev.bence.tutorial.Events.LeaveEvent;
import dev.bence.tutorial.Events.TestEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Plugin enabled");


        // COMMANDS
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("geef").setExecutor(new GiveCommand());
        getCommand("kit").setExecutor(new KitCommand());
        getCommand("menu").setExecutor(new MenuCommand());

        //EVENTS
        this.getServer().getPluginManager().registerEvents(new TestEvent(), this);
        this.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        this.getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
        this.getServer().getPluginManager().registerEvents(new InventoryEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "Plugin disabled");
    }
}
