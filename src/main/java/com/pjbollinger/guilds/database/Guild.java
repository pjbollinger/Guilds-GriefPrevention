package com.pjbollinger.guilds.database;

import java.util.List;

public class Guild {

    private String name;
    private String leader;
    private List<String> moderators;
    private List<String> members;
    private List<Guild> alliances;
    private int pool;
    private int claimed;
    private int[] claims;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return this.leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public List<String> getModerators() {
        return this.moderators;
    }

    public void setModerators(List<String> moderators) {
        this.moderators = moderators;
    }

    public void addModerator(String moderator) {
        this.moderators.add(moderator);
    }

}
