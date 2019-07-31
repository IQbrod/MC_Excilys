package com.iqbrod.excilysplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerJoinEvent event) {
        event.setJoinMessage("Hello there");
    }
}
