package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.ChatFull;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getChat method
 */
public class MessagesGetChatQueryWithFields extends AbstractQueryBuilder<MessagesGetChatQueryWithFields, ChatFull> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetChatQueryWithFields(VkApiClient client, Actor actor, UserField... fields) {
        super(client, "messages.getChat", ChatFull.class);
        accessToken(actor.getAccessToken());
        fields(fields);
    }

    /**
     * Chat ID.
     *
     * @param value value of "chat id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatQueryWithFields chatId(Integer value) {
        return unsafeParam("chat_id", value);
    }

    /**
     * Profile fields to return.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatQueryWithFields fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * "nom" - nominative (default)
     * "gen" - genitive
     * "dat" - dative
     * "acc" - accusative
     * "ins" - instrumental
     * "abl" - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatQueryWithFields nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected MessagesGetChatQueryWithFields getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
