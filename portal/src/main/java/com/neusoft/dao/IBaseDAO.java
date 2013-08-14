package com.neusoft.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public interface IBaseDAO {
	
	public List getByExamples(int begin,int pageSize,Class clazz,Object example,String orderString);
	
	public List getList(int begin, int pageSize,String hql);
	
	public List getListByPosition(int begin,int pageSize,String hql,Object[] params);
	
	public int getTotalCountByPosition(String hql, Object[] params);
	
	public List getListByNamedParameter(int begin, int pageSize,String hql,Map map);
	
	public List getListByNamedParameter2(int begin,int pageSize,String hql,String[] names,Object[] values);
	public int getTotalCountByNamedParameter2(String hql, String[] names,Object[] values);
	
	public List getByBean(final int begin, final int pageSize,final String hql,final Object bean);
	public int getTotalCountByBean(String hql,Object bean);
	
	public int getByExampleCounts(Class clazz,Object example);
	
    public Session openSession();
    
    public  int getTotalCount( String hql);
    
    public  int getTotalCount(String hql,Object[] params);
    
    public int getTotalCountByNamedParameter(String hql, Map map);
    
    public Query getQuery(String sql);
    
    public Criteria getCriteria(Class clazz);
    
    public int getTotalPage(int totalCount,int pageSize);
    
    public Object getByPk(Class clazz,Integer id);
    
    public Object getByPk(Class clazz,Long id);
    
    public Object getByPk(Class clazz,String id);
    
    public void create(Object entity);

    public void createOrUpdate(Object entity);
    
    public void update(Object entity);

    public void delete(Object entity);

    public void deleteAll(Class clazz);

    public void deleteAll(Collection entities);

    public Object getByKey(Class clazz, String keyName, Object keyValue);

    public List find(String queryString);

    public List find(String queryString, Object param);

    public List find(String queryString, Object[] params);
    
    public List getAll(Class clazz);
    
    public List findByNamedQuery(final String namedQuery);

    public List findByNamedQuery(final String query, final Object parameter);

    public List findByNamedQuery(final String query, final Object[] parameters);
    
    public List LoadAll(Class clazz);

}
