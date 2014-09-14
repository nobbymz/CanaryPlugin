package me.sgray.template.canaryplugin;

import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.plugin.Plugin;

public class CanaryPlugin extends Plugin {
    @Override
    public void disable() {
        // Don't log disabling, Canary does that for you automatically!
    }

    @Override
    public boolean enable() {
        // Don't log enabling, Canary does that for you automatically!

        // Don't forget to setup commands
         try {
           Canary.commands().registerCommands(new MyPluginCommand(), this, false);
         } catch (CommandDependencyException e) {
           e.printStackTrace();
         }
        return true;
    }
}
