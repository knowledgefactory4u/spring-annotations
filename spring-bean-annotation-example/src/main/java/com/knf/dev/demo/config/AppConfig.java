package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.SMSService;
import com.knf.dev.demo.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SMSService smsService() {
        return new SMSService();
    }

    @Bean(name= {"myEmailService","systemEmailService"})
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean(initMethod="init", destroyMethod="destroy")
    public TwitterService twitterService() {
        return new TwitterService();
    }

}