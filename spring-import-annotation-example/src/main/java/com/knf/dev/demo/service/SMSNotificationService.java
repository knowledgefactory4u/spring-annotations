package com.knf.dev.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService {

    public SMSNotificationService() {
        System.out.println("Inside SMSNotificationService Constructor");
    }

    public void sendSmsNotification()
    {
        System.out.println("Sending SMS Notification");
    }

}
