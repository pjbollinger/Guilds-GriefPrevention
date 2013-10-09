package com.pjbollinger.guilds;

import org.bukkit.plugin.java.JavaPlugin;

public class Guilds extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Guilds has started.");
    }

    @Override
    public void onDisable(){
        getLogger().info("Guilds has stopped.");
    }

}
