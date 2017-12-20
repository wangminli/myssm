package com.wml.ssm.manage.service;


import com.wml.ssm.manage.pojo.SysUser;

import java.util.List;
import java.util.Map;

public interface SysUserService {
	SysUser getById(Long id);

	List<Map> getCashLoanUser();
}
