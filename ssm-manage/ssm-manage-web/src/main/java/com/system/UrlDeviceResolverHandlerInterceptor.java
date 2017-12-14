package com.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.DeviceResolverHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 2017/12/14.
 */
public class UrlDeviceResolverHandlerInterceptor extends DeviceResolverHandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(UrlDeviceResolverHandlerInterceptor.class);

    public UrlDeviceResolverHandlerInterceptor() {

    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String uri = request.getRequestURI();
        Object account = request.getSession().getAttribute("loginData");
        log.info("====interceptor===="+uri);
        if(uri.contains("/login/tologin")
                ||uri.contains("/welcome.jsp")
                ||uri.contains("/login/entry")
                ||uri.contains("/repayment/apply")
                ||uri.contains("/repayment/overdueApply")
                ||uri.contains("/repayment/overdueChangeBill")){
            return super.preHandle(request, response, handler);
        }
        //登录模块的设计
       /* if(null == account){//未登录
            response.sendRedirect(request.getContextPath() +"/login/tologin");
            return false;
        }*/
        return super.preHandle(request, response, handler);
    }
}
