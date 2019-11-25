package edu.dlufl.ohrigei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class OhrigeiApplication {
    public static void main(String[] args) {
        SpringApplication.run(OhrigeiApplication.class, args);
    }

}