package com.gxb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.rep.AjaxResponse;
import com.gxb.web.service.CityService;
import com.gxb.web.service.CountyService;
import com.gxb.web.service.ProviceService;

@RequestMapping("area")
@Controller
public class AreaController {
	private static final Log log = LogFactory.getLog(AreaController.class);
	
	@Autowired
	CityService cs;
	@Autowired
	ProviceService ps;
	@Autowired
	CountyService cos;
	
	@RequestMapping("/city")
	@ResponseBody
	public AjaxResponse city(int pid){
		AjaxResponse ajax = new AjaxResponse();
		ajax.setData(cs.citysByPid(pid));
		return ajax;
	}
	
	@RequestMapping("/provice")
	@ResponseBody
	public AjaxResponse provice(){
		AjaxResponse ajax = new AjaxResponse();
		ajax.setData(ps.proviceAll());
		return ajax;
	}
	
	@RequestMapping("/county")
	@ResponseBody
	public AjaxResponse county(long cid){
		AjaxResponse ajax = new AjaxResponse();
		try {
			ajax.setData(cos.countyByCid(cid));
		} catch (Exception e) {
			log.debug("county",e);
			ajax.setState(false);
		}
		return ajax;
	}
	
}
