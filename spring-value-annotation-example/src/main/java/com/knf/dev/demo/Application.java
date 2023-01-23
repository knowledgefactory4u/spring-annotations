package com.knf.dev.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {

   @Value("Hi, This is a static message.")
   private String staticMessage;

   @Value("${knf.message}")
   private String knfMessage;

   @Value("${user.message: Hi, I'm a default user.}")
   private String defaultUserMessage;

   @Value("${language.list}")
   private List<String> languageList;

   @Value("#{${user.details}}")
   private Map<String, String> userDetails;

   @Value("#{userService.message}")
   private String userMessage;

   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {

      System.out.println("Static message= " + staticMessage);
      System.out.println("Knowledgefactory message= " + knfMessage);
      System.out.println("Default User message= " + defaultUserMessage);
      System.out.println("List of all users== " + languageList);
      System.out.println("User details= " + userDetails);
      System.out.println("User message= " + userMessage);
   }
}