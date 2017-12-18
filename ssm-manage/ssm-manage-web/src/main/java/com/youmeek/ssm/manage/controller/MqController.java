package com.youmeek.ssm.manage.controller;

import com.youmeek.ssm.manage.service.MqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2017/12/18.
 */
@Controller
@RequestMapping("/mq")
public class MqController {
    @Autowired
    MqService mqService;

    @RequestMapping("/sendMq")
    public String  sendMq(){
        mqService.sendMq("send some messgage;");
        return "sendMq";
    }

    @RequestMapping("/receiveMq")
    public String  receiveMq(){
        mqService.receiveMq();
        return "receiveMq";

    }
}
