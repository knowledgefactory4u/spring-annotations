package com.knf.dev.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @RequestMapping("/employee")
    public String getEmployee() {
        return "Employee";
    }
}