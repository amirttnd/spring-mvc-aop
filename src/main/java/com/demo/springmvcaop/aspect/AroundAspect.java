package com.demo.springmvcaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

//@Aspect
@Component
public class AroundAspect {

    @Around("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public Object syaHey(ProceedingJoinPoint proceedingJoinPoint) {
        Object value = null;
        try {
            System.out.println("Before calling actual method");
            value = proceedingJoinPoint.proceed();
            System.out.println("After calling actual method");

        } catch (Throwable e) {
            e.printStackTrace();
        }
        return value+" , welcome here";
    }
}
