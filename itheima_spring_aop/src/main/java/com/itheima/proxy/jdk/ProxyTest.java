package com.itheima.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {



    public static void main(String[] args) {
        Target target =new Target();
        Advice advice = new Advice();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                advice.before();
                method.invoke(target, args);
                advice.after();
                return null;
            }
        });
        proxy.save();


    }
}
