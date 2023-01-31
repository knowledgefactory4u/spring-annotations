package com.knf.dev.demo.service;

public class PayPalService implements PaymentService{
    @Override
    public void processPayment() {
        System.out.println("Paypal payment processing");
    }
}
