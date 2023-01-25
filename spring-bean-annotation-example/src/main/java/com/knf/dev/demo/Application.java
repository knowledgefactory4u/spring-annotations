package com.knf.dev.demo;


import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.SMSService;
import com.knf.dev.demo.service.TwitterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application  {


   public static void main(String[] args) {
      ConfigurableApplicationContext context =
              SpringApplication.run(Application.class, args);

      MessageService smsService = context.
              getBean(SMSService.class);
      smsService.
              setMessage("SMSMessageService Implementation");
      System.out.println(smsService.getMessage());

      MessageService emailService = (MessageService) context.
              getBean("myEmailService");
      emailService.
              setMessage("EmailMessageService Implementation");
      System.out.println(emailService.getMessage());

      MessageService twitterService = context.
              getBean(TwitterService.class);
      twitterService.
              setMessage("TwitterMessageService Implementation");
      System.out.println(twitterService.getMessage());

      context.close();
   }
}