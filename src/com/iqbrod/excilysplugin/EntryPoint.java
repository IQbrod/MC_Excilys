package com.iqbrod.excilysplugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EntryPoint extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("ExcilysPlugin enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("ExcilysPlugin disabled");
    }
}
