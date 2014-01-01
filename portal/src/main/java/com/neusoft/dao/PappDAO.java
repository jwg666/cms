/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neusoft.model.portal.Papp;



/**
 * database table: tb_papp
 * database table comments: Papp
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Repository
public class PappDAO extends HBaseDAO<Papp>{
		public List<Papp> findList(Map<String, Object> params) {		
			return findList(Papp.class, params);
		}	
}
