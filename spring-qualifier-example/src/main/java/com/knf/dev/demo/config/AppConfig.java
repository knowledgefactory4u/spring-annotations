package com.knf.dev.demo.config;

import com.knf.dev.demo.service.PaymentService;
import com.knf.dev.demo.service.PayPalService;
import com.knf.dev.demo.service.StripeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("payPalService")
    public PaymentService paypalService()
    {
        return new PayPalService();
    }

    @Bean("stripeService")
    public PaymentService stripeService()
    {
        return new StripeService();
    }
}
