package cn.paper_card.qq_group_chat_sync.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface QqGroupMessageSender {
    void sendNormal(@NotNull String content) throws Exception;
}