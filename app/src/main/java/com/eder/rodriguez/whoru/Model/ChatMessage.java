package com.eder.rodriguez.whoru.Model;

import java.util.Date;

/**
 * Created by ederr on 6/3/2018.
 */

public class ChatMessage {
    private String message;
    private String user;
    private long time;

    // Chat constructors
    public ChatMessage() {}
    public ChatMessage(String message, String user){
        this.message = message;
        this.user = user;
        this.time = new Date().getTime();
    }

    // Chat attribute getters.
    public String getMessage(){
        return this.message;
    }
    public String getUser() {
        return this.user;
    }
    public long getTime(){
        return this.time;
    }

    // Chat attribute setters.
    public void setMessage(String message){
        this.message = message;
    }
    public void setUser(String user){
        this.user = user;
    }
    public void setTime(long time){
        this.time = time;
    }
}
