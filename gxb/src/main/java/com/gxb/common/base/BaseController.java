package com.gxb.common.base;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.gxb.common.adapter.BaseServiceAdapter;
import com.gxb.common.adapter.SaveServiceAdapter;
import com.gxb.common.rep.AjaxResponse;
import com.gxb.common.tools.FileTools;
/**
 * 
 * 基本控制层
 * @date 2016年10月27日 10:05:41
 * @author KLJ
 *
 */
@RequestMapping("base")
@Controller
public final class BaseController {
	
	
	private static final Log log = LogFactory.getLog(BaseController.class);
	
	public static final ThreadLocal<ServletRequest> HSR_LOCAL = new ThreadLocal<ServletRequest>();
	
	@RequestMapping("")
	@ResponseBody
	public AjaxResponse base(BaseServiceAdapter adapter){
		log.debug("BaseController.base()");
		String str = FileTools.upLoad();
		return adapter.execute();
	}
	
	@RequestMapping("save")
	@ResponseBody
	public AjaxResponse save(SaveServiceAdapter adapter){
//		return a.execute();
		return adapter.execute();
	}
	
	
	
}
