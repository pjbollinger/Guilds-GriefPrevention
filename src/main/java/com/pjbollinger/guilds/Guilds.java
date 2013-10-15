package com.pjbollinger.guilds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("Judy")){
            getLogger().info("Judy says, 'Hi!'");
            return true;
        }
        return false;
    }
}
