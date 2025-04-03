package org.MSC_BOT;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChattingReaction extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String str = event.getMessage().getContentDisplay();

        switch(str) {
            case "야" :
                event.getChannel().sendMessage("뭐요").queue();
                break;

            case "안녕" :
                event.getChannel().sendMessage("그래 반갑다").queue();
                break;

            case "뭐해" :
                event.getChannel().sendMessage("롤체한다").queue();
                break;

            case "메카 문승찬." :
                event.getChannel().sendMessage("네 주인님").queue();
                break;

            case "반갑혁준" :
                event.getChannel().sendMessage("반갑혁준~").queue();
                break;
            case "메카문승찬 욕해봐" :
                event.getChannel().sendMessage("민성이 같네").queue();
                break;
        }
    }
}