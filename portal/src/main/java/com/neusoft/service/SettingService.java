/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Setting;

public interface SettingService{

	/**
	 * 添加
	 * 
	 * @param setting
	 */
	public void save(Setting setting);

	/**
	 * 修改
	 * 
	 * @param setting
	 */
	public void update(Setting setting) ;
	

	/**
	 * 删除
	 * 
	 * @param setting
	 */
	public void delete(Setting setting);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Setting getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Setting> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param setting 
	 */	
	public void saveOrUpdate(Setting setting);
}
