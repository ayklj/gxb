package com.gxb.web.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.UserDao;
import com.gxb.web.entity.User;

@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao {

	@Autowired
	HibernateTemplate ht;
	
	@Override
	protected HibernateTemplate getHt() {
		return ht;
	}
	
}
