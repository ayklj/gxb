package com.gxb.web.controller.wx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxb.web.entity.User;
import com.gxb.web.service.UserService;


@RequestMapping("wx/auth")
@Controller
public class WxAuthController {
	
	@Autowired
	UserService service;
	
	/**
	 * 认证回调接口
	 * @date 2016年10月25日 10:24:20
	 * @author KLJ
	 * @return 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String auth(){
		return "";
	}
	
	/**
	 * 认证用户基本信息
	 * @date 2016年10月25日 11:09:47
	 * @author KLJ
	 * @return 返回用户基本信息JSON数据。
	 */
	@RequestMapping(value = "/info" , method = RequestMethod.GET)
	@ResponseBody
	public String authInfo(){
		return "info";
	}
	
	@RequestMapping(value = "/user/save",method = RequestMethod.GET)
	@ResponseBody
	public String save(User user){
		
		try {
			service.save(user);
			return "ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "no";
		}
	}
}
