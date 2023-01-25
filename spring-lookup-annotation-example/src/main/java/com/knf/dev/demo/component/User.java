package com.knf.dev.demo.component;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Lookup
    public Role createRole() {
        return null;
    };

    public String assignRole(String name) {
        Role role = createRole();
        role. setName(name);
        return  "User role is " + role. getName();
    }
}