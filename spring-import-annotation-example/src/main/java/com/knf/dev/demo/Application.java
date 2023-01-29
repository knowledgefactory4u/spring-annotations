package com.knf.dev.demo;


import email.service.EmailNotificationService;
import com.knf.dev.demo.service.SMSNotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(EmailNotificationService.class)
public class Application  {


   public static void main(String[] args) {
           ConfigurableApplicationContext context =
                   SpringApplication.run(Application.class, args);

       EmailNotificationService emailNotificationService =
               context.getBean(EmailNotificationService.class);
       emailNotificationService.sendEmailNotification();

       context.close();
   }
}
