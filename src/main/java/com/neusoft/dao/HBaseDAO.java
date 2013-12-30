package com.neusoft.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.internal.CriteriaImpl.CriterionEntry;

import com.neusoft.base.BaseQuery;


public class HBaseDAO {
	@Resource
	private SessionFactory sessionFactory;
	private Session session = sessionFactory.getCurrentSession();
	
	public Session getSession() {
		return session;
	}

	public void save(Object obj){		
		session.save(obj);
	}
	
	public void saveOrUpdate(Object obj){
		session.saveOrUpdate(obj);
	}
	
	public void update(Object obj){
		session.update(obj);
	}
	public List<?> findList(Class claz){
		return session.createCriteria(claz).list();
	}
	public List<?> findList(int begin, int pageSize,String hql){
		Query query = session.createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(pageSize);
		return query.list();
	}
	public List<?> findList(int begin, int pageSize,String hql,Object[] params){
		Query q = session.createQuery(hql);
		if(params.length>0){
			for(int i=0;i<params.length;i++)
			q.setParameter(i, params[i]);
		}
		q.setFirstResult(begin);
		q.setMaxResults(pageSize);
		//log.warn(q.list().size());
		return q.list();
	}
	public List<?> findList(String hql,int begin,int pageSize,Map<String,Object> params){
		Query q = session.createQuery(hql);
		if(params!=null&&params.size()>0){
			Iterator it = params.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String,Object> e = (Entry)it.next();
				q.setParameter(e.getKey(), e.getValue());
			}
		}
		q.setFirstResult(begin);
		q.setMaxResults(pageSize);
		//log.warn(q.list().size());
		return q.list();
	}
	public List<?> findList(Class claz,Criterion criterion){
		return session.createCriteria(claz).add(criterion).list();
	}
	public List<?> findList(Class claz,Serializable params){
		return (List<?>) session.load(claz, params);
	}
	
	public Criteria getCriteria(Class claz){
		return session.createCriteria(claz);
	}
	public void delete(Object object){
		session.delete(object);
	}
	
}
