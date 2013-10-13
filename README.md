# Guilds-GriefPrevention

This is an extension of GriefPrevention plugin for Bukkit.

## Purpose

The purpose of this extension is to have the same group function as Factions, but less PvP-orientation and protection using GriefPrevention.

## Design

### Land Claiming System

Every person will be given X amount of land.
When they join a guild, their land will be put in a pool for the entire guild to use.
It is up to the guild leader and moderator(s) to determine how the land is divided.

### Guild Hierarchy

This is the hierarchy of how guilds will be structured, with their expected powers.

- Guild Leader
    - Automatically chosen by whoever creates a guild
    - Claim/unclaim land
    - Add/Remove Moderators
    - Add/Remove Members
    - Subdivide land for Moderators
    - Subdivide land for Members
    - Choose a moderator to replace current leader
- Guild Moderator(s)
    - Claim/unclaim land
    - Add/Remove Moderators
    - Add/Remove Members
    - Subdivide land for Members
- Guild Members
    - Build in public and designated areas
    - Access chests in public and designated areas

### Alliances

Multiple guilds will be able to interact with each other by forming alliances.
More details will be presented when details are worked out.

## Development/Usage

### Requirements

- [GriefPrevention 7.8](http://dev.bukkit.org/bukkit-plugins/grief-prevention/)
- [Craftbukkit 1.6.4 R0.1](http://dl.bukkit.org/)

Spigot may work.
Need volunteers to confirm.

### How to install

1. Download the plugin from [Our Jenkins Server](http://ci.pjbollinger.com/)
2. Move the plugin to the ```plugins``` folder on your craftbukkit server
3. Ensure all requirements have been met.
4. Run your server.
5. Add appropriate permissions for your players based on [THESE PERMISSIONS]()

### How to use source

1. Download/clone/fork repository
2. Use your favorite IDE
3. I will try to use ```maven``` as the build system
4. Hopefully it won't be hard to download and get going.

## Thanks

Thank you for checking out this plugin and hope you enjoy using it and/or making it grow.
