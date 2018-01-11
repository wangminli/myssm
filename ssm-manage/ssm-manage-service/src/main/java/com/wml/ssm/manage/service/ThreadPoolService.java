package com.wml.ssm.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * Decription:
 * Created by WangMinli on 2018/1/11.
 */
@Service
public class ThreadPoolService {
    @Autowired
    ThreadPoolTaskExecutor taskExecutor;

    public void testThreadPool(){
        for (int i = 0; i < 10; i++) {
            taskExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("======线程池执行了！=====");
                }
            });
        }
    }
}
