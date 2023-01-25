package com.knf.dev.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class AdminRoleService implements RoleService {
    @Override
    public void printRole() {
        System.out.println("Admin Role");
    }
}
