package com.neusoft.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/index")
	public String index(){
		logger.debug("index-----------------------");
		return "home";
	}
}
