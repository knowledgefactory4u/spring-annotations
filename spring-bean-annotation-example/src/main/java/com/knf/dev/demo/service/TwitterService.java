package com.knf.dev.demo.service;

public class TwitterService implements MessageService{

    private String message;
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
      this.message = message;
    }

    public void init() {
        System.out.println("init method called");
    }

    public void destroy() {
        System.out.println("destroy method called");
    }
}
