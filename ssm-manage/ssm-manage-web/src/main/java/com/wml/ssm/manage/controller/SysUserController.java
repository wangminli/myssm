package com.wml.ssm.manage.controller;


import com.wml.ssm.manage.pojo.SysUser;
import com.wml.ssm.manage.service.MqService;
import com.wml.ssm.manage.service.SysUserService;
import com.wml.system.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
	@Resource
	private SysUserService sysUserService;
    @Autowired
    MqService mqService;

	@RequestMapping("/showUserToJspById/{userId}")
	public String showUser(Model model, @PathVariable("userId") Long userId){
		SysUser user = this.sysUserService.getById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/showUserToJSONById/{userId}")
	@ResponseBody
	public SysUser showUser(@PathVariable("userId") Long userId){
		SysUser user = sysUserService.getById(userId);
		return user;
	}
	@RequestMapping("/testDynamicDataSource")
	@ResponseBody
	public List<Map> testDynamicDataSource(){
		DynamicDataSource.setCustomerType(DynamicDataSource.DS_CASHLOAN);
		List<Map> userList = sysUserService.getCashLoanUser();
		return userList;
	}
}
