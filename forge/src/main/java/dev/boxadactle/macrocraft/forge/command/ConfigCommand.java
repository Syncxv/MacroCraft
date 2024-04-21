package dev.boxadactle.macrocraft.forge.command;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import dev.boxadactle.boxlib.util.ClientUtils;
import dev.boxadactle.macrocraft.config.MacroCraftConfigScreen;
import dev.boxadactle.macrocraft.forge.MacrocraftCommand;
import net.minecraft.commands.CommandSourceStack;

public class ConfigCommand extends MacrocraftCommand {
    @Override
    public String getCommandName() {
        return "config";
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSourceStack> builder) {
        builder.executes(this::openConfig);
    }

    private int openConfig(CommandContext<CommandSourceStack> source) {
        ClientUtils.setScreen(new MacroCraftConfigScreen(null));

        return 0;
    }
}
