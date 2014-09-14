package me.sgray.template.canaryplugin;

import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class MyPluginCommand implements CommandListener {
    @Command(aliases = { "myplugin", "mplu" },
            description = "Example command for CanaryPlugin",
            permissions = { "canaryplugin.use" },
            toolTip = "/myplugin")
    public void restrictedServerCommand(MessageReceiver caller, String[] parameters) {
        caller.message("Command myplugin successful");
    }

}
