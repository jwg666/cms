package com.neusoft.service;


import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.neusoft.model.space.Blog;

import base.BaseTestCase;

public class TestBlogService extends BaseTestCase{
	@Resource
	private BlogService blogService;
	@Test
	public void testSave(){
		logger.debug("开始");
		Blog blog = new Blog();
		blog.setContents("第一篇测试用");
		blog.setCreateTime(new Date());
		blog.setDescription("这个是描述");
		blog.setOwnerId(2L);
		blog.setStatus("0");
		blog.setTitle("标题测试");
		blog.setType(1L);
		
		blogService.save(blog);
		logger.debug("运行完成");
	}
}
