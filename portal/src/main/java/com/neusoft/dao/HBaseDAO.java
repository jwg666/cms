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


public class HBaseDAO {
	@Resource
	private SessionFactory sessionFactory;
//	private Session session ;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void save(Object obj){		
		getSession().save(obj);
	}
	
	public void saveOrUpdate(Object obj){
		getSession().saveOrUpdate(obj);
	}
	
	public void update(Object obj){
		getSession().update(obj);
	}
	public List<?> findList(Class claz){
		return getSession().createCriteria(claz).list();
	}
	public List<?> findList(int begin, int pageSize,String hql){
		Query query = getSession().createQuery(hql);
		query.setFirstResult(begin);
		query.setMaxResults(pageSize);
		return query.list();
	}
	public List<?> findList(int begin, int pageSize,String hql,Object[] params){
		Query q = getSession().createQuery(hql);
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
		Query q = getSession().createQuery(hql);
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
		return getSession().createCriteria(claz).add(criterion).list();
	}
	public List<?> findList(Class claz,Serializable params){
		return (List<?>) getSession().load(claz, params);
	}
	
	public Criteria getCriteria(Class claz){
		return getSession().createCriteria(claz);
	}
	public void delete(Object object){
		getSession().delete(object);
	}
	
}
