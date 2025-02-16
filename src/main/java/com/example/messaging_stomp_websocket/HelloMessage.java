package com.example.messaging_stomp_websocket;

public class HelloMessage {

    private String name;

    public HelloMessage() {
        //empty constuctor
    }

    public HelloMessage(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}
