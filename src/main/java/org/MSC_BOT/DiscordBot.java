package org.MSC_BOT;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.EnumSet;

public class DiscordBot {

    public static void main(String[] args) {
        BotTokenManager tokenManager = new BotTokenManager();
        String token = tokenManager.getDiscordBotToken( );

        EnumSet<GatewayIntent> intents = EnumSet.of(
                GatewayIntent.GUILD_MESSAGES,
                GatewayIntent.DIRECT_MESSAGES,
                GatewayIntent.MESSAGE_CONTENT,
                GatewayIntent.GUILD_PRESENCES,
                GatewayIntent.GUILD_MEMBERS,
                GatewayIntent.GUILD_VOICE_STATES);

        JDABuilder.createDefault(token)
                .enableIntents(intents)
                .setActivity(Activity.customStatus("명령어 기다리는 중..."))
                .addEventListeners(
                        new ChattingReaction(),
                       new SlashCommandReaction()
                        )
                .build();
    }
}