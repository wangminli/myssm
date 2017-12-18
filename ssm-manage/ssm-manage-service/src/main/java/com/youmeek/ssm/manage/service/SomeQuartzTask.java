package com.youmeek.ssm.manage.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * 逾期跑批任务
 */
public class SomeQuartzTask implements Job {
    private static final Logger logger = LoggerFactory.getLogger(SomeQuartzTask.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println(String.format("==========SomeQuartzTask executed at %s==========", new Date()));
    }
}

