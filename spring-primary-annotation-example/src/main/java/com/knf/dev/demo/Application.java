package com.knf.dev.demo;


import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  implements CommandLineRunner {

    @Autowired
    MessageService messageService;

    @Autowired
    RoleService roleService;

   public static void main(String[] args) {
              SpringApplication.run(Application.class, args);
   }

    @Override
    public void run(String... args) throws Exception {
        messageService.printMessaage();
        roleService.printRole();
    }
}