package com.neusoft.model.portal;

import org.springframework.ui.ModelMap;


public class SearchModel extends ModelMap{
	
	private static final long serialVersionUID = -8093757610982389488L;
	private String ac;
	//壁纸状态 系统默认：1 , 上传：2 外部url：3
	private Integer wpstate;
	//拉伸、平铺....
	private String wptype;
	//wp 壁纸i的或者url
	private String wp;
	//应用码头位置  left or right
	private String dock;
	//应用图标 排列方式  x or y
	private String appxy;
	//folderid文件夹id
	private Integer folderid;
	
	//桌面号
	private Integer desk;
	//桌面名称
	private String deskName;
	
	//移动后桌面号
	private Integer otherdesk;
	private String icon;
	private String name;
	//桌面号
	private Integer todesk;
	//移动到那个file (id) or 移动到后顺序
	private Integer to;
	//移动前顺序
	private Integer from;
	//移动的类型 
	private String movetype;
	//skin皮肤
	private String skin;
	
	/* ------新建私人应用-------*/
	private	String valIcon;
	private	String valName;
	private	String valUrl;
	private	Integer valWidth;
	private	Integer valHeight;
	private	String valType;
	private	Integer valIsresize;
	private	Integer valIsopenmax;
	private	Integer valIsflash;
	//是否为系统应用 1：是
	private Integer valIsapp=0;
	
	private Integer id;
	private String type;
	
	public SearchModel() {
	}

	public Integer getDesk() {
		return desk;
	}

	public void setDesk(Integer desk) {
		this.desk = desk;
	}

	public String getDeskName() {
		return deskName;
	}

	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}

	public Integer getOtherdesk() {
		return otherdesk;
	}

	public void setOtherdesk(Integer otherdesk) {
		this.otherdesk = otherdesk;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTodesk() {
		return todesk;
	}

	public void setTodesk(Integer todesk) {
		this.todesk = todesk;
	}

	public Integer getTo() {
		return to;
	}

	public void setTo(Integer to) {
		this.to = to;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public String getMovetype() {
		return movetype;
	}

	public void setMovetype(String movetype) {
		this.movetype = movetype;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public String getValIcon() {
		return valIcon;
	}

	public void setValIcon(String valIcon) {
		this.valIcon = valIcon;
	}

	public String getValName() {
		return valName;
	}

	public void setValName(String valName) {
		this.valName = valName;
	}

	public String getValUrl() {
		return valUrl;
	}

	public void setValUrl(String valUrl) {
		this.valUrl = valUrl;
	}

	public Integer getValWidth() {
		return valWidth;
	}

	public void setValWidth(Integer valWidth) {
		this.valWidth = valWidth;
	}

	public Integer getValHeight() {
		return valHeight;
	}

	public void setValHeight(Integer valHeight) {
		this.valHeight = valHeight;
	}

	public String getValType() {
		return valType;
	}

	public void setValType(String valType) {
		this.valType = valType;
	}

	public Integer getValIsresize() {
		return valIsresize;
	}

	public void setValIsresize(Integer valIsresize) {
		this.valIsresize = valIsresize;
	}

	public Integer getValIsopenmax() {
		return valIsopenmax;
	}

	public void setValIsopenmax(Integer valIsopenmax) {
		this.valIsopenmax = valIsopenmax;
	}

	public Integer getValIsflash() {
		return valIsflash;
	}

	public void setValIsflash(Integer valIsflash) {
		this.valIsflash = valIsflash;
	}

	public Integer getValIsapp() {
		return valIsapp;
	}

	public void setValIsapp(Integer valIsapp) {
		this.valIsapp = valIsapp;
	}

	public Integer getWpstate() {
		return wpstate;
	}

	public void setWpstate(Integer wpstate) {
		this.wpstate = wpstate;
	}

	public String getWptype() {
		return wptype;
	}

	public void setWptype(String wptype) {
		this.wptype = wptype;
	}

	public String getWp() {
		return wp;
	}

	public void setWp(String wp) {
		this.wp = wp;
	}

	public String getDock() {
		return dock;
	}

	public void setDock(String dock) {
		this.dock = dock;
	}

	public String getAppxy() {
		return appxy;
	}

	public void setAppxy(String appxy) {
		this.appxy = appxy;
	}

	public Integer getFolderid() {
		return folderid;
	}

	public void setFolderid(Integer folderid) {
		this.folderid = folderid;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
