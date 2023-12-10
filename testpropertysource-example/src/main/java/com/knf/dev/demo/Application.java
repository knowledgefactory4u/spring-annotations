package com.knf.dev.demo;

import com.knf.dev.demo.service.MyService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

	private final MyService myService;

	public Application(MyService myService) {
		this.myService = myService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("Username => "+ myService.getUserName());
		System.out.println("key => "+ myService.getKey());
	}
}
