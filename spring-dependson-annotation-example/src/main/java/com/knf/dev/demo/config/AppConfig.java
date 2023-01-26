package com.knf.dev.demo.config;

import com.knf.dev.demo.service.EmailService;
import com.knf.dev.demo.service.SMSService;
import com.knf.dev.demo.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfig {

    @Bean
    @DependsOn({"twitterService", "emailService"})
    public SMSService smsService()
    {
        return new SMSService();
    }

    @Bean
    public TwitterService twitterService()
    {
        return new TwitterService();
    }

    @Bean
    public EmailService emailService()
    {
        return new EmailService();
    }
}
