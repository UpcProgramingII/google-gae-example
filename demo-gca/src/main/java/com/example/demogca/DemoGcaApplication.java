package com.example.demogca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGcaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGcaApplication.class, args);
	}
        
        @GetMapping("/")
        public String hello(){
            
            return "Hello App Engine";
            
        }

}
