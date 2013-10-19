package com.pjbollinger.guilds.database;

public class Invitation {

    private String inviter;
    private String guild;

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    public String getInviter() {
        return inviter;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }

}
