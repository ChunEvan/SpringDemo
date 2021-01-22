package com.itheima.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
@ComponentScan()
public class MyAspect {

    @Before("execution(* com.itheima.anno.*.*(..))")
    private void before(){
        System.out.println("before ...");
    }

    @AfterReturning("execution(* com.itheima.anno.*.*(..))")
    private void afterRetuning(){
        System.out.println("afterRetuning ...");
    }

    @Around("execution(* com.itheima.anno.*.*(..))")
    private Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around 前 ...");
        Object proceed = point.proceed();
        System.out.println("around 后 ...");
        return proceed;
    }

    @AfterThrowing("execution(* com.itheima.anno.*.*(..))")
    public void afterThowing(){
        System.out.println("afterThowing ...");
    }

    @After("execution(* com.itheima.anno.*.*(..))")
    private void after(){
        System.out.println("after ...");
    }


}
