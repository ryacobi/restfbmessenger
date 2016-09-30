/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.marsbits.restfbmessenger;

import com.github.marsbits.restfbmessenger.send.SendOperations;
import com.restfb.types.User;

/**
 * Interface specifying the operations for interacting with Facebook Messenger.
 *
 * @author Marcel Overdijk
 * @since 1.0.0
 */
public interface Messenger {

    /**
     * Verifies the webhook verify token.
     *
     * @param token the received webhook verify token
     * @return {@code true} if token is valid, otherwise {@code false}
     */
    boolean verifyToken(String token);

    /**
     * Handles the webhook callback.
     *
     * @param payload the received webhook payload
     * @param signature the received webhook signature
     */
    void handleCallback(String payload, String signature);

    /**
     * Returns the {@link User} for the given user id.
     *
     * @param userId the user id
     * @return the user
     */
    User getUserProfile(String userId);

    /**
     * Returns the {@link User} for the given user id. Only the given fields will be retrieved and
     * populated in the returned user object.
     *
     * @param userId the user id
     * @param fields the comma separated list if user fields
     * @return the user
     */
    User getUserProfile(String userId, String fields);

    /**
     * Send API for sending messages to users.
     */
    SendOperations send();
}