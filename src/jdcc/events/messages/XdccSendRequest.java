package jdcc.events.messages;

import jdcc.events.handler.EventHandler;

public class XdccSendRequest extends XdccMessage {
    @Override
    public void handle(EventHandler handler) {
        handler.handle(this);
    }
}
