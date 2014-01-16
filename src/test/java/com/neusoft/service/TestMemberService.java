package com.neusoft.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.neusoft.model.portal.Member;
import com.neusoft.util.MD5Util;

import base.BaseTestCase;

public class TestMemberService extends BaseTestCase{
	@Resource
	private MemberService memberService;
	@Test
	public void testFindList(){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("username", "admin");
		params.put("password", MD5Util.getMD5Code("111111"));
		List<Member> memberList = memberService.getList(params);
		if (memberList!=null) {
			for (Member member : memberList) {
				logger.debug(member.getUsername());
			}
		}
	}
}
