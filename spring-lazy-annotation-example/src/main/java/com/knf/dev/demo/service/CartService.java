package com.knf.dev.demo.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class CartService {

    public CartService() {
        System.out.println("Inside CartService Constuctor");
    }
}
