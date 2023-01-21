package com.knf.dev.demo.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public String getUser()
    {
        return "I am the User";
    }
}
