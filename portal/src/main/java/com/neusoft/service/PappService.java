/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Papp;

public interface PappService{

	/**
	 * 添加
	 * 
	 * @param papp
	 */
	public void save(Papp papp);

	/**
	 * 修改
	 * 
	 * @param papp
	 */
	public void update(Papp papp) ;
	

	/**
	 * 删除
	 * 
	 * @param papp
	 */
	public void delete(Papp papp);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Papp getById(Object id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Papp> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param papp 
	 */	
	public void saveOrUpdate(Papp papp);
}
