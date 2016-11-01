package com.gxb.common.base;

import java.io.Serializable;

public class BaseSession implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7215067831535753893L;

	private static final String PHONE_KEY = "1"; //PHONE �� SESSION KEY�� 2016��11��1�� 22:02:02 KLJ ���
	
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
