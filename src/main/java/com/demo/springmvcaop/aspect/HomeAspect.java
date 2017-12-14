package com.demo.springmvcaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class HomeAspect {

    @Before("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public void before(JoinPoint joinPoint) {
        System.out.println("<====Before Advice=====>");
    }

    @After("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public void after(JoinPoint joinPoint) {
        System.out.println("<====After Advice=====>");
    }

    @AfterReturning("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("<====After Returning Advice=====>");
    }

    @Around("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public void around(JoinPoint joinPoint) {
        System.out.println("<====Around Advice=====>");
    }
}
