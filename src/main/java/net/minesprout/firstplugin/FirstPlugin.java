package net.minesprout.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Registering this class as an Event Listener, so Bukkit knows where
        // to look for
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage("Welcome back, " + event.getPlayer().getName());

        event.getPlayer().sendMessage("Hello " + event.getPlayer().getName());
    }
}
