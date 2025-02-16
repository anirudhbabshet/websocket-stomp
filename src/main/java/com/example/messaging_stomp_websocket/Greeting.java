package com.example.messaging_stomp_websocket;

public class Greeting {

    private String content;

    public Greeting() {
        // empty constructor
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
