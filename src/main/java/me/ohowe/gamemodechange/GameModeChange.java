package me.ohowe.gamemodechange;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameModeChange extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GameModeChangeListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
