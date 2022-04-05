package com.cy.store.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * preHandle方法将在请求处理之前被调用。SpringMVC中的Interceptor是链式的调用，在一个应用或一个请求中可以同时存在多个Interceptor。
 * 每个Interceptor的调用会依据它的声明顺序依次执行，而且最先执行的都是Interceptor中的preHandle()方法，
 * 所以可以在这个方法中进行一些前置初始化操作或者是对当前请求的一个预处理，也可以在这个方法中进行一些判断来决定请求是否要继续进行下去。
 * 该方法的返回值是布尔值类型，当返回false时，表示请求结束，后续的Interceptor和Controller都不会再执行；
 * 当返回值true时，就会继续调用下一个Interceptor的preHandle方法，如果已经是最后一个Interceptor的时，就会调用当前请求的Controller方法。
 */

/** 定义处理器拦截器 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //全局session中 uid == null
        if (request.getSession().getAttribute("uid") == null) {
            response.sendRedirect("/web/login.html");

            return false;
        }
        //uid != null
        return true;
    }
}
