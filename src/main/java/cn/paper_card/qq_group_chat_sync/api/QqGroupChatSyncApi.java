package cn.paper_card.qq_group_chat_sync.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface QqGroupChatSyncApi {
    // 群聊消息
    @Nullable String onGroupMessage(long qq, @NotNull String name, @NotNull String content);

    // 消息中提及某人
    @Nullable String onAtMessage(long qq, @NotNull String name, long target, @NotNull String content);

    // At全体
    @Nullable String onAtAllMessage(long qq, @NotNull String name, @NotNull String content);

    // 有人在群里回复机器人的同步消息
    @Nullable String onReplySyncMessage(long qq, @NotNull String name, @NotNull UUID uuid, @NotNull String content);

    void setMessageSender(@Nullable QqGroupMessageSender sender);

    boolean setMessageSenderIfNull(@NotNull QqGroupMessageSender sender);

    @Nullable QqGroupMessageSender getMessageSender();

}
