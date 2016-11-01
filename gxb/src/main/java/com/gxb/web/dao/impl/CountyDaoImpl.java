package com.gxb.web.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.CountyDao;
import com.gxb.web.entity.County;

@Repository
public class CountyDaoImpl extends BaseDao<County> implements CountyDao {

	
	
	public List<County> countyByCid(long cid) throws Exception {
		
		CriteriaBuilder cb = getCb();
		CriteriaQuery<County> cq = cb.createQuery(County.class);
		return this.getSession().createQuery(cq.where(cb.equal(cq.from(County.class).get("cid"), cid))).getResultList();
	}

}
