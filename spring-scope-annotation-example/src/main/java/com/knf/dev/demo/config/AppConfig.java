package com.knf.dev.demo.config;

import com.knf.dev.demo.service.MessageService;
import com.knf.dev.demo.service.SMSService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="smsService")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MessageService smsService() {
        return new SMSService();
    }
}
