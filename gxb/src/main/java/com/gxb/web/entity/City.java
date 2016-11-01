package com.gxb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 城市 实体类
 * 2016年10月30日20:18:49
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
	private int pid; 		//省 id
	private long cid;		//城市 id
	private String cname; 	//城市 name
	
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
