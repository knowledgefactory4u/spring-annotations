package com.knf.dev.demo;


import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {


   public static void main(String[] args) {
       ConfigurableApplicationContext context =
               SpringApplication.run(Application.class, args);

       EmailService emailService = context.
               getBean(EmailService.class);
       System.out.println(emailService.getMessage());
       System.out.println(emailService.getType());

       SMSService smsService = context.
               getBean(SMSService.class);
       System.out.println(smsService.getMessage());
       System.out.println(smsService.getType());

       context.close();
   }

}