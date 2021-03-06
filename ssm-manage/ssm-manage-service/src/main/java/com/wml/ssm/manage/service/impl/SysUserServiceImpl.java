package com.wml.ssm.manage.service.impl;


import com.wml.ssm.manage.service.SysUserService;
import com.wml.ssm.manage.mapper.SysUserMapper;
import com.wml.ssm.manage.pojo.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Map> getCashLoanUser() {
		return sysUserMapper.getCashLoanUser();
	}


}
