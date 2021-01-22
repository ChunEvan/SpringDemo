package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    private void before(){
        System.out.println("before ...");
    }

    private void afterRetuning(){
        System.out.println("afterRetuning ...");
    }



    private Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around 前 ...");
        Object proceed = point.proceed();
        System.out.println("around 后 ...");
        return proceed;
    }

    public void afterThowing(){
        System.out.println("afterThowing ...");
    }

    private void after(){
        System.out.println("after ...");
    }
}
