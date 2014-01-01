/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.File;

public interface FileService{

	/**
	 * 添加
	 * 
	 * @param file
	 */
	public void save(File file);

	/**
	 * 修改
	 * 
	 * @param file
	 */
	public void update(File file) ;
	

	/**
	 * 删除
	 * 
	 * @param file
	 */
	public void delete(File file);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public File getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<File> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param file 
	 */	
	public void saveOrUpdate(File file);
}
