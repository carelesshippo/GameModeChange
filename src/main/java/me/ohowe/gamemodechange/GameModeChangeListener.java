package me.ohowe.gamemodechange;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class GameModeChangeListener implements Listener {
    private final GameModeChange plugin;

    public GameModeChangeListener(GameModeChange plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onGameModeChange(@NotNull PlayerGameModeChangeEvent event) {
        plugin.getLogger().info("GameMode change called!");

        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 100));
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 100));

    }
}
