package com.wml.system;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 自定义启动器，在这里可以配置其他自动启动的项
 * @author 王民利
 * @date 2017年2月16日 下午2:07:13
 */
public class StartupListener extends ContextLoaderListener implements ServletContextListener {


	public void contextInitialized(ServletContextEvent event) {
		//super.contextInitialized(event);
		ServletContext context = event.getServletContext();
		ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(context);
		ServiceLocator.setContext(ctx); // 初始化工具类ServiceLocator中的context
		System.out.println("=========StartupListener init...=========");
		//MapCacheManager.getInstance();  // 缓存

		//ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor)ServiceLocator.getBean("taskExecutor");


	}
}