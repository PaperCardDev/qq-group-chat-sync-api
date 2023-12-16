package cn.paper_card.qq_group_chat_sync.api;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@SuppressWarnings("unused")
public interface QqGroupMessageSender {
    void sendNormal(@NotNull UUID uuid, @NotNull String name, @NotNull String content) throws Exception;
}