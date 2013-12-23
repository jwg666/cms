package com.neusoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public String ajax(HttpServletRequest request,HttpServletResponse response){
		String ac = request.getParameter("ac");
		//获得主题
		if("getWallpaper".equals(ac)){return getWallpaper();}			
		//更新主题
		if("setWallpaper".equals(ac)){return setWallpaper();}			
		//获得窗口皮肤
		if("getSkin".equals(ac)){return getSkin();}			
		//获得应用码头位置
		if("getDockPos".equals(ac)){return getDockPos();}
		//更新应用码头位置
		if("setDockPos".equals(ac)){return setDockPos();}
		//获得图标排列方式
		if("getAppXY".equals(ac)){return getAppXY();}
		//更新图标排列方式
		if("setAppXY".equals(ac)){return setAppXY();}
		//获得文件夹内图标
		if("getMyFolderApp".equals(ac)){return getMyFolderApp();}
		//获得桌面图标
		if("getMyApp".equals(ac)){return getMyApp();}
		//根据id获取图标
		if("getMyAppById".equals(ac)){return getMyAppById();}
		//添加桌面图标
		if("addMyApp".equals(ac)){return addMyApp();}
		//删除桌面图标
		if("delMyApp".equals(ac)){return delMyApp();}
		//更新桌面图标
		if("moveMyApp".equals(ac)){return moveMyApp();}
		//新建文件夹
		if("addFolder".equals(ac)){return addFolder();}
		//文件夹重命名
		if("updateFolder".equals(ac)){return updateFolder();}
		//新建私人应用
		if("addPapp".equals(ac)){return addPapp();}
		//编辑私人应用
		if("updatePapp".equals(ac)){return updatePapp();}
		//获得应用介绍
		if("getAppRemark".equals(ac)){return getAppRemark();}
		//获得应用评分
		if("getAppStar".equals(ac)){return getAppStar();}
		//更新应用评分
		if("updateAppStar".equals(ac)){return updateAppStar();}
		if("html5upload".equals(ac)){return html5upload();}
		return null;
	}
	//获得主题
	 public String getWallpaper(){
		 
		 return "";
	 }			
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
