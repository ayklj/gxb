package com.gxb.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 县城 实体
 * @author KLJ
 *
 */

@Table(name="j_position_county")
@Entity
public class County {
	private int id;			//key
	private long cid;		//城市 id
	private long coid;		//县城 id
	private String coname;	//县城 name
	
	
	@Id
	@Column(name = "id",insertable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "city_id",insertable = false)
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	@Column(name = "county_id",insertable = false)
	public long getCoid() {
		return coid;
	}
	public void setCoid(long coid) {
		this.coid = coid;
	}
	@Column(name = "county_name",insertable = false)
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	
}
