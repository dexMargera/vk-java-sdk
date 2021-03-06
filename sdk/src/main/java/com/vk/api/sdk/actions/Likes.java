package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.queries.likes.LikesAddQuery;
import com.vk.api.sdk.queries.likes.LikesDeleteQuery;
import com.vk.api.sdk.queries.likes.LikesGetListQuery;
import com.vk.api.sdk.queries.likes.LikesGetListQueryWithExtended;
import com.vk.api.sdk.queries.likes.LikesIsLikedQuery;
import com.vk.api.sdk.queries.likes.LikesType;

/**
 * List of Likes methods
 */
public class Likes extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Likes(VkApiClient client) {
        super(client);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQuery getList(LikesType type) {
        return new LikesGetListQuery(getClient(), type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQuery getList(Actor actor, LikesType type) {
        return new LikesGetListQuery(getClient(), actor, type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQueryWithExtended getListExtended(LikesType type) {
        return new LikesGetListQueryWithExtended(getClient(), type);
    }

    /**
     * Returns a list of IDs of users who added the specified object to their "Likes" list.
     */
    public LikesGetListQueryWithExtended getListExtended(Actor actor, LikesType type) {
        return new LikesGetListQueryWithExtended(getClient(), actor, type);
    }

    /**
     * Adds the specified object to the "Likes" list of the current user.
     */
    public LikesAddQuery add(Actor actor, LikesType type, int itemId) {
        return new LikesAddQuery(getClient(), actor, type, itemId);
    }

    /**
     * Deletes the specified object from the "Likes" list of the current user.
     */
    public LikesDeleteQuery delete(Actor actor, LikesType type, int itemId) {
        return new LikesDeleteQuery(getClient(), actor, type, itemId);
    }

    /**
     * Checks for the object in the "Likes" list of the specified user.
     */
    public LikesIsLikedQuery isLiked(Actor actor, LikesType type, int itemId) {
        return new LikesIsLikedQuery(getClient(), actor, type, itemId);
    }
}
