package com.gxb.common.mapping;

/**
 * Base������Ӧö�� 
 * @date 2016��10��26�� 10:36:15 ����
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
