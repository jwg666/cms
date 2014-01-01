/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.AppStar;

public interface AppStarService{

	/**
	 * 添加
	 * 
	 * @param appStar
	 */
	public void save(AppStar appStar);

	/**
	 * 修改
	 * 
	 * @param appStar
	 */
	public void update(AppStar appStar) ;
	

	/**
	 * 删除
	 * 
	 * @param appStar
	 */
	public void delete(AppStar appStar);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public AppStar getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<AppStar> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param appStar 
	 */	
	public void saveOrUpdate(AppStar appStar);
}
