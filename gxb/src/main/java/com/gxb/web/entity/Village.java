package com.gxb.web.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * �� ʵ����
 * 2016��10��30��20:10:46
 * @author KLJ 
 */

@Table(name = "j_position_village")
@Entity
public class Village implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8448998245318081430L;
	
	private int id;		//key
	private long tid;	//�� id
	private long vid;	//�� id
	private long vname;	//�� name
	
	@Id
	@Column(insertable = false,name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(insertable = false,name = "town_id")
	public long getTid() {
		return tid;
	}
	public void setTid(long tid) {
		this.tid = tid;
	}
	
	@Column(insertable = false,name = "village_id")
	public long getVid() {
		return vid;
	}
	public void setVid(long vid) {
		this.vid = vid;
	}
	
	@Column(insertable = false,name = "village_name")
	public long getVname() {
		return vname;
	}
	public void setVname(long vname) {
		this.vname = vname;
	}
	
	
	
}
