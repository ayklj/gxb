package com.gxb.web.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.gxb.common.base.BaseDao;
import com.gxb.web.dao.VillageDao;
import com.gxb.web.entity.Village;

@Repository
public class VillageDaoImpl extends BaseDao<Village> implements VillageDao {
	
	public List<Village> villageByTid(long tid) throws Exception {
		CriteriaBuilder cb = getCb();
		CriteriaQuery<Village> cq = cb.createQuery(Village.class);
		Root<Village> root = cq.from(Village.class);
		return getSession().createQuery(cq.where(cb.equal(root.get("tid"), tid))).getResultList();
	}

}
