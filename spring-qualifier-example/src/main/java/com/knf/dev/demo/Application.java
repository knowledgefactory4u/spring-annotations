package com.knf.dev.demo;

import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

   @Autowired
   @Qualifier("smsService")
   MessageService service;

   @Autowired
   @Qualifier("stripeService")
   PaymentService paymentService;


   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {

   service.sendMessage();
   paymentService.processPayment();

   }
}