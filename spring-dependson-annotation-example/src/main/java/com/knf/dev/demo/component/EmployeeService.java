package com.knf.dev.demo.component;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"adminService", "userService"})
public class EmployeeService {

    public EmployeeService() {
        System.out.println("Inside EmployeeService Constuctor");
    }
}
