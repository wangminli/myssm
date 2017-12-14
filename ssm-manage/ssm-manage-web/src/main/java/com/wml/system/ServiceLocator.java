package com.wml.system;

import org.springframework.context.ApplicationContext;

/**
 * 动态获取Service
 * eg: 		OverdueRepaymentService overdueRepaymentService = (OverdueRepaymentService) ServiceLocator.getBean("overdueRepaymentService");
 */
public class ServiceLocator {
	private static ApplicationContext context;
	public static ApplicationContext getContext() {
		return context;
	}
	public static void setContext(ApplicationContext context){
		ServiceLocator.context = context;
	}
	public static Object getBean(String name){
		return  context.getBean(name);
	}
}