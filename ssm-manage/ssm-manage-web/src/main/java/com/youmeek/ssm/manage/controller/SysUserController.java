package com.youmeek.ssm.manage.controller;


import com.youmeek.ssm.manage.mapper.SysExceptionLogMapper;
import com.youmeek.ssm.manage.pojo.SysUser;
import com.youmeek.ssm.manage.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sysUserController")
public class SysUserController {
	@Resource
	private SysUserService sysUserService;
	@Autowired
	private SysExceptionLogMapper sysExceptionLogMapper;

	@RequestMapping("/showUserToJspById/{userId}")
	public String showUser(Model model, @PathVariable("userId") Long userId){
		SysUser user = this.sysUserService.getById(userId);
		model.addAttribute("user", user);

		/*try {
			int i = 1/0;
		} catch (Exception e) {
			sysExceptionLogMapper.insert(new SysExceptionLog(e));
			e.printStackTrace();
		}*/

		return "showUser";
	}
	
	@RequestMapping("/showUserToJSONById/{userId}")
	@ResponseBody
	public SysUser showUser(@PathVariable("userId") Long userId){
		SysUser user = sysUserService.getById(userId);
		return user;
	}
	
	



}
