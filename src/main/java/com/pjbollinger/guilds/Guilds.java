package com.pjbollinger.guilds;

import com.pjbollinger.guilds.commands.GuildsCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Guilds extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("Guilds has started.");
        getCommand("gs").setExecutor(new GuildsCommandExecutor(this));
    }

    @Override
    public void onDisable(){
        getLogger().info("Guilds has stopped.");
    }

}
