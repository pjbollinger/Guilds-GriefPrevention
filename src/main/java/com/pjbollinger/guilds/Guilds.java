package com.pjbollinger.guilds;

import com.pjbollinger.guilds.commands.GuildsCommandExecutor;
import com.pjbollinger.guilds.database.Guild;
import lib.PatPeter.SQLibrary.Database;
import lib.PatPeter.SQLibrary.MySQL;
import lib.PatPeter.SQLibrary.SQLite;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Guilds extends JavaPlugin {

    public List<Guild> listOfGuilds;
    public Database sql;

    @Override
    public void onEnable(){
        getLogger().info("Guilds has started.");

        //Save a copy of the default config.yml if one is not there
        this.saveDefaultConfig();

        if(Guilds.this.getConfig().getBoolean("mysql.use")) {
            sql = new MySQL(
                    Logger.getLogger("Minecraft"),
                    "[Guilds]",
                    Guilds.this.getConfig().getString("mysql.hostname"),
                    Guilds.this.getConfig().getInt("mysql.port"),
                    Guilds.this.getConfig().getString("mysql.database"),
                    Guilds.this.getConfig().getString("mysql.user"),
                    Guilds.this.getConfig().getString("mysql.pass")
            );

        } else {
            sql = new SQLite(
                    Logger.getLogger("Minecraft"),
                    "[Guilds]",
                    this.getDataFolder().getAbsolutePath(),
                    "guilds",
                    ".sqlite"
            );
        }

        if(sql.open()) {
            getLogger().info("Guilds has successfully connected to its database.");
        }

        getCommand("gs").setExecutor(new GuildsCommandExecutor(this));

        listOfGuilds = new ArrayList<Guild>();

        Guild RSE;
        RSE = new Guild();
        RSE.setName("RSE");
        RSE.setLeader("magicpat2010");

        listOfGuilds.add(RSE);

        getLogger().info(RSE.getLeader());
        getLogger().info(RSE.getName());

    }

    @Override
    public void onDisable(){
        getLogger().info("Guilds has stopped.");
    }

}
