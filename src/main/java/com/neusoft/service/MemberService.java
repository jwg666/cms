/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.model.portal.Member;

public interface MemberService{

	/**
	 * 添加
	 * 
	 * @param member
	 */
	public void save(Member member);

	/**
	 * 修改
	 * 
	 * @param member
	 */
	public void update(Member member) ;
	

	/**
	 * 删除
	 * 
	 * @param member
	 */
	public void delete(Member member);

	
	/**
	 * 获得
	 * 
	 * @param obid
	 * @return
	 */
	public Member getById(Long id);
	
	/**
	 * 获取数据
	 * @param obid
	 * @return
	 */	
	public List<Member> getList(Map<String,Object> params);
	/**
	 * 根据主键更新或者保存数据
	 * @param member 
	 */	
	public void saveOrUpdate(Member member);
}
