package com.gxb.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gxb.web.dao.UserDao;
import com.gxb.web.entity.User;
import com.gxb.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;
	
	@Transactional(readOnly=false)
	public void save(User user) throws Exception {
		dao.save(user);
	}

}
