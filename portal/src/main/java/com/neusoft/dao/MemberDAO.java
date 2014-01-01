/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.Member;



/**
 * database table: tb_member
 * database table comments: Member
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class MemberDAO extends HBaseDAO<Member>{
		public List<Member> findList(Map<String, Object> params) {		
			return findList(Member.class, params);
		}	
}
