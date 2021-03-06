package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.responses.GetInvitedUsersResponse;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.getInvitedUsers method
 */
public class GroupsGetInvitedUsersQuery extends AbstractQueryBuilder<GroupsGetInvitedUsersQuery, GetInvitedUsersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client  VK API client
     * @param actor   actor with access token
     * @param groupId value of "group id" parameter. Minimum is 0.
     */
    public GroupsGetInvitedUsersQuery(VkApiClient client, Actor actor, int groupId) {
        super(client, "groups.getInvitedUsers", GetInvitedUsersResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Group id to return invited users for
     *
     * @param value value of "group id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsGetInvitedUsersQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Offset to select a certain subset of users
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetInvitedUsersQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Count of users to return
     *
     * @param value value of "count" parameter. Minimum is 0. By default 20.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetInvitedUsersQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Additional fields list to return:
     * nickname, domain, sex, bdate, city, country, timezone, photo_50, photo_100, photo_200_orig, has_mobile, contacts, education, online, relation, last_seen, status, can_write_private_message, can_see_all_posts, can_post, universities
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsGetInvitedUsersQuery fields(UserField... value) {
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
    public GroupsGetInvitedUsersQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected GroupsGetInvitedUsersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
