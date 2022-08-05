package de.celinadev.celibspigot;

import org.bukkit.plugin.java.JavaPlugin;

public class CeLib {

    private static JavaPlugin plugin;

    public CeLib(JavaPlugin plugin) {
        CeLib.plugin = plugin;
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
