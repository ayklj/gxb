package com.gxb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gxb.common.rep.AjaxResponse;

@RequestMapping("login")
@Controller
public class LoginControler {

	
	@RequestMapping("phone")
	@ResponseBody
	public AjaxResponse phone(){
		return null;
	}
	
	@RequestMapping("phone/send")
	public AjaxResponse sendMsg(String phone){
		return null;
	}
	
}
