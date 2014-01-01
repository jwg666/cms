/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Permission;

public interface PermissionService{

	/**
	 * 添加
	 * 
	 * @param permission
	 */
	public void save(Permission permission);

	/**
	 * 修改
	 * 
	 * @param permission
	 */
	public void update(Permission permission) ;
	

	/**
	 * 删除
	 * 
	 * @param permission
	 */
	public void delete(Permission permission);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Permission getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Permission> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param permission 
	 */	
	public void saveOrUpdate(Permission permission);
}
