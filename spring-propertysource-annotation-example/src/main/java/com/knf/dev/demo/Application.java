package com.knf.dev.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@PropertySource(value = "knowledgefactory.properties")
@PropertySource(value = "message.properties")
@PropertySource(value = "db.properties")
public class Application implements CommandLineRunner {

    @Value("${knf.message}")
    private String knfMessage;

    @Value("${hello.message}")
    private String hello;
    @Value("${language.list}")
    private List<String> languageList;

    @Value("#{${user.details}}")
    private Map<String, String> userDetails;

    @Autowired
    Environment env;

   public static void main(String[] args) {
               SpringApplication.run(Application.class, args);
   }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Knowledgefactory message= " + knfMessage);
        System.out.println("List of all users== " + languageList);
        System.out.println("User details= " + userDetails);
        System.out.println("Hello world message= " + hello);
        System.out.println("DB DRIVER CLASS="+
                env.getProperty("DB_DRIVER_CLASS"));
        System.out.println("DB URL="+env.getProperty("DB_URL"));
        System.out.println("DB USERNAME="+
                env.getProperty("DB_USERNAME"));
        System.out.println("DB PASSWORD="+
                env.getProperty("DB_PASSWORD"));
    }
}