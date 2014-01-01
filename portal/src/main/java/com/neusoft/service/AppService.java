/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.App;

public interface AppService{

	/**
	 * 添加
	 * 
	 * @param app
	 */
	public void save(App app);

	/**
	 * 修改
	 * 
	 * @param app
	 */
	public void update(App app) ;
	

	/**
	 * 删除
	 * 
	 * @param app
	 */
	public void delete(App app);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public App getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<App> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param app 
	 */	
	public void saveOrUpdate(App app);
}
