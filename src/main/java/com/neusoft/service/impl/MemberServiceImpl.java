/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */


package com.neusoft.service.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.dao.MemberDAO;
import com.neusoft.model.portal.Member;
import com.neusoft.service.MemberService;

/**
 * 
 * @author jiawg-贾伟光
 *
 */
@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService{
	@Resource
	private MemberDAO memberDAO;
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Member member) {
		logger.info("save start");
		memberDAO.save(member);
		logger.info("save end");
	}
	@Override
	public void update(Member member) {
		logger.info("update start");
		memberDAO.update(member);
		logger.info("update end");		
	}
	@Override
	public void delete(Member member) {
		logger.info("delete start");
		memberDAO.delete(member);
		logger.info("delete end");		
	}
	@Override
	public List<Member> getList(Map<String, Object> params) {
		logger.info("getList start");
		List<Member> memberList = memberDAO.findList(params);
		logger.info("getList end");
		return memberList;
	}
	@Override
	public void saveOrUpdate(Member member) {
		logger.info("saveOrUpdate start");
		memberDAO.saveOrUpdate(member);
		logger.info("saveOrUpdate end");
		
	}
	@Override
	public Member getById(Long id) {		
		return (Member) memberDAO.getById(Member.class,id);
	}

}
