package com.wml.system;

import com.wml.ssm.manage.mapper.SysExceptionLogMapper;
import com.wml.ssm.manage.pojo.SysExceptionLog;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Decription: 捕获全局异常，统一处理,未捕获的异常在这里处理
 * Created by WangMinli on 2017/12/26.
 */
public class ExceptionResolver implements HandlerExceptionResolver {
   /* @Autowired
    private SysExceptionLogMapper sysExceptionLogMapper;*/

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object handler, Exception ex) {
        DynamicDataSource.setCustomerType(DynamicDataSource.LOCAL_DATASOURCE); //指定数据源，防止被其他方法篡改

        SysExceptionLogMapper sysExceptionLogMapper = (SysExceptionLogMapper)ServiceLocator.getBean("sysExceptionLogMapper");
        // 异常处理，例如将异常信息存储到数据库
        sysExceptionLogMapper.insert(new SysExceptionLog(ex));
        System.out.println("========resolveException()=========");
        // 视图显示专门的错误页
        // TODO: 2017/12/26  目前errorPage还无法指向，检查！
        ModelAndView modelAndView = new ModelAndView("errorPage");
        return modelAndView; // 如返回null，则会显示<error-page>定义的异常页
    }
}
