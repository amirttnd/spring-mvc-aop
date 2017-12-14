package com.demo.springmvcaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Aspect
@Component
public class PointcutReuse {

    @Before("welcome()")
    public void sayHey(JoinPoint joinPoint) {
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("=====================Hey, Reuse pointcut================");
    }

    @After("welcome()")
    public void sayBye(JoinPoint joinPoint) {
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println("=====================Bye, Reuse pointcut================");
    }

    @Pointcut("execution(* com.demo.springmvcaop.service.HomeService.say*(String))")
    public void welcome() {

    }
}
