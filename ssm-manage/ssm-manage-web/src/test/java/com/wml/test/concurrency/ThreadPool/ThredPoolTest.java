package com.wml.test.concurrency.ThreadPool;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Decription:
 * Created by WangMinli on 2018/1/11.
 */
public class ThredPoolTest {

    @Test
    public void test4ThreadPools(){
        //MyTask task = new Mytask();
        int num = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(num);
        for (int i = 0; i < 100; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    // 可以看到有num个（以内）的线程名字不同
                    System.out.println(System.currentTimeMillis() + " , Thread ID : " + Thread.currentThread().getName());
                }
            });
        }

    }
}
