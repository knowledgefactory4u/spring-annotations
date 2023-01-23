package com.knf.dev.demo;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    public String message()
    {
        return "Hello, I'm a User";
    }
}
