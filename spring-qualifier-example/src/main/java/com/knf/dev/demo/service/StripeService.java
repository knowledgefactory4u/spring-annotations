package com.knf.dev.demo.service;

public class StripeService implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Stripe payment processing");
    }
}
