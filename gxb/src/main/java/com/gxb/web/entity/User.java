package com.gxb.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "pub_user")
public class User {
	
	private String id;
	
	private String uid;
	
	private String name; // ��ʵ����
	
	private String idNo; //	���֤��
	
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "id",length=32)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	@Column(name = "uid", length = 32, nullable = false, insertable = true)
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
	@Column(name = "idno", length = 18, nullable = false, insertable = true)
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	
	// scale С��λ
	// precision ���ܶ�
	@Column(name = "name", length = 32, nullable = false, insertable = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
