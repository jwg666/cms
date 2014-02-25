package com.neusoft.service;

import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.neusoft.model.portal.Papp;
import com.neusoft.util.ConverterUtil;

import base.BaseTestCase;

public class TestPappService extends BaseTestCase{
	@Resource
	private PappService pappService;
	@Test
	public void testGet(){
		Papp papp = new Papp();
		papp.setMemberId(1L);
		papp.setTbid(1L);
//		Map map = ConverterUtil.toHashMap(papp);
		logger.debug("-----------------");
		Papp temp = pappService.get(papp);
		logger.debug(temp.getName());
	}
}
