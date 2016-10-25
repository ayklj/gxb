package com.gxb.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

/**
 * 用户实体映射类
 * @author klj
 * @date 2016年10月25日 15:29:01
 */
@Entity
@Table(name="gxb_user",
uniqueConstraints = @UniqueConstraint(columnNames = {}))
public class User {
	private String 	id;
	private String 	name;
	private String 	password;
	
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
	//scale 小数位
	//precision 精密度
	@Column(name="name",
			length=32,
			nullable=false,
			insertable=true)
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	@Column(name = "password",
			length=16,
			nullable=true)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
