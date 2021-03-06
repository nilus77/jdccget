package jdcc.events.messages;

import jdcc.events.handler.EventHandler;

public class ServerConnectionRequest extends Message {

    public String serverName = "";
    public String serverPassword = null;
    public int port = 6667;
    public String nickname = "";
    public String realname = "";
    public String loginname = "";

    @Override
    public void handle(EventHandler handler) {
        handler.handle(this);
    }
}
