package com.neusoft.dao;



import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDAO extends HibernateDaoSupport {	
	private Log log = LogFactory.getLog(this.getClass().getName());

	/*
	 * hql = " from User user"
	 * 不带参数
	 * */
	public List getList(final int begin, final int pageSize,final String hql) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)throws HibernateException, SQLException {
				Query q = null;
				q = session.createQuery(hql);
				q.setFirstResult(begin);
				q.setMaxResults(pageSize);
				return q.list();
			}
		});
	}
	
	/*
	 * 如：hql = " from User user where user.username=?"
	 * 带位置参数
	 * */
	public List getListByPosition(final int begin, final int pageSize,final String hql,final Object[] params) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)throws HibernateException, SQLException {
				Query q = null;
				q = session.createQuery(hql);
				if(params.length>0){
					for(int i=0;i<params.length;i++)
					q.setParameter(i, params[i]);
				}
				q.setFirstResult(begin);
				q.setMaxResults(pageSize);
				//log.warn(q.list().size());
				return q.list();
			}
		});
	}
	/*
	 * 返回上面的总记录数（）
	 * */
	public int getTotalCountByPosition(String hql, Object[] params) {
		//Integer amount = new Integer(0); 
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else {
			countStr = "select count(*) " + hql.substring(sql_from);
		}

		List list = getHibernateTemplate().find(countStr, params);

		return ((Integer) list.get(0)).intValue();
	}
	
	/*
	 * 如：hql = " from User user where user.username=:name"
	 * Map 中key为hql名名参数，Map中的value为值 name=value
	 * */
	public List getListByNamedParameter(final int begin, final int pageSize,final String hql,final Map map) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)throws HibernateException, SQLException {
				Query q = null;
				q = session.createQuery(hql);
				
				if(map!=null || !map.isEmpty()){
					Set set = map.keySet();
					Iterator it = set.iterator();
					while(it.hasNext()){
						String name = (String)it.next();
						q.setParameter(name, map.get(name));
					}
				}
				q.setFirstResult(begin);
				q.setMaxResults(pageSize);
				return q.list();
			}
		});
	}
	
	/*
	 * 如：hql = " from User user where user.username=:name and user.id=:id"
	 * 数组names 为{"name","id"}
	 * 数组values 为 {"胡继红",new Long(1)}
	 * */
	public List getListByNamedParameter2(final int begin, final int pageSize,final String hql,final String[] names,final Object[] values) {
		if(names.length!=values.length){
			return null;
		}
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)throws HibernateException, SQLException {
				Query q = null;
				q = session.createQuery(hql);
				int m = names.length;
				for(int i=0;i<m;i++){
					q.setParameter(names[i], values[i]);
				}
				q.setFirstResult(begin);
				q.setMaxResults(pageSize);
				return q.list();
			}
		});
	}
	/*
	 * 返回上面的总记录数
	 * */
	public int getTotalCountByNamedParameter2(String hql, String[] names,Object[] values) {
		//Integer amount = new Integer(0); 
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else {
			countStr = "select count(*) " + hql.substring(sql_from);
		}
		//List list = getHibernateTemplate().find(countStr, params);
		List list = null;
		int m = names.length;
		if(names.length!=values.length){
			return 0;
		}else{
			list =  getHibernateTemplate().findByNamedParam(countStr, names, values);
		}
		return ((Integer) list.get(0)).intValue();
	}
	
	/**
	 * Bind the property values of the given bean to named parameters of the query,
	 * matching property names with parameter names and mapping property types to
	 * Hibernate types using hueristics.
	 * @param bean any JavaBean or POJO
	 */
	public List getByBean(final int begin, final int pageSize,final String hql,final Object bean){
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)throws HibernateException, SQLException {
				Query q = null;
				q = session.createQuery(hql);
				q.setProperties(bean);
				q.setFirstResult(begin);
				q.setMaxResults(pageSize);
				return q.list();
			}
		});	
	}
	/*
	 * 返回上面的总记录数
	 * */
	public int getTotalCountByBean(String hql,Object bean) {
		//Integer amount = new Integer(0); 
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else {
			countStr = "select count(*) " + hql.substring(sql_from);
		}
		//List list = getHibernateTemplate().find(countStr, params);
		List list = null;
		list = getHibernateTemplate().findByValueBean(countStr, bean);
		return ((Integer) list.get(0)).intValue();
	}
	
	
	
	/***
	 * 跟据示例查找
	 * @param begin 开始记录数
	 * @param pageSize 每页记录数
	 * @param clazz 查找类
	 * @param example 示例
	 * @param orderString 排序属性
	 * 
	 * **/
	public List getByExamples(final int begin, final int pageSize,
			final Class clazz, final Object exapmle, final String orderString) {
		return getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria criteria = session.createCriteria(clazz);
				if (exapmle != null) {
					criteria.add(Example.create(exapmle));
				}
				if (orderString != null && !"".equals(orderString)) {
					criteria.addOrder(Order.desc(orderString));
				}
				criteria.setFirstResult(begin);
				criteria.setMaxResults(pageSize);
				return criteria.list();
			}
		});
	}

	/***
	 * 跟据示例查找所有记录数
	 * @param clazz 查找类
	 * @param example 示例
	 * 
	 * **/
	public int getByExampleCounts(final Class clazz, final Object example) {
		int returnValue = 0;
		List list = getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria criteria = session.createCriteria(clazz);
				if (example != null) {
					criteria.add(Example.create(example));
				}
				criteria.setProjection(Projections.rowCount());
				return criteria.list();
			}
		});
		if (list != null || !list.isEmpty()) {
			returnValue = ((Integer) list.get(0)).intValue();
		}
		return returnValue;
	}

	/** 
	 * 向数据库添加一条对应于一个业务对象实例的记录 
	 * 
	 * @param entity 
	 *            业务对象实例 
	 * @throws DaoException 
	 *         
	 */
	public void create(Object entity) {
		try {
			getHibernateTemplate().save(entity);
			//getHibernateTemplate().saveOrUpdate(entity);
		} catch (Exception e) {
			log.error("保存 " + entity.getClass().getName() + " 实例到数据库失败", e);

		}
	}

	public void createOrUpdate(Object entity) {
		try {
			//getHibernateTemplate().save(entity);
			getHibernateTemplate().saveOrUpdate(entity);
		} catch (Exception e) {
			log.error("保存 " + entity.getClass().getName() + " 实例到数据库失败", e);

		}
	}
	/** 
	 * 获得一个session        
	 */
	public Session openSession() {
		return SessionFactoryUtils.getSession(getSessionFactory(), false);
	}

	/** 
	 * 获得Query对象       
	 */
	public Query getQuery(String sql) {
		Session session = this.openSession();
		Query query = session.createQuery(sql);
		return query;
	}

	/** 
	 * 获得Criteria对象       
	 */
	public Criteria getCriteria(Class clazz) {

		Session session = this.openSession();
		Criteria criteria = session.createCriteria(clazz);
		return criteria;
	}

	/** 
	 * 在分页显示时获得总数据数 
	 * 简单的hql语句
	 */
	public int getTotalCount(String hql) {
//		log.debug("------------------------hql is:"+hql);
		Long amount = new Long(0L);
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else
			countStr = "select count(*) " + hql.substring(sql_from);
		Session session = this.openSession();
		log.debug("------------------------countStr is:"+countStr);
		Query query = session.createQuery(countStr);
		if (!query.list().isEmpty()) {
			amount = (Long) query.list().get(0);
		} else
			return 0;

		return amount.intValue();
	}

	public int getTotalCount(String hql, Object[] params) {
		//Integer amount = new Integer(0); 
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else {
			countStr = "select count(*) " + hql.substring(sql_from);
		}

		List list = getHibernateTemplate().find(countStr, params);
		if(list==null || list.isEmpty()){
			return 0;
		}else{
			String c = list.get(0).toString();
			
			return Integer.parseInt(c);
		}
	}
	
	
	
	public int getTotalCountByNamedParameter(String hql, Map map) {
		//Integer amount = new Integer(0); 
		int sql_from = hql.indexOf(" from");
		int sql_orderby = hql.indexOf("order by");
		String countStr = "";
		if (sql_orderby > 0) {
			countStr = "select count(*) "
					+ hql.substring(sql_from, sql_orderby);
		} else {
			countStr = "select count(*) " + hql.substring(sql_from);
		}
		//List list = getHibernateTemplate().find(countStr, params);
		List list = null;
		if(!map.isEmpty()){
			Object[] obj = map.keySet().toArray();
			String[] names = null;
			int m = obj.length;
			names = new String[m];
			for(int i=0;i<m;i++){
				names[i]=(String)obj[i];
			}
			
			Object[] values = map.values().toArray();
			list =  getHibernateTemplate().findByNamedParam(countStr, names, values);
		}else{
			list = getHibernateTemplate().find(countStr);
		}
		return ((Integer) list.get(0)).intValue();
	}

	/** 
	 * 在分页显示时获得总页数 
	 *         
	 */
	public int getTotalPage(int totalCount, int pageSize) {
		return (totalCount + pageSize - 1) / pageSize;
	}

	/** 
	 * 向数据库更新一条对应于一个业务对象实例的记录 
	 * 
	 * @param entity 
	 *            业务对象实例 
	 * @throws DaoException 
	 *          
	 */
	public void update(Object entity) {
		try {
			getHibernateTemplate().update(entity);
		} catch (Exception e) {
			log.error("更新 " + entity.getClass().getName() + " 实例到数据库失败", e);

		}
	}

	/** 
	 * 从数据库删除一条对应于一个业务对象的记录 
	 * 
	 * @param entity 
	 *            业务对象实例 
	 * @throws DaoException 
	 *         
	 */
	public void delete(Object entity) {
		try {
			getHibernateTemplate().delete(entity);
		} catch (Exception e) {
			log.error("从数据库删除 " + entity.getClass().getName() + " 实例失败", e);

		}
	}

	/** 
	 * 从数据库删除所有对应于一个业务对象的记录 
	 * @param clazz 
	 *            指定类型的业务对象 
	 * @throws DaoException        
	 */
	public void deleteAll(Class clazz) {
		try {
			List result = getHibernateTemplate().loadAll(clazz);
			getHibernateTemplate().deleteAll(result);
		} catch (Exception e) {
			log.error("delete " + clazz.getName() + "  all  failed", e);

		}
	}

	public void deleteAll(Collection entities) {
		try {
			getHibernateTemplate().deleteAll(entities);

		} catch (Exception e) {

		}
	}

	/** 
	 * 从数据库查询一个业务对象的所有记录 
	 * @param clazz 
	 *            指定类型的业务对象  
	 */
	public List getAll(Class clazz) {
		List list = null;
		try {
			list = getHibernateTemplate().loadAll(clazz);
		} catch (Exception e) {
			log.error("从数据库查询" + clazz.getName() + "失败");
		}
		return list;
	}

	/** 
	 * 根据关键字从数据库加载指定类型的业务对象。 
	 * 
	 * @param clazz 
	 *            业务对象的Class 
	 * @param keyName 
	 *            指定关键字对应的字段名称 
	 * @param keyValue 
	 *            指定关键字的值 
	 * @return <ul> 
	 *         <li>当关键字唯一并存在该记录时，返回该记录对应的业务对象</li> 
	 *         <li>当关键字不唯一，返回查询结果的第一条记录所对应的业务对象</li> 
	 *         <li>当不存在该记录时,返回null</li> 
	 *         </ul> 
	 * @throws DaoException 
	 *         
	 */
	public Object getByKey(Class clazz, String keyName, Object keyValue) {

		List result = getHibernateTemplate().find(
				"from " + clazz.getName() + " where " + keyName + " = ?",
				keyValue);
		if (result != null && result.size() > 0) {
			return result.get(0);
		} else {
			return null;
		}
	}

	/** 
	 * 根据主键查询唯一数据对象。 
	 * 
	 * @param clazz 
	 *            业务对象的Class 
	 * @return 返回查询结果包含的业务对象 
	 * @throws DaoException 
	 *           
	 */
	public Object getByPk(Class clazz, Integer id) {

		Object obj = (Object) getHibernateTemplate().get(clazz, id);
		return obj;

	}

	public Object getByPk(Class clazz, Long id) {

		Object obj = (Object) getHibernateTemplate().get(clazz, id);
		return obj;
	}

	public Object getByPk(Class clazz, String id) {

		Object obj = (Object) getHibernateTemplate().get(clazz, id);
		return obj;

	}

	/** 
	 * 根据查询语句查询数据库并返回查询结果所包含的业务对象集合。 
	 * 
	 * @param queryString 
	 *            指定查询语句 
	 * @return 返回查询结果包含的业务对象集合 
	 * @throws DaoException 
	 *      
	 */
	public List find(String queryString) {
		List list = null;
		try {
			list = getHibernateTemplate().find(queryString);
		} catch (Exception e) {
			log.error("执行查询 " + queryString + " 失败", e);

		}
		return list;
	}

	/** 
	 * 根据带一个参数的查询语句查询数据库并返回查询结果所包含的业务对象集合。 
	 * 
	 * @param queryString 
	 *            指定查询语句 
	 * @param param 
	 *            指定所带参数 
	 * @return 返回查询结果包含的业务对象集合 
	 * @throws DaoException 
	 *            
	 */
	public List find(String queryString, Object param) {
		List list = null;
		try {
			list = getHibernateTemplate().find(queryString, param);
		} catch (Exception e) {
			log.error("执行参数为 " + param + " 的查询 " + queryString + " 失败", e);

		}
		return list;
	}

	/** 
	 * 根据带多个参数的查询语句查询数据库并返回查询结果所包含的业务对象集合。 
	 * 
	 * @param queryString 
	 *            指定查询语句 
	 * @param params 
	 *            指定参数数组 
	 * @return 返回查询结果包含的业务对象集合 
	 * @throws DaoException 
	 *       
	 */
	public List find(String queryString, Object[] params) {
		List list = null;
		try {
			list = getHibernateTemplate().find(queryString, params);
		} catch (Exception e) {
			StringBuffer paramString = new StringBuffer("");
			for (int i = 0; i < params.length; i++) {
				paramString.append(params[i]);
				paramString.append(" ");
			}
			log.error("执行参数为 " + paramString + "的查询 " + queryString + " 失败", e);

		}
		return list;
	}

	public List findByNamedQuery(final String namedQuery) {
		return getHibernateTemplate().findByNamedQuery(namedQuery);
	}

	public List findByNamedQuery(final String query, final Object parameter) {
		return getHibernateTemplate().findByNamedQuery(query, parameter);
	}

	public List findByNamedQuery(final String query, final Object[] parameters) {
		return getHibernateTemplate().findByNamedQuery(query, parameters);
	}
   
	   /** 
	    * 从数据库查询一个业务对象的所有记录 
	    * @param clazz 
	    *            指定类型的业务对象  
	    */ 
	   public List LoadAll(Class clazz){
	       List list=null;
	       try{
	              list=getHibernateTemplate().loadAll(clazz);
	       }catch(Exception e){
	          log.error("从数据库查询"+clazz.getName()+"失败");
	      }
	       return list;
	   }
	//lqs@20080613   
	   public void update(String hql,Object[] entitys) {
			try {
				getHibernateTemplate().update(hql,entitys);
			} catch (Exception e) {
				log.error("更新 " + entitys.getClass().getName() + " 实例到数据库失败", e);

			}
		}
	   
	   /**
	     * 根据hql来查询 返回对象的list	    
	     * @param hql hql语句
	     * @param params 参数对象数组
	     * @param pageSize 分页容量
	     * @param pageNo 请求页码
	     * @return
	     */
	    public List findByHQL(final String hql,final Object[] params,final int pageSize,final int pageNo) {
	        return this.getHibernateTemplate().executeFind(new HibernateCallback() {
	            public Object doInHibernate(Session session)
	                    throws HibernateException {
	                Query query = session.createQuery(hql);
	                if (params != null && params.length > 0) {
	                    for (int i = 0; i < params.length; i++) {
	                        query.setParameter(i, params[i]);
	                    }
	                }
	                if(pageSize>0)
	                {
	                    query.setFirstResult(pageNo < 1 ? 0 : pageNo * pageSize);
	                    query.setMaxResults(pageSize);
	                }
	                return query.list();
	            }
	        });
	    }
}
