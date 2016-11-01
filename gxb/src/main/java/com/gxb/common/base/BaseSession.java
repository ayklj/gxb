package com.gxb.common.base;

import java.io.Serializable;

public class BaseSession implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7215067831535753893L;

	private static final String PHONE_KEY = "1"; //PHONE 的 SESSION KEY。 2016年11月1日 22:02:02 KLJ 添加
	
	private String phone;
	
	public static BaseSession create(String sessionId){
		BaseSession bs = new BaseSession();
		bs.setPhone(PHONE_KEY);
		return bs;
	}
	
	private BaseSession(){
		
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
