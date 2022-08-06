package me.skunky.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }

    @Override
    public void onDisable() {

    }

    public static Main getPlugin() {
        return plugin;
    }
}
