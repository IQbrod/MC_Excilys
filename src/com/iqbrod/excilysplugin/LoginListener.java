package com.iqbrod.excilysplugin;

import net.mcjukebox.plugin.bukkit.api.JukeboxAPI;
import net.mcjukebox.plugin.bukkit.api.ResourceType;
import net.mcjukebox.plugin.bukkit.api.models.Media;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class LoginListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Media media = new Media(ResourceType.MUSIC, "");
        JukeboxAPI.play(event.getPlayer(), media);
    }
}
