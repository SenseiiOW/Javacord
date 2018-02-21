package de.btobastian.javacord.listeners.user;


import de.btobastian.javacord.events.user.UserStartTypingEvent;
import de.btobastian.javacord.listeners.GloballyAttachableListener;
import de.btobastian.javacord.listeners.ObjectAttachableListener;
import de.btobastian.javacord.listeners.TextChannelAttachableListener;
import de.btobastian.javacord.listeners.server.ServerAttachableListener;

/**
 * This listener listens to users typing.
 * If the user starts typing the "xyz is typing..." message is displayed for 5 seconds.
 * It also stops if the user sent a message.
 */
@FunctionalInterface
public interface UserStartTypingListener extends ServerAttachableListener, UserAttachableListener,
                                                 TextChannelAttachableListener, GloballyAttachableListener,
                                                 ObjectAttachableListener {

    /**
     * This method is called every time a user started typing.
     *
     * @param event The event.
     */
    void onUserStartTyping(UserStartTypingEvent event);
}
