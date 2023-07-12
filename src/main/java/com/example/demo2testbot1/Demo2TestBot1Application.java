package com.example.demo2testbot1;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Demo2TestBot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2TestBot1Application.class, args);
    }

}
