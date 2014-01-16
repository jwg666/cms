package com.neusoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.activiti.engine.impl.util.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.model.portal.App;
import com.neusoft.model.portal.Folder;
import com.neusoft.model.portal.Member;
import com.neusoft.model.portal.Papp;
import com.neusoft.model.portal.Pwallpaper;
import com.neusoft.model.portal.SearchModel;
import com.neusoft.model.portal.Wallpaper;
import com.neusoft.service.AppService;
import com.neusoft.service.FolderService;
import com.neusoft.service.MemberService;
import com.neusoft.service.PappService;
import com.neusoft.service.PwallpaperService;
import com.neusoft.service.WallpaperService;
import com.neusoft.util.LoginContextUtil;
@Controller
@RequestMapping("/portal")
public class IndexController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private MemberService memberService;
	@Resource
	private PwallpaperService pwallpaperService;
	@Resource
	private WallpaperService wallpaperService;
	@Resource
	private FolderService folderService;
	@Resource
	private AppService appService;
	@Resource
	private PappService pappService;
	
	
	@RequestMapping("/index")
	public String index(){
		logger.debug("portal index-----------------------");
		return "portal/home";
	}
	@RequestMapping(value="/ajax")
	@ResponseBody
	public String ajax(@RequestBody SearchModel model,HttpServletResponse response){
//		response.setContentType("text/html;charset=UTF-8");
//		response.setHeader("Pragma", "no-cache");  
//		response.setHeader("Cache-Control", "no-cache");  
//		response.setHeader("Expires", "0");  
//		response.setHeader("Content-Type", "text/xml; charset=utf-8");
//		response.setCharacterEncoding("utf-8");
		String ac = model.getAc();
		//获得主题
		if("getWallpaper".equals(ac)){return getWallpaper();}			
		//更新主题
		if("setWallpaper".equals(ac)){return setWallpaper(model);}			
		//获得窗口皮肤
		if("getSkin".equals(ac)){return getSkin();}			
		//获得应用码头位置
		if("getDockPos".equals(ac)){return getDockPos();}
		//更新应用码头位置
		if("setDockPos".equals(ac)){return setDockPos(model);}
		//获得图标排列方式
		if("getAppXY".equals(ac)){return getAppXY();}
		//更新图标排列方式
		if("setAppXY".equals(ac)){return setAppXY(model);}
		//获得文件夹内图标
		if("getMyFolderApp".equals(ac)){return getMyFolderApp(model);}
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
		 JSONObject json = new JSONObject();
		 json.put("success", true);
		 json.put("msg", "成功");
		 
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 
		 if (member!=null) {
			 json.put("wallpaperstate", member.getWallpaperstate());
			 int wallPaperState = member.getWallpaperstate();
			 switch(wallPaperState){
					 case 3:
						 json.put("wallpaperwebsite", member.getWallpaperwebsite());
					     break;
					 case 2:
						 json.put("wallpapertype", member.getWallpapertype());
						 Pwallpaper pwallpaper = pwallpaperService.getById(member.getWallpaperId());
						 json.put("url", pwallpaper.getUrl());
						 json.put("width", pwallpaper.getWidth());
						 json.put("height", pwallpaper.getHeight());
						 break;					 
					 default :
						 json.put("wallpapertype", member.getWallpapertype());
						 Wallpaper wallpaper = wallpaperService.getById(member.getWallpaperId());
						 json.put("url", wallpaper.getUrl());
						 json.put("width", wallpaper.getWidth());
						 json.put("height", wallpaper.getHeight());
					     break;
			 }
		}
		 
		 
		 return json.toString();
	 }			
	//更新主题
	 public String setWallpaper(SearchModel model){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 member.setWallpapertype(model.getWptype());
			if(0 != model.getWpstate().intValue()){
				member.setWallpaperstate(model.getWpstate());
				if(3 == model.getWpstate().intValue()){
					member.setWallpaperwebsite(model.getWp());
				}else{
					member.setWallpaperId(Integer.parseInt(model.getWp()));
				}
			}
			memberService.update(member);
			JSONObject json = new JSONObject();
			json.put("success", true);
		 return json.toString();
	 }			
	//获得窗口皮肤
	 public String getSkin(){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 return member.getSkin();
     }			
	//获得应用码头位置
	 public String getDockPos(){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 return member.getDockpos();
	 }
	//更新应用码头位置
	 public String setDockPos(SearchModel model){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 member.setDockpos(model.getDock());
		 memberService.update(member);
		 return "";	 
	 }
	//获得图标排列方式
	 public String getAppXY(){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 return member.getAppxy();	 
	 }
	//更新图标排列方式
	 public String setAppXY(SearchModel model){
		 Member member = memberService.getById(LoginContextUtil.get().getUserId());
		 member.setAppxy(model.getAppxy());
		 memberService.update(member);
		 return "";
	 }
	//获得文件夹内图标
	 public String getMyFolderApp(SearchModel model){
		    JSONObject json = new JSONObject();
			Member member = memberService.getById(LoginContextUtil.get().getUserId());
			Map<String,Object> params = new HashMap<String,Object>();			
			params.put("memberId",member.getTbid());
			params.put("tbid", model.getFolderid());
			List<Folder> memberAppList = folderService.getList(params);
			if (null!=memberAppList&&memberAppList.size()>0) {
				
				Folder folder = memberAppList.get(0);
				String content = folder.getContent();
				String[] v = content.split(",");
				for (String temp : v) {
					String[] c = temp.split("_");
				    if("app".equals(c[0])){
				    	
				    }
				    if("widget".equals(c[0])){
				    	App app = appService.getById(c[1]);
				    	json.put("type", app.getType());
				    	json.put("id", app.getTbid());
				    	json.put("name", app.getName());
				    	json.put("icon", app.getIcon());
				    }
				    if("papp".equals(c[0])){
				    	
				    }
				    if("pwidget".equals(c[0])){
				    	Papp app = pappService.getById(c[1]);
				    	json.put("type", app.getType());
				    	json.put("id", app.getTbid());
				    	json.put("name", app.getName());
				    	json.put("icon", app.getIcon());
				    }
				}
			}
		 return json.toString();
	 }
	//获得桌面图标
	 public String getMyApp(){
		 
		 
		 return "";
	 }
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
