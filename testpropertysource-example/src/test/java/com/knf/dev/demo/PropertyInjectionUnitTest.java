package com.knf.dev.demo;

import com.knf.dev.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = {
        "demo.app.key=4567"
})
public class PropertyInjectionUnitTest {

    @Autowired
    private MyService myService;


    @Test
    public void testMyService() {
        assertEquals("Rahul", myService.getUserName());
        assertEquals("4567", myService.getKey());
    }
}
