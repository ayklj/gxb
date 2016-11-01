package com.gxb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 镇 实体类
 * 2016年10月30日20:14:02
 * @author KLJ
 *
 */

@Table(name = "j_position_town")
@Entity
public class Town implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 874370498738020612L;
	private int id;			//key
	private long coid;		//区县 id
	private long tid;		//镇 id
	private String tname;	//镇 name
	
	@Id
	@Column(insertable = false , name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(insertable = false , name = "county_id")
	public long getCoid() {
		return coid;
	}
	public void setCoid(long coid) {
		this.coid = coid;
	}
	
	@Column(insertable = false , name = "town_id")
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	
	@Column(insertable = false , name = "town_name")
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	
	
	
	
	
}
