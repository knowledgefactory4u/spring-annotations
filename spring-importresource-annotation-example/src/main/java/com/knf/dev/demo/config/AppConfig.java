package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

@Configuration
@ImportResource("classpath:/app-config.xml")
public class AppConfig {

    @Bean
    public EmailService emailService() {
        EmailService emailService = new EmailService();
        emailService.setMessage("Email message");
        emailService.setType("Email");
        return emailService;
    }

}