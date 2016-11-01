package com.gxb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 省份 实体类
 * 2016年10月30日20:21:34
 * @author KLJ
 */

@Table(name="j_position_provice")
@Entity
public class Provice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -535674604429523026L;
	
	private int id;			//key
	private int pid;		//省份 id
	private String pname;	//省份 name
	
	@Id
	@Column(name = "id",insertable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "provice_id",insertable = false)
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(name = "provice_name",insertable = false)
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
}
