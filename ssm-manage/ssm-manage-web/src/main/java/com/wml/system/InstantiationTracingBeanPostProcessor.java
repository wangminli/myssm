package com.wml.system;

/**
 * Decription: 打印所有生成的bean，用于排查
 * // TODO 目前mapper的bean无法打印，检查！
 * Created by WangMinli on 2017/12/26.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
    private static final Logger log = LoggerFactory.getLogger(ControllerAOP.class);

    // simply return the instantiated bean as-is
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    //在创建bean后输出bean的信息
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}

