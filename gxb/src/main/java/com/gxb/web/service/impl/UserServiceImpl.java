package com.gxb.web.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.gxb.common.base.BaseService;
import com.gxb.common.base.inf.BaseDao;
import com.gxb.web.dao.UserDao;
import com.gxb.web.entity.User;
import com.gxb.web.service.UserService;

@Service
@Scope
public class UserServiceImpl extends BaseService<User> implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Override
	protected BaseDao<User> getDao() {
		return dao;
	}
	
	

}
