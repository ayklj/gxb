package com.gxb.common.mapping;

/**
 * Base函数对应枚举 
 * @date 2016年10月26日 10:36:15 创建
 * @author KLJ
 */
public enum MethodEnum {
	
	SAVE("xG7HjGyZDakh490Bap4E7HLov0oahwkb","save");
	
	private String uid;
	private String methodName;
	
	private MethodEnum(String uid,String methodName){
		this.uid = uid;
		this.methodName = methodName;
	}

	public String getUid() {
		return uid;
	}

	public String getMethodName() {
		return methodName;
	}
	
	
}
