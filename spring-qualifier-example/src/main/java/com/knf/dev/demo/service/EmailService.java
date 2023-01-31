package com.knf.dev.demo.service;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{
    @Override
    public void sendMessage() {
        System.out.println("Sending Email");
    }
}
