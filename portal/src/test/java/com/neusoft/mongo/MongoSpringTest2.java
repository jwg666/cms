package com.neusoft.mongo;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.data.mongodb.core.MongoOperations;

import com.neusoft.model.Msg;
//import org.springframework.data.mongodb.core.MongoTemplate;

import base.BaseTestCase;

public class MongoSpringTest2 extends BaseTestCase{
	@Resource
	private MongoOperations mongoOperations;
//	public void 
	@Test
	public void testMongo(){
//		mongoOperations.createCollection("msg");
//		Msg msg = new Msg();	
//		msg.setId("111111");
//		msg.setTitle("第二条测试数据");
//		msg.setContent("大家好，欢迎大家");
//		mongoOperations.save(msg);
//		mongoOperations.createCollection(Msg.class);
		
		Msg msg = mongoOperations.findById("111111", Msg.class);
	    logger.debug(msg.getTitle()+"||"+msg.getContent());
	}
}
