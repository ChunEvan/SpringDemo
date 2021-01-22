package com.itheima.resolver;

import com.itheima.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof MyException){
            modelAndView.addObject("info", "MyException");
        }else if (e instanceof ClassCastException){
            modelAndView.addObject("info", "ClassCastException");
        }
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
