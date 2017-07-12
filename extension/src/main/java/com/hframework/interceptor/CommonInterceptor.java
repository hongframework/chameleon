package com.hframework.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zqh on 2016/4/11.
 */
public class CommonInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(CommonInterceptor.class);


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler1) throws Exception {

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
