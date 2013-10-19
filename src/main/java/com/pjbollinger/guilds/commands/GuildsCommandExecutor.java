package com.pjbollinger.guilds.commands;

import com.pjbollinger.guilds.Guilds;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class GuildsCommandExecutor implements CommandExecutor{

    private Guilds guilds;

    public GuildsCommandExecutor(Guilds guilds) {
        this.guilds = guilds;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("Judy")){
            guilds.getLogger().info("Judy says, 'Hi!'");
            return true;
        }
        else if(cmd.getName().equalsIgnoreCase("gs")){
            if(args[0].equalsIgnoreCase("create")){
                //Stuff for creating a faction will go here
                //Need to specify <name of Guild>
                if(args.length == 2){
                    guilds.getLogger().info("You want to make a Guild with the name: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs create <name of Guild>");
                }
            }
            else if(args[0].equalsIgnoreCase("invite")){
                //Stuff for inviting a player will go here
                //Need to specify <name>
                if(args.length == 2){
                    guilds.getLogger().info("You want to add " + args[1] + " to your Guild.");
                }
                else {
                    guilds.getLogger().warning("Command format is /gs invite <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("invitations")){
                //Stuff for viewing which Guild(s) have invited a player to join will go here
                if(args.length == 2){
                    guilds.getLogger().info("You want to display page: " + args[1]);
                }
                else {
                    guilds.getLogger().info("You want to display the first page.");
                }

            }
            else if(args[0].equalsIgnoreCase("join")){
                //Stuff for if invited OR if desire to join an OPEN Guild
                //Need to specify <name of Guild>
                if (args.length == 2){
                    guilds.getLogger().info("You want to be a member of: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs join <name of Guild>");
                }
            }

            else if(args[0].equalsIgnoreCase("leave")){
                //Stuff for leaving the Guild
                guilds.getLogger().info("You want to leave this Guild.");
            }
            else if(args[0].equalsIgnoreCase("kick")){
                //Stuff for getting rid of a troublemaker
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You want to kick: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs kick <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("moderator")){
                //Stuff for designating a Guild member as moderator of the Guild
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You want to appoint " + args[1] + " as Guild Moderator.");
                }
                else {
                    guilds.getLogger().warning("Command format is /gs moderator <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("member")){
                //Stuff for removing Guild mod status, returning to member only status
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You want to remove " + args[1] + " as Guild Moderator.");
                }
                else {
                    guilds.getLogger().warning("Command format is /gs member <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("leader")){
                //Stuff for reassigning role of Guild leader
                // MUST be approved by SO or SAdmin before going into effect
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You want to make " + args[1] + " your Guild leader.");
                }
                else {
                    guilds.getLogger().warning("Command format is /gs leader <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("list")){
                //Stuff for creating/showing list of Guilds
                //page # is optional
                if (args.length == 2){
                    guilds.getLogger().info("You want to display page: " + args[1]);
                }
                else {
                    guilds.getLogger().info("You want to display the first page.");
                }
            }
            else if(args[0].equalsIgnoreCase("show")){
                //Stuff for showing info about a Guild
                if (args.length == 2){
                    guilds.getLogger().info("You want to display the Guild: " + args[1]);
                }
                else {
                    guilds.getLogger().info("You want to display your Guild.");
                }
            }
            else if(args[0].equalsIgnoreCase("player")){
                //Stuff for showing info about a single person
                if (args.length == 2){
                    guilds.getLogger().info("You want to display info about: " + args[1]);
                }
                else {
                    guilds.getLogger().info("You want to display your info.");
                }
            }
            else if(args[0].equalsIgnoreCase("home")){
                //Stuff for going to home set point
                guilds.getLogger().info("You want to return home.");
            }
            else if(args[0].equalsIgnoreCase("set")){
                //Stuff for setting the value, property, etc.
                //examples: property = home, value = open (is Guild open or closed)
                //examples: name = change name of Guild, description = motto for Guild
                //Need to specify <name, property> and [value(s), description]
                if (args.length > 1){
                    guilds.getLogger().info("You want to set: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs set <property> [value(s)]");
                }
            }
            else if(args[0].equalsIgnoreCase("ally")){
                //Stuff for inviting another Guild to be allied with yours
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You want to ally with: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs ally <name of Guild>");
                }
            }
            else if(args[0].equalsIgnoreCase("neutral")){
                //Stuff for returning to neutral with a Guild
                //Need to specify <name>
                if (args.length == 2){
                    guilds.getLogger().info("You are no longer allied with: " + args[1]);
                }
                else {
                    guilds.getLogger().warning("Command format is /gs neutral <name of Guild>");
                }
            }

        }
        return false;
    }

}
