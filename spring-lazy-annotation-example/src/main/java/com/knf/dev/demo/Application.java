package com.knf.dev.demo;


import com.knf.dev.demo.service.CartService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

   public static void main(String[] args) {

       ConfigurableApplicationContext context =
               SpringApplication.run(Application.class, args);

        SMSService smsService = context.getBean(SMSService.class);
        CartService cartService = context.getBean(CartService.class);

       context.close();
   }
}