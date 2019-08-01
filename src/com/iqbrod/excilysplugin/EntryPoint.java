package com.iqbrod.excilysplugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EntryPoint extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new LoginListener(), this);
        getLogger().info("Enable ExcilysPlugin!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable ExcilysPlugin");
    }
}
