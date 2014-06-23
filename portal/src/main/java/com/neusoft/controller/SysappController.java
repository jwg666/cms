package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sysapp")
public class SysappController {	
	 @RequestMapping("/appmarket")
	 public String appmarket(){
		 return "";
	 } 
	 @RequestMapping("/desksetting")
	 public String desksetting(){
		 return "";
	 }
	 @RequestMapping("/wallpaper")
	 public String wallpaper(){
		 return "";
	 }
	 @RequestMapping("/avatar")
	 public String avatar(){
		 return "";
	 }
	 @RequestMapping("/dialog/app")
	 public String app(){
		 return "";
	 }
	 @RequestMapping("/dialog/papp")
	 public String papp(){
		 return "";
	 }
	 
}
