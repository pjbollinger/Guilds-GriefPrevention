package com.pjbollinger.guilds.commands;

import com.pjbollinger.guilds.Guilds;
import com.pjbollinger.guilds.database.Guild;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Iterator;

public class GuildsCommandExecutor implements CommandExecutor{

    private Guilds guilds;

    public GuildsCommandExecutor(Guilds guilds) {
        this.guilds = guilds;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(cmd.getName().equalsIgnoreCase("gs")){
            if(args[0].equalsIgnoreCase("create")){
                //Stuff for creating a faction will go here
                //Need to specify <name of Guild>
                if(args.length == 2){
                    sender.sendMessage("You want to make a Guild with the name: " + args[1]);

                    Guild newGuild = new Guild();
                    newGuild.setLeader(sender.getName());
                    newGuild.setName(args[1]);

                    guilds.listOfGuilds.add(newGuild);
                }
                else {
                    sender.sendMessage("Command format is /gs create <name of Guild>");
                }
            }
            else if(args[0].equalsIgnoreCase("invite")){
                //Stuff for inviting a player will go here
                //Need to specify <name>
                if(args.length == 2){
                    sender.sendMessage("You want to add " + args[1] + " to your Guild.");
                }
                else {
                    sender.sendMessage("Command format is /gs invite <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("invitations")){
                //Stuff for viewing which Guild(s) have invited a player to join will go here
                if(args.length == 2){
                    sender.sendMessage("You want to display page: " + args[1]);
                }
                else {
                    sender.sendMessage("You want to display the first page.");
                }

            }
            else if(args[0].equalsIgnoreCase("join")){
                //Stuff for if invited OR if desire to join an OPEN Guild
                //Need to specify <name of Guild>
                if (args.length == 2){
                    sender.sendMessage("You want to be a member of: " + args[1]);
                }
                else {
                    sender.sendMessage("Command format is /gs join <name of Guild>");
                }
            }

            else if(args[0].equalsIgnoreCase("leave")){
                //Stuff for leaving the Guild
                sender.sendMessage("You want to leave this Guild.");
            }
            else if(args[0].equalsIgnoreCase("kick")){
                //Stuff for getting rid of a troublemaker
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You want to kick: " + args[1]);
                }
                else {
                    sender.sendMessage("Command format is /gs kick <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("moderator")){
                //Stuff for designating a Guild member as moderator of the Guild
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You want to appoint " + args[1] + " as Guild Moderator.");
                }
                else {
                    sender.sendMessage("Command format is /gs moderator <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("member")){
                //Stuff for removing Guild mod status, returning to member only status
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You want to remove " + args[1] + " as Guild Moderator.");
                }
                else {
                    sender.sendMessage("Command format is /gs member <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("leader")){
                //Stuff for reassigning role of Guild leader
                // MUST be approved by SO or SAdmin before going into effect
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You want to make " + args[1] + " your Guild leader.");
                }
                else {
                    sender.sendMessage("Command format is /gs leader <name>");
                }
            }
            else if(args[0].equalsIgnoreCase("list")){
                //Stuff for creating/showing list of Guilds
                //page # is optional
                if (args.length == 2){
                    sender.sendMessage("You want to display page: " + args[1]);
                }
                else {
                    sender.sendMessage("You want to display the first page.");
                }
            }
            else if(args[0].equalsIgnoreCase("show")){
                //Stuff for showing info about a Guild
                if (args.length == 2){
                    sender.sendMessage("You want to display the Guild: " + args[1]);
                }
                else {
                    sender.sendMessage("You want to display your Guild.");
                }
            }
            else if(args[0].equalsIgnoreCase("player")){
                //Stuff for showing info about a single person
                if (args.length == 2){
                    sender.sendMessage("You want to display info about: " + args[1]);
                }
                else {
                    sender.sendMessage("You want to display your info.");
                }
            }
            else if(args[0].equalsIgnoreCase("home")){
                //Stuff for going to home set point
                sender.sendMessage("You want to return home.");
            }
            else if(args[0].equalsIgnoreCase("set")){
                //Stuff for setting the value, property, etc.
                //examples: property = home, value = open (is Guild open or closed)
                //examples: name = change name of Guild, description = motto for Guild
                //Need to specify <name, property> and [value(s), description]
                if (args.length > 1){
                    sender.sendMessage("You want to set: " + args[1]);
                }
                else {
                    sender.sendMessage("Command format is /gs set <property> [value(s)]");
                }
            }
            else if(args[0].equalsIgnoreCase("ally")){
                //Stuff for inviting another Guild to be allied with yours
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You want to ally with: " + args[1]);
                }
                else {
                    sender.sendMessage("Command format is /gs ally <name of Guild>");
                }
            }
            else if(args[0].equalsIgnoreCase("neutral")){
                //Stuff for returning to neutral with a Guild
                //Need to specify <name>
                if (args.length == 2){
                    sender.sendMessage("You are no longer allied with: " + args[1]);
                }
                else {
                    sender.sendMessage("Command format is /gs neutral <name of Guild>");
                }
            }
            else if(args[0].equalsIgnoreCase("debug")){
                //Used for debugging purposes

                Iterator<Guild> guildIterator = guilds.listOfGuilds.iterator();
                while(guildIterator.hasNext()) {
                    Guild element = guildIterator.next();
                    sender.sendMessage("Guild name: " + element.getName());
                    sender.sendMessage("Leader name: " + element.getLeader());

                    String moderators = "Moderators: ";
                    Iterator<String> moderatorElementIterator = element.getModerators().iterator();
                    while(moderatorElementIterator.hasNext()) {
                        String subelement = moderatorElementIterator.next();
                        moderators += subelement + ", ";
                    }
                    sender.sendMessage(moderators);

                    String members = "Members: ";
                    Iterator<String> memberElementIterator = element.getMembers().iterator();
                    while(memberElementIterator.hasNext()) {
                        String subelement = memberElementIterator.next();
                        members += subelement + ", ";
                    }
                    sender.sendMessage(members);

                    String alliances = "Alliances: ";
                    Iterator<Guild> allianceElementIterator = element.getAlliances().iterator();
                    while(allianceElementIterator.hasNext()) {
                        String subelement = allianceElementIterator.next().getName();
                        alliances += subelement + ", ";
                    }
                    sender.sendMessage(alliances);

                    sender.sendMessage("This guild has a total power of: " + element.getPool());

                    sender.sendMessage("This guild has claimed " + element.getClaimed() + " land");

                    String claims = "Claim IDs: ";
                    Iterator<Integer> claimElementIterator = element.getClaims().iterator();
                    while(claimElementIterator.hasNext()) {
                        String subelement = claimElementIterator.next().toString();
                        members += subelement + ", ";
                    }
                    sender.sendMessage(claims);

                    sender.sendMessage("==================");
                }

            }
            
            return true;
        }
        return false;
    }

}
