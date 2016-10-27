package com.gxb.web.service;

import java.io.Serializable;

import com.gxb.common.base.inf.BaseService;
import com.gxb.web.entity.User;

public interface UserService extends BaseService<User> {
	public Serializable save(User user) throws Exception;
}
