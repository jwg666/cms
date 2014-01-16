package com.neusoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.activiti.engine.impl.util.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.neusoft.model.portal.Member;
import com.neusoft.service.MemberService;
import com.neusoft.util.MD5Util;
@Controller
@RequestMapping("/login")
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(getClass());	
	@Resource
	private MemberService memberService;
	
	@RequestMapping("/index")
	public String index(){
		logger.debug("login index page-----------------------");
		return "login";
	}
	@RequestMapping("/login")
	@ResponseBody
	public String login(@RequestParam String username,@RequestParam String password){
		logger.debug("login check-----------------------");
		JSONObject json = new JSONObject();
		Map<String,Object> params = new HashMap<String,Object>();	
		
		params.put("username", username);
		params.put("password", MD5Util.getMD5Code(password));
		List<Member> memberList = memberService.getList(params);
		if (memberList!=null&&memberList.size()>0) {
			json.put("success", true);
		    json.put("msg", "成功");
		}else{
			json.put("success", false);
		    json.put("msg", "失败，用户名或者密码不正确");
		}		
		return json.toString();
	}
	@RequestMapping("/regist")
	@ResponseBody
	public String regist(){
		logger.debug("regist-----------------------");
		JSONObject json = new JSONObject();
		json.put("success", true);
		json.put("msg", "成功");
		return json.toString();
	}
	@RequestMapping("/logout")
	@ResponseBody
	public String logout(){
		logger.debug("logout-----------------------");
		JSONObject json = new JSONObject();
		json.put("success", true);
		json.put("msg", "成功");
		return json.toString();
	}
}
