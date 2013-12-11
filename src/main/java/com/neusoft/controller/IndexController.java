package com.neusoft.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/portal")
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/index")
	public String index(){
		logger.debug("portal index-----------------------");
		return "portal/home";
	}
	@RequestMapping("/ajax")
	public String ajax(){
		return "";
	}
	//获得主题
	 public String getWallpaper(){return "";}			
	//更新主题
	 public String setWallpaper(){return "";}			
	//获得窗口皮肤
	 public String getSkin(){return "";}			
	//获得应用码头位置
	 public String getDockPos(){return "";}
	//更新应用码头位置
	 public String setDockPos(){return "";}
	//获得图标排列方式
	 public String getAppXY(){return "";}
	//更新图标排列方式
	 public String setAppXY(){return "";}
	//获得文件夹内图标
	 public String getMyFolderApp(){return "";}
	//获得桌面图标
	 public String getMyApp(){return "";}
	//根据id获取图标
	 public String getMyAppById(){return "";}
	//添加桌面图标
	 public String addMyApp(){return "";}
	//删除桌面图标
	 public String delMyApp(){return "";}
	//更新桌面图标
	 public String moveMyApp(){return "";}
	//新建文件夹
	 public String addFolder(){return "";}
	//文件夹重命名
	 public String updateFolder(){return "";}
	//新建私人应用
	 public String addPapp(){return "";}
	//编辑私人应用
	 public String updatePapp(){return "";}
	//获得应用介绍
	 public String getAppRemark(){return "";}
	//获得应用评分
	 public String getAppStar(){return "";}
	//更新应用评分
	 public String updateAppStar(){return "";}
	 public String html5upload(){return "";}
	
}
