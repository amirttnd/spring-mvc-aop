package com.demo.springmvcaop.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String sayHey(String message) {
        return String.format("Hello %s,", message);
    }

    public String sayBye(String message) {
        return String.format("Hello %s,", message);
    }
}
