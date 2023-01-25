package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public SMSService smsService() {
        return new SMSService();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

}