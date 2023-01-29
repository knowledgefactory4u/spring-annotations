package email.service;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {

    public EmailNotificationService() {
        System.out.println("Inside EmailNotificationService Constructor");
    }

    public void sendEmailNotification()
    {
        System.out.println("Sending Email Notification");
    }

}