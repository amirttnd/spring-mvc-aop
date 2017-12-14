package com.demo.springmvcaop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAdvice {

    @AfterReturning(pointcut = "execution(* com.demo.springmvcaop.service.HomeService.say*(String))", returning = "returnValue")
    public void afterReturning(String returnValue) {
        System.out.println("Return value========="+returnValue);
    }
}
