package org.MSC_BOT;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

import java.util.ArrayList;
import java.util.List;

public class SlashCommandReaction extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        switch (event.getName()) {
            case "공대는":
                event.reply("병이야").queue();
                break;
            case "자바는":
                event.reply("신이다").queue();
                break;
        }
    }

        @Override
        public void onGuildReady(GuildReadyEvent event) {

            List<CommandData> commandDatas = new ArrayList<>();
            commandDatas.add(
                    Commands.slash("공대는", "무엇일까")
            );
            commandDatas.add(
                    Commands.slash("자바는", "무엇일까")
            );

            event.getGuild().updateCommands().addCommands(commandDatas).queue();
        }


    }
