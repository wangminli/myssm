package com.wml.system;

import com.wml.ssm.manage.pojo.CheckException;
import com.wml.ssm.manage.pojo.ResultBean;
import com.wml.ssm.manage.pojo.UnloginException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Decription:职能主要用来记录日志信息，异常交由ExceptionResolver处理
 * Created by WangMinli on 2017/12/21.
 */
public class ControllerAOP {
    static{
        System.out.println("=====controllerAOP=======");
    }

    private static final Logger logger = LoggerFactory.getLogger(ControllerAOP.class);

    public Object handlerControllerMethod(ProceedingJoinPoint pjp) {
        System.out.println("=====handlerControllerMethod======");
        long startTime = System.currentTimeMillis();

        ResultBean<?> result;

        try {
            result = (ResultBean<?>) pjp.proceed();
            logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
        } catch (Throwable e) {
            result = handlerException(pjp, e);
        }

        return result;

    }
    public void addLog() {
        System.out.println("=====exec aop addLog()=====");
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
        System.out.println("=======handlerException=======");
        ResultBean<?> result = new ResultBean();

        // 已知异常
        if (e instanceof CheckException) {
            System.out.println("======is CheckException=======");


            result.setMsg(e.getLocalizedMessage());
            result.setCode(ResultBean.FAIL);
        } else if (e instanceof UnloginException) {
            System.out.println("======is UnloginException=======");

            result.setMsg("Unlogin");
            result.setCode(ResultBean.NO_LOGIN);
        } else {
            System.out.println("======is esle Exception=======");

            logger.error(pjp.getSignature() + " error ", e);
            //TODO 未知的异常，应该格外注意，可以发送邮件通知等
            result.setMsg(e.toString());
            result.setCode(ResultBean.FAIL);
        }

        return result;
    }
}