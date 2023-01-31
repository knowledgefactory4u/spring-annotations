package com.knf.dev.demo.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending SMS");
    }
}
