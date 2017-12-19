package com.wml.ssm.manage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wml.ssm.manage.pojo.SysExceptionLog;
import com.wml.ssm.manage.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by user on 2017/12/18.
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {
    @Autowired
    ExceptionService exceptionService;

    @RequestMapping("/getExceptionList")
    public String  getList(){
        PageHelper.startPage(2,10);
        List<SysExceptionLog> list=  exceptionService.getExceptionList();
        PageInfo<SysExceptionLog> p =new PageInfo<SysExceptionLog>(list);
        return "exceptionList";
    }
}
