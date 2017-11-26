package com.demo.springmvcaop.controller;

import com.demo.springmvcaop.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping(value = "/sayHey")
    @ResponseBody
    String sayHey(@RequestParam(name = "message",required = false) String message) {
        return homeService.sayHey(message);
    }

    @RequestMapping(value = "/sayBye")
    @ResponseBody
    String sayBye(@RequestParam(name = "message",required = false) String message) {
        return homeService.sayBye(message);
    }

}
