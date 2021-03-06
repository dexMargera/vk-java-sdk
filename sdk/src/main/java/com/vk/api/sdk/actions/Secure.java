package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServerActor;
import com.vk.api.sdk.queries.secure.SecureAddAppEventQuery;
import com.vk.api.sdk.queries.secure.SecureCheckTokenQuery;
import com.vk.api.sdk.queries.secure.SecureGetAppBalanceQuery;
import com.vk.api.sdk.queries.secure.SecureGetSMSHistoryQuery;
import com.vk.api.sdk.queries.secure.SecureGetTransactionsHistoryQuery;
import com.vk.api.sdk.queries.secure.SecureGetUserLevelQuery;
import com.vk.api.sdk.queries.secure.SecureSendNotificationQuery;
import com.vk.api.sdk.queries.secure.SecureSendSMSNotificationQuery;
import com.vk.api.sdk.queries.secure.SecureSetCounterQuery;
import com.vk.api.sdk.queries.secure.SecureSetUserLevelQuery;

/**
 * List of Secure methods
 */
public class Secure extends AbstractAction {

    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Secure(VkApiClient client) {
        super(client);
    }

    /**
     * Returns payment balance of the application in hundredth of a vote.
     */
    public SecureGetAppBalanceQuery getAppBalance(ServerActor actor) {
        return new SecureGetAppBalanceQuery(getClient(), actor);
    }

    /**
     * Shows history of votes transaction between users and the application.
     */
    public SecureGetTransactionsHistoryQuery getTransactionsHistory(ServerActor actor) {
        return new SecureGetTransactionsHistoryQuery(getClient(), actor);
    }

    /**
     * Shows a list of SMS notifications sent by the application using secure.sendSMSNotification method.
     */
    public SecureGetSMSHistoryQuery getSMSHistory(ServerActor actor) {
        return new SecureGetSMSHistoryQuery(getClient(), actor);
    }

    /**
     * Sends "SMS" notification to a user's mobile device.
     */
    public SecureSendSMSNotificationQuery sendSMSNotification(ServerActor actor, int userId, String message) {
        return new SecureSendSMSNotificationQuery(getClient(), actor, userId, message);
    }

    /**
     * Sends notification to the user.
     */
    public SecureSendNotificationQuery sendNotification(ServerActor actor, String message) {
        return new SecureSendNotificationQuery(getClient(), actor, message);
    }

    /**
     * Sets a counter which is shown to the user in bold in the left menu.
     */
    public SecureSetCounterQuery setCounter(ServerActor actor) {
        return new SecureSetCounterQuery(getClient(), actor);
    }

    /**
     * Sets user game level in the application which can be seen by his/her friends.
     */
    public SecureSetUserLevelQuery setUserLevel(ServerActor actor) {
        return new SecureSetUserLevelQuery(getClient(), actor);
    }

    /**
     * Returns one of the previously set game levels of one or more users in the application.
     */
    public SecureGetUserLevelQuery getUserLevel(ServerActor actor, int... userIds) {
        return new SecureGetUserLevelQuery(getClient(), actor, userIds);
    }

    /**
     * Adds user activity information to an application
     */
    public SecureAddAppEventQuery addAppEvent(ServerActor actor, int userId, int activityId) {
        return new SecureAddAppEventQuery(getClient(), actor, userId, activityId);
    }

    /**
     * Checks the user authentification in "IFrame" and "Flash" apps using the "access_token" parameter.
     */
    public SecureCheckTokenQuery checkToken(ServerActor actor) {
        return new SecureCheckTokenQuery(getClient(), actor);
    }
}
