package com.wml.ssm.manage.service;

import com.wml.ssm.manage.mapper.SysExceptionLogMapper;
import com.wml.ssm.manage.pojo.SysExceptionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 2017/12/19.
 */
@Service
public class ExceptionService {
    @Autowired
    SysExceptionLogMapper sysExceptionLogMapper;

    public List<SysExceptionLog> getExceptionList(){
        return sysExceptionLogMapper.getExceptionList();
    }
}
