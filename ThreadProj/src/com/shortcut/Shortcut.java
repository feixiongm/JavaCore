package com.shortcut;

import java.time.ZonedDateTime;

public class Shortcut {

    private String message;
    private ZonedDateTime timestamp;

    public Shortcut() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public  static void main(String[] args) {
        messageprint("hello world");
    }

    private static void messageprint(String message) {
        System.out.println(message);
    }
}
