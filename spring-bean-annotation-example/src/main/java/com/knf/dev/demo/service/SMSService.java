package com.knf.dev.demo.service;


public class SMSService implements MessageService{

    private String message;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
