package com.knf.dev.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserRoleService implements RoleService {
    @Override
    public void printRole() {
        System.out.println("User Role");
    }
}
