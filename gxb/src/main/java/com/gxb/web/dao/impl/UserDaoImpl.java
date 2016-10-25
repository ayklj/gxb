package com.gxb.web.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxb.web.dao.UserDao;
import com.gxb.web.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate ht;
	
	public void save(User user) throws Exception {
		ht.save(user);
	}

}
