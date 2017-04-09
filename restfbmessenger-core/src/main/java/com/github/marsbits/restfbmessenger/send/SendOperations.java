/*
 * Copyright 2015-2017 the original author or authors.
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

package com.github.marsbits.restfbmessenger.send;

import com.restfb.exception.FacebookException;
import com.restfb.types.send.ButtonTemplatePayload;
import com.restfb.types.send.GenericTemplatePayload;
import com.restfb.types.send.ListTemplatePayload;
import com.restfb.types.send.MediaAttachment;
import com.restfb.types.send.Message;
import com.restfb.types.send.MessageRecipient;
import com.restfb.types.send.NotificationTypeEnum;
import com.restfb.types.send.QuickReply;
import com.restfb.types.send.ReceiptTemplatePayload;
import com.restfb.types.send.SendResponse;
import com.restfb.types.send.SenderActionEnum;
import com.restfb.types.send.TemplateAttachment;
import com.restfb.types.send.airline.AirlineBoardingPassTemplatePayload;
import com.restfb.types.send.airline.AirlineCheckinTemplatePayload;
import com.restfb.types.send.airline.AirlineItineraryTemplatePayload;
import com.restfb.types.send.airline.AirlineUpdateTemplatePayload;

import java.util.List;

/**
 * Interface specifying the operations for the Send API.
 *
 * @author Marcel Overdijk
 * @since 1.0.0
 */
public interface SendOperations {

    /**
     * Sends the given sender action to the user.
     *
     * @param recipient    the recipient
     * @param senderAction the sender action
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse senderAction(MessageRecipient recipient, SenderActionEnum senderAction) throws FacebookException;

    /**
     * Sends the given sender action to the user.
     *
     * @param recipient        the recipient
     * @param senderAction     the sender action
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse senderAction(MessageRecipient recipient, SenderActionEnum senderAction, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends a read receipt to the user.
     *
     * @param recipient the recipient
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse markSeen(MessageRecipient recipient) throws FacebookException;

    /**
     * Sends a read receipt to the user.
     *
     * @param recipient        the recipient
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse markSeen(MessageRecipient recipient, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends a typing indicator on to the user.
     *
     * @param recipient the recipient
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse typingOn(MessageRecipient recipient) throws FacebookException;

    /**
     * Sends a typing indicator on to the user.
     *
     * @param recipient        the recipient
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse typingOn(MessageRecipient recipient, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends a typing indicator off to the user.
     *
     * @param recipient the recipient
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse typingOff(MessageRecipient recipient) throws FacebookException;

    /**
     * Sends a typing indicator off to the user.
     *
     * @param recipient        the recipient
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse typingOff(MessageRecipient recipient, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given message to the user.
     *
     * @param recipient the recipient
     * @param message   the message
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse message(MessageRecipient recipient, Message message) throws FacebookException;

    /**
     * Sends the given message to the user.
     *
     * @param recipient the recipient
     * @param message   the message
     * @param tag message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse message(MessageRecipient recipient, Message message, MessageTagEnum tag) throws FacebookException;

    /**
     * Sends the given message to the user.
     *
     * @param recipient        the recipient
     * @param message          the message
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse message(MessageRecipient recipient, Message message, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given message to the user.
     *
     * @param recipient        the recipient
     * @param message          the message
     * @param notificationType the push notification type
     * @param tag message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse message(MessageRecipient recipient, Message message, NotificationTypeEnum notificationType, MessageTagEnum tag) throws FacebookException;

    /**
     * Sends the given text message to the user.
     *
     * @param recipient the recipient
     * @param text      the text message
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse textMessage(MessageRecipient recipient, String text) throws FacebookException;

    /**
     * Sends the given text message to the user.
     *
     * @param recipient the recipient
     * @param text      the text message
     * @param tag message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse textMessage(MessageRecipient recipient, String text, MessageTagEnum tag) throws FacebookException;

    /**
     * Sends the given text message to the user.
     *
     * @param recipient        the recipient
     * @param text             the text message
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse textMessage(MessageRecipient recipient, String text, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given text message to the user.
     *
     * @param recipient        the recipient
     * @param text             the text message
     * @param notificationType the push notification type
     * @param tag message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse textMessage(MessageRecipient recipient, String text, NotificationTypeEnum notificationType, MessageTagEnum tag) throws FacebookException;

    /**
     * Sends the given attachment to the user.
     *
     * @param recipient the recipient
     * @param type      the type of the attachment
     * @param url       the url of the attachment
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse attachment(MessageRecipient recipient, MediaAttachment.Type type, String url) throws FacebookException;

    /**
     * Sends the given attachment to the user.
     *
     * @param recipient        the recipient
     * @param type             the type of the attachment
     * @param url              the url of the attachment
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse attachment(MessageRecipient recipient, MediaAttachment.Type type, String url, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given image to the user.
     *
     * @param recipient the recipient
     * @param url       the url of the image
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse imageAttachment(MessageRecipient recipient, String url) throws FacebookException;

    /**
     * Sends the given image to the user.
     *
     * @param recipient        the recipient
     * @param url              the url of the image
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse imageAttachment(MessageRecipient recipient, String url, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given audio to the user.
     *
     * @param recipient the recipient
     * @param url       the url of the audio
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse audioAttachment(MessageRecipient recipient, String url) throws FacebookException;

    /**
     * Sends the given audio to the user.
     *
     * @param recipient        the recipient
     * @param url              the url of the audio
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse audioAttachment(MessageRecipient recipient, String url, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given video to the user.
     *
     * @param recipient the recipient
     * @param url       the url of the video
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse videoAttachment(MessageRecipient recipient, String url) throws FacebookException;

    /**
     * Sends the given video to the user.
     *
     * @param recipient        the recipient
     * @param url              the url of the video
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse videoAttachment(MessageRecipient recipient, String url, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given file to the user.
     *
     * @param recipient the recipient
     * @param url       the url of the file
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse fileAttachment(MessageRecipient recipient, String url) throws FacebookException;

    /**
     * Sends the given file to the user.
     *
     * @param recipient        the recipient
     * @param url              the url of the file
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse fileAttachment(MessageRecipient recipient, String url, NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given text message and quick replies to the user.
     *
     * @param recipient    the recipient
     * @param text         the text message
     * @param quickReplies the quick replies
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, String text, List<QuickReply> quickReplies) throws FacebookException;

    /**
     * Sends the given text message and quick replies to the user.
     *
     * @param recipient        the recipient
     * @param text             the text message
     * @param quickReplies     the quick replies
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, String text, List<QuickReply> quickReplies, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given text message and quick replies to the user.
     *
     * @param recipient        the recipient
     * @param text             the text message
     * @param quickReplies     the quick replies
     * @param tag message tag
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, String text, List<QuickReply> quickReplies, NotificationTypeEnum notificationType, MessageTagEnum tag)
            throws FacebookException;


    /**
     * Sends the given text message and quick replies to the user.
     *
     * @param recipient        the recipient
     * @param text             the text message
     * @param quickReplies     the quick replies
     * @param tag message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, String text, List<QuickReply> quickReplies, MessageTagEnum tag)
            throws FacebookException;

    /**
     * Sends the given media attachment and quick replies to the user.
     *
     * @param recipient    the recipient
     * @param attachment   the media attachment
     * @param quickReplies the quick replies
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, MediaAttachment attachment, List<QuickReply> quickReplies)
            throws FacebookException;

    /**
     * Sends the given media attachment and quick replies to the user.
     *
     * @param recipient        the recipient
     * @param attachment       the media attachment
     * @param quickReplies     the quick replies
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, MediaAttachment attachment, List<QuickReply> quickReplies,
            NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given template attachment and quick replies to the user.
     *
     * @param recipient    the recipient
     * @param attachment   the template attachment
     * @param quickReplies the quick replies
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, TemplateAttachment attachment, List<QuickReply> quickReplies)
            throws FacebookException;

    /**
     * Sends the given template attachment and quick replies to the user.
     *
     * @param recipient        the recipient
     * @param attachment       the template attachment
     * @param quickReplies     the quick replies
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse quickReplies(MessageRecipient recipient, TemplateAttachment attachment, List<QuickReply> quickReplies,
            NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given button template to the user.
     *
     * @param recipient      the recipient
     * @param buttonTemplate the button template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse buttonTemplate(MessageRecipient recipient, ButtonTemplatePayload buttonTemplate) throws FacebookException;

    /**
     * Sends the given button template to the user.
     *
     * @param recipient        the recipient
     * @param buttonTemplate   the button template
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse buttonTemplate(MessageRecipient recipient, ButtonTemplatePayload buttonTemplate, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given generic template to the user.
     *
     * @param recipient       the recipient
     * @param genericTemplate the generic template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse genericTemplate(MessageRecipient recipient, GenericTemplatePayload genericTemplate) throws FacebookException;

    /**
     * Sends the given generic template to the user.
     *
     * @param recipient       the recipient
     * @param genericTemplate the generic template
     * @param tag the message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse genericTemplate(MessageRecipient recipient, GenericTemplatePayload genericTemplate, MessageTagEnum tag) throws FacebookException;

    /**
     * Sends the given generic template to the user.
     *
     * @param recipient        the recipient
     * @param genericTemplate  the generic template
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse genericTemplate(MessageRecipient recipient, GenericTemplatePayload genericTemplate, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given generic template to the user.
     *
     * @param recipient        the recipient
     * @param genericTemplate  the generic template
     * @param notificationType the push notification type
     * @param tag the message tag
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse genericTemplate(MessageRecipient recipient, GenericTemplatePayload genericTemplate, NotificationTypeEnum notificationType, MessageTagEnum tag)
            throws FacebookException;

    /**
     * Sends the given list template to the user.
     *
     * @param recipient    the recipient
     * @param listTemplate the list template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse listTemplate(MessageRecipient recipient, ListTemplatePayload listTemplate) throws FacebookException;

    /**
     * Sends the given list template to the user.
     *
     * @param recipient        the recipient
     * @param listTemplate     the list template
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse listTemplate(MessageRecipient recipient, ListTemplatePayload listTemplate, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given receipt template to the user.
     *
     * @param recipient       the recipient
     * @param receiptTemplate the receipt template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse receiptTemplate(MessageRecipient recipient, ReceiptTemplatePayload receiptTemplate) throws FacebookException;

    /**
     * Sends the given receipt template to the user.
     *
     * @param recipient        the recipient
     * @param receiptTemplate  the receipt template
     * @param notificationType the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse receiptTemplate(MessageRecipient recipient, ReceiptTemplatePayload receiptTemplate, NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given airline itinerary template to the user.
     *
     * @param recipient                the recipient
     * @param airlineItineraryTemplate airline itinerary template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineItineraryTemplate(MessageRecipient recipient, AirlineItineraryTemplatePayload airlineItineraryTemplate)
            throws FacebookException;

    /**
     * Sends the given airline itinerary template to the user.
     *
     * @param recipient                the recipient
     * @param airlineItineraryTemplate airline itinerary template
     * @param notificationType         the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineItineraryTemplate(MessageRecipient recipient, AirlineItineraryTemplatePayload airlineItineraryTemplate,
            NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given airline checkin template to the user.
     *
     * @param recipient              the recipient
     * @param airlineCheckinTemplate airline checkin template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineCheckinTemplate(MessageRecipient recipient, AirlineCheckinTemplatePayload airlineCheckinTemplate)
            throws FacebookException;

    /**
     * Sends the given airline checkin template to the user.
     *
     * @param recipient              the recipient
     * @param airlineCheckinTemplate airline checkin template
     * @param notificationType       the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineCheckinTemplate(MessageRecipient recipient, AirlineCheckinTemplatePayload airlineCheckinTemplate,
            NotificationTypeEnum notificationType) throws FacebookException;

    /**
     * Sends the given airline boarding pass template to the user.
     *
     * @param recipient                   the recipient
     * @param airlineBoardingPassTemplate airline boarding pass template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineBoardingPassTemplate(MessageRecipient recipient, AirlineBoardingPassTemplatePayload airlineBoardingPassTemplate)
            throws FacebookException;

    /**
     * Sends the given airline boarding pass template to the user.
     *
     * @param recipient                   the recipient
     * @param airlineBoardingPassTemplate airline boarding pass template
     * @param notificationType            the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineBoardingPassTemplate(MessageRecipient recipient, AirlineBoardingPassTemplatePayload airlineBoardingPassTemplate,
            NotificationTypeEnum notificationType)
            throws FacebookException;

    /**
     * Sends the given airline update template to the user.
     *
     * @param recipient             the recipient
     * @param airlineUpdateTemplate airline update template
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineUpdateTemplate(MessageRecipient recipient, AirlineUpdateTemplatePayload airlineUpdateTemplate)
            throws FacebookException;

    /**
     * Sends the given airline update template to the user.
     *
     * @param recipient             the recipient
     * @param airlineUpdateTemplate airline update template
     * @param notificationType      the push notification type
     * @return the {@code SendResponse}
     * @throws FacebookException in case an error occurs while performing the Facebook API call
     */
    SendResponse airlineUpdateTemplate(MessageRecipient recipient, AirlineUpdateTemplatePayload airlineUpdateTemplate,
            NotificationTypeEnum notificationType) throws FacebookException;
}
