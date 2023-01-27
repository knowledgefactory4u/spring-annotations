package com.knf.dev.demo;


import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application  {


   public static void main(String[] args) {
      ConfigurableApplicationContext context =
              SpringApplication.run(Application.class, args);

      //Example using Annotation based (@Service) configuration
      MessageService emailService = context.
              getBean(EmailService.class);
      emailService.
              setMessage("EmailMessageService Implementation");
      System.out.println(emailService.getMessage());

      MessageService emailService1 = context.
              getBean(EmailService.class);
      System.out.println(emailService1.getMessage());


      //Example using Java-based configuration
      MessageService smsService = (MessageService) context.
              getBean("smsService");
      smsService.
              setMessage("SMSMessageService Implementation");
      System.out.println(smsService.getMessage());

      MessageService smsService1 = (MessageService) context.
              getBean("smsService");
      System.out.println(smsService1.getMessage());

      context.close();
   }
}
