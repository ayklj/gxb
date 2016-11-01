package com.gxb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ���� ʵ����
 * 2016��10��30��20:18:49
 * @author KLJ
 *
 */

@Entity
@Table(name = "j_position_city")
public class City implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7184830460363805618L;
	
	private int id; 		//key
	private int pid; 		//ʡ id
	private long cid;		//���� id
	private String cname; 	//���� name
	
	@Id
	@Column(insertable = false,name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(insertable = false,name = "province_id")
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Column(insertable = false,name = "city_id")
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	
	@Column(insertable = false,name = "city_name")
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	
}
