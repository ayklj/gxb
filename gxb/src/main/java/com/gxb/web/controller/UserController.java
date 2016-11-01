package com.gxb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gxb.common.rep.AjaxResponse;
import com.gxb.web.entity.User;
import com.gxb.web.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	
	@Autowired
	UserService us;
	
	@RequestMapping("/save")
	public String save(User user){
		try {
			us.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public AjaxResponse login(){
		
		return null;
	}
	
	
}
