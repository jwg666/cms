/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.model.portal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.neusoft.base.DateUtils;

@Entity
@Table(name = "tb_member")
public class Member  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * username       db_column: username 
     */	
	private java.lang.String username;
    /**
     * password       db_column: password 
     */	
	private java.lang.String password;
    /**
     * 用户类型，0普通用户，1管理员       db_column: type 
     */	
	private java.lang.Boolean type;
    /**
     * permissionId       db_column: permission_id 
     */	
	private java.lang.Long permissionId;
    /**
     * [应用码头]应用id，用","相连       db_column: dock 
     */	
	private java.lang.String dock;
    /**
     * [桌面1]应用id，用","相连       db_column: desk1 
     */	
	private java.lang.String desk1;
    /**
     * [桌面2]应用id，用","相连       db_column: desk2 
     */	
	private java.lang.String desk2;
    /**
     * [桌面3]应用id，用","相连       db_column: desk3 
     */	
	private java.lang.String desk3;
    /**
     * [桌面4]应用id，用","相连       db_column: desk4 
     */	
	private java.lang.String desk4;
    /**
     * [桌面5]应用id，用","相连       db_column: desk5 
     */	
	private java.lang.String desk5;
    /**
     * 图标排列方式       db_column: appxy 
     */	
	private java.lang.String appxy;
    /**
     * 应用码头位置，参数：top,left,right       db_column: dockpos 
     */	
	private java.lang.String dockpos;
    /**
     * wallpaperId       db_column: wallpaper_id 
     */	
	private java.lang.Integer wallpaperId;
    /**
     * wallpaperwebsite       db_column: wallpaperwebsite 
     */	
	private java.lang.String wallpaperwebsite;
    /**
     * 1系统壁纸、2自定义壁纸、3网络地址       db_column: wallpaperstate 
     */	
	private Integer wallpaperstate;
    /**
     * 壁纸显示方式：tianchong,shiying,pingpu,lashen,juzhong       db_column: wallpapertype 
     */	
	private java.lang.String wallpapertype;
    /**
     * 窗口皮肤       db_column: skin 
     */	
	private java.lang.String skin;
    /**
     * 注册时间       db_column: regdt 
     */	
	private java.util.Date regdt;
    /**
     * 最后登入时间       db_column: lastlogindt 
     */	
	private java.util.Date lastlogindt;
    /**
     * 最后登入IP       db_column: lastloginip 
     */	
	private java.lang.String lastloginip;
	//columns END

	public Member(){
	}

	public Member(
		java.lang.Long tbid
	){
		this.tbid = tbid;
	}

		 /**
	     * tbid
	     * @return tbid
	     */
		@Id  
	    @GeneratedValue
		@Column(name="tbid")
		public java.lang.Long getTbid() {
			return this.tbid;
		}
	
	/**
     * tbid
     * @param tbid tbid
     */
	public void setTbid(java.lang.Long tbid) {
		this.tbid = tbid;
	}
		 /**
	     * username
	     * @return username
	     */
		@Column(name="username")
		public java.lang.String getUsername() {
			return this.username;
		}
	
	/**
     * username
     * @param username username
     */
	public void setUsername(java.lang.String username) {
		this.username = username;
	}
		 /**
	     * password
	     * @return password
	     */
		@Column(name="password")
		public java.lang.String getPassword() {
			return this.password;
		}
	
	/**
     * password
     * @param password password
     */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
		 /**
	     * 用户类型，0普通用户，1管理员
	     * @return 用户类型，0普通用户，1管理员
	     */
		@Column(name="type")
		public java.lang.Boolean getType() {
			return this.type;
		}
	
	/**
     * 用户类型，0普通用户，1管理员
     * @param type 用户类型，0普通用户，1管理员
     */
	public void setType(java.lang.Boolean type) {
		this.type = type;
	}
		 /**
	     * permissionId
	     * @return permissionId
	     */
		@Column(name="permission_id")
		public java.lang.Long getPermissionId() {
			return this.permissionId;
		}
	
	/**
     * permissionId
     * @param permissionId permissionId
     */
	public void setPermissionId(java.lang.Long permissionId) {
		this.permissionId = permissionId;
	}
		 /**
	     * [应用码头]应用id，用","相连
	     * @return [应用码头]应用id，用","相连
	     */
		@Column(name="dock")
		public java.lang.String getDock() {
			return this.dock;
		}
	
	/**
     * [应用码头]应用id，用","相连
     * @param dock [应用码头]应用id，用","相连
     */
	public void setDock(java.lang.String dock) {
		this.dock = dock;
	}
		 /**
	     * [桌面1]应用id，用","相连
	     * @return [桌面1]应用id，用","相连
	     */
		@Column(name="desk1")
		public java.lang.String getDesk1() {
			return this.desk1;
		}
	
	/**
     * [桌面1]应用id，用","相连
     * @param desk1 [桌面1]应用id，用","相连
     */
	public void setDesk1(java.lang.String desk1) {
		this.desk1 = desk1;
	}
		 /**
	     * [桌面2]应用id，用","相连
	     * @return [桌面2]应用id，用","相连
	     */
		@Column(name="desk2")
		public java.lang.String getDesk2() {
			return this.desk2;
		}
	
	/**
     * [桌面2]应用id，用","相连
     * @param desk2 [桌面2]应用id，用","相连
     */
	public void setDesk2(java.lang.String desk2) {
		this.desk2 = desk2;
	}
		 /**
	     * [桌面3]应用id，用","相连
	     * @return [桌面3]应用id，用","相连
	     */
		@Column(name="desk3")
		public java.lang.String getDesk3() {
			return this.desk3;
		}
	
	/**
     * [桌面3]应用id，用","相连
     * @param desk3 [桌面3]应用id，用","相连
     */
	public void setDesk3(java.lang.String desk3) {
		this.desk3 = desk3;
	}
		 /**
	     * [桌面4]应用id，用","相连
	     * @return [桌面4]应用id，用","相连
	     */
		@Column(name="desk4")
		public java.lang.String getDesk4() {
			return this.desk4;
		}
	
	/**
     * [桌面4]应用id，用","相连
     * @param desk4 [桌面4]应用id，用","相连
     */
	public void setDesk4(java.lang.String desk4) {
		this.desk4 = desk4;
	}
		 /**
	     * [桌面5]应用id，用","相连
	     * @return [桌面5]应用id，用","相连
	     */
		@Column(name="desk5")
		public java.lang.String getDesk5() {
			return this.desk5;
		}
	
	/**
     * [桌面5]应用id，用","相连
     * @param desk5 [桌面5]应用id，用","相连
     */
	public void setDesk5(java.lang.String desk5) {
		this.desk5 = desk5;
	}
		 /**
	     * 图标排列方式
	     * @return 图标排列方式
	     */
		@Column(name="appxy")
		public java.lang.String getAppxy() {
			return this.appxy;
		}
	
	/**
     * 图标排列方式
     * @param appxy 图标排列方式
     */
	public void setAppxy(java.lang.String appxy) {
		this.appxy = appxy;
	}
		 /**
	     * 应用码头位置，参数：top,left,right
	     * @return 应用码头位置，参数：top,left,right
	     */
		@Column(name="dockpos")
		public java.lang.String getDockpos() {
			return this.dockpos;
		}
	
	/**
     * 应用码头位置，参数：top,left,right
     * @param dockpos 应用码头位置，参数：top,left,right
     */
	public void setDockpos(java.lang.String dockpos) {
		this.dockpos = dockpos;
	}
		 /**
	     * wallpaperId
	     * @return wallpaperId
	     */
		@Column(name="wallpaper_id")
		public java.lang.Integer getWallpaperId() {
			return this.wallpaperId;
		}
	
	/**
     * wallpaperId
     * @param wallpaperId wallpaperId
     */
	public void setWallpaperId(java.lang.Integer wallpaperId) {
		this.wallpaperId = wallpaperId;
	}
		 /**
	     * wallpaperwebsite
	     * @return wallpaperwebsite
	     */
		@Column(name="wallpaperwebsite")
		public java.lang.String getWallpaperwebsite() {
			return this.wallpaperwebsite;
		}
	
	/**
     * wallpaperwebsite
     * @param wallpaperwebsite wallpaperwebsite
     */
	public void setWallpaperwebsite(java.lang.String wallpaperwebsite) {
		this.wallpaperwebsite = wallpaperwebsite;
	}
		 /**
	     * 1系统壁纸、2自定义壁纸、3网络地址
	     * @return 1系统壁纸、2自定义壁纸、3网络地址
	     */
		@Column(name="wallpaperstate")
		public Integer getWallpaperstate() {
			return this.wallpaperstate;
		}
	
	/**
     * 1系统壁纸、2自定义壁纸、3网络地址
     * @param wallpaperstate 1系统壁纸、2自定义壁纸、3网络地址
     */
	public void setWallpaperstate(Integer wallpaperstate) {
		this.wallpaperstate = wallpaperstate;
	}
		 /**
	     * 壁纸显示方式：tianchong,shiying,pingpu,lashen,juzhong
	     * @return 壁纸显示方式：tianchong,shiying,pingpu,lashen,juzhong
	     */
		@Column(name="wallpapertype")
		public java.lang.String getWallpapertype() {
			return this.wallpapertype;
		}
	
	/**
     * 壁纸显示方式：tianchong,shiying,pingpu,lashen,juzhong
     * @param wallpapertype 壁纸显示方式：tianchong,shiying,pingpu,lashen,juzhong
     */
	public void setWallpapertype(java.lang.String wallpapertype) {
		this.wallpapertype = wallpapertype;
	}
		 /**
	     * 窗口皮肤
	     * @return 窗口皮肤
	     */
		@Column(name="skin")
		public java.lang.String getSkin() {
			return this.skin;
		}
	
	/**
     * 窗口皮肤
     * @param skin 窗口皮肤
     */
	public void setSkin(java.lang.String skin) {
		this.skin = skin;
	}
	    /**
	     * 注册时间
	     * @return 注册时间
	     */
	public String getRegdtString() {
		//return DateConvertUtils.format(getRegdt(), FORMAT_REGDT);
		return  DateUtils.format(DateUtils.FORMAT3,getRegdt());
	}
	 /**
     * 注册时间
     * @param regdt 注册时间
     */
	public void setRegdtString(String regdt) {
		setRegdt(DateUtils.parse(regdt,DateUtils.FORMAT3,java.util.Date.class));
	}
	
		 /**
	     * 注册时间
	     * @return 注册时间
	     */
		@Column(name="regdt")
		public java.util.Date getRegdt() {
			return this.regdt;
		}
	
	/**
     * 注册时间
     * @param regdt 注册时间
     */
	public void setRegdt(java.util.Date regdt) {
		this.regdt = regdt;
	}
	    /**
	     * 最后登入时间
	     * @return 最后登入时间
	     */
	public String getLastlogindtString() {
		//return DateConvertUtils.format(getLastlogindt(), FORMAT_LASTLOGINDT);
		return  DateUtils.format(DateUtils.FORMAT3,getLastlogindt());
	}
	 /**
     * 最后登入时间
     * @param lastlogindt 最后登入时间
     */
	public void setLastlogindtString(String lastlogindt) {
		setLastlogindt(DateUtils.parse(lastlogindt,DateUtils.FORMAT3,java.util.Date.class));
	}
	
		 /**
	     * 最后登入时间
	     * @return 最后登入时间
	     */
		@Column(name="lastlogindt")
		public java.util.Date getLastlogindt() {
			return this.lastlogindt;
		}
	
	/**
     * 最后登入时间
     * @param lastlogindt 最后登入时间
     */
	public void setLastlogindt(java.util.Date lastlogindt) {
		this.lastlogindt = lastlogindt;
	}
		 /**
	     * 最后登入IP
	     * @return 最后登入IP
	     */
		@Column(name="lastloginip")
		public java.lang.String getLastloginip() {
			return this.lastloginip;
		}
	
	/**
     * 最后登入IP
     * @param lastloginip 最后登入IP
     */
	public void setLastloginip(java.lang.String lastloginip) {
		this.lastloginip = lastloginip;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTbid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Member == false) return false;
		if(this == obj) return true;
		Member other = (Member)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

