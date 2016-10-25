package com.gxb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxb.common.base.inf.BaseDao;
import com.gxb.common.rep.AjaxResponse;
import com.gxb.web.dao.impl.UserDaoImpl;
import com.gxb.web.entity.User;

@RequestMapping
@Controller
public class BaseController {
	
	@RequestMapping("save")
	@ResponseBody
	public AjaxResponse save(){
		BaseDao<User> bu = new UserDaoImpl();
		return null;
	}
	
}
