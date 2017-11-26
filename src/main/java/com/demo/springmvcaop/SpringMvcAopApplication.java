package com.demo.springmvcaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringMvcAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcAopApplication.class, args);
    }
}
