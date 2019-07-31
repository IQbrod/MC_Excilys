package com.iqbrod.basicplugin;
import org.bukkit.plugin.java.JavaPlugin;

public class EntryPoint extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("BasicPlugin loaded");
    }

    @Override
    public void onDisable() {
        System.out.println("BasicPlugin unloaded");
    }
}
