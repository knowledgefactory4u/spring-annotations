package com.knf.dev.demo;


import com.knf.dev.demo.component.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {


   public static void main(String[] args) {

       ConfigurableApplicationContext context =
               SpringApplication.run(Application.class, args);
       User user = context. getBean(User. class);
       System.out.println(user. assignRole("Admin"));
       System.out.println( user. assignRole("Super User"));

       context.close();
   }

}