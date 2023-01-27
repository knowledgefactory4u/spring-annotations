package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.SMSService;
import com.knf.dev.demo.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService smsService() {
        return new SMSService();
    }

    @Bean(name= {"myEmailService","systemEmailService"})
    public MessageService emailService() {
        return new EmailService();
    }

    @Bean(initMethod="init", destroyMethod="destroy")
    public MessageService twitterService() {
        return new TwitterService();
    }

}
