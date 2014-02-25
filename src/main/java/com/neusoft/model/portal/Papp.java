/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.model.portal;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

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
@Table(name = "tb_papp")
public class Papp  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * 图标名称       db_column: name 
     */	
	private java.lang.String name;
    /**
     * 图标图片       db_column: icon 
     */	
	private java.lang.String icon;
    /**
     * 图标链接       db_column: url 
     */	
	private java.lang.String url;
    /**
     * 应用类型，参数有：app，widget       db_column: type 
     */	
	private java.lang.String type;
    /**
     * 窗口宽度       db_column: width 
     */	
	private java.lang.Integer width;
    /**
     * 窗口高度       db_column: height 
     */	
	private java.lang.Integer height;
    /**
     * 是否能对窗口进行拉伸       db_column: isresize 
     */	
	private java.lang.Boolean isresize;
    /**
     * dt       db_column: dt 
     */	
	private java.util.Date dt;
    /**
     * 排序       db_column: indexid 
     */	
	private java.lang.Long indexid;
    /**
     * memberId       db_column: member_id 
     */	
	private java.lang.Long memberId;
	//columns END

	public Papp(){
	}

	public Papp(
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
	     * 图标名称
	     * @return 图标名称
	     */
		@Column(name="name")
		public java.lang.String getName() {
			return this.name;
		}
	
	/**
     * 图标名称
     * @param name 图标名称
     */
	public void setName(java.lang.String name) {
		this.name = name;
	}
		 /**
	     * 图标图片
	     * @return 图标图片
	     */
		@Column(name="icon")
		public java.lang.String getIcon() {
			return this.icon;
		}
	
	/**
     * 图标图片
     * @param icon 图标图片
     */
	public void setIcon(java.lang.String icon) {
		this.icon = icon;
	}
		 /**
	     * 图标链接
	     * @return 图标链接
	     */
		@Column(name="url")
		public java.lang.String getUrl() {
			return this.url;
		}
	
	/**
     * 图标链接
     * @param url 图标链接
     */
	public void setUrl(java.lang.String url) {
		this.url = url;
	}
		 /**
	     * 应用类型，参数有：app，widget
	     * @return 应用类型，参数有：app，widget
	     */
		@Column(name="type")
		public java.lang.String getType() {
			return this.type;
		}
	
	/**
     * 应用类型，参数有：app，widget
     * @param type 应用类型，参数有：app，widget
     */
	public void setType(java.lang.String type) {
		this.type = type;
	}
		 /**
	     * 窗口宽度
	     * @return 窗口宽度
	     */
		@Column(name="width")
		public java.lang.Integer getWidth() {
			return this.width;
		}
	
	/**
     * 窗口宽度
     * @param width 窗口宽度
     */
	public void setWidth(java.lang.Integer width) {
		this.width = width;
	}
		 /**
	     * 窗口高度
	     * @return 窗口高度
	     */
		@Column(name="height")
		public java.lang.Integer getHeight() {
			return this.height;
		}
	
	/**
     * 窗口高度
     * @param height 窗口高度
     */
	public void setHeight(java.lang.Integer height) {
		this.height = height;
	}
		 /**
	     * 是否能对窗口进行拉伸
	     * @return 是否能对窗口进行拉伸
	     */
		@Column(name="isresize")
		public java.lang.Boolean getIsresize() {
			return this.isresize;
		}
	
	/**
     * 是否能对窗口进行拉伸
     * @param isresize 是否能对窗口进行拉伸
     */
	public void setIsresize(java.lang.Boolean isresize) {
		this.isresize = isresize;
	}
	    /**
	     * dt
	     * @return dt
	     */
	public String getDtString() {
		//return DateConvertUtils.format(getDt(), FORMAT_DT);
		return  DateUtils.format(DateUtils.FORMAT3,getDt());
	}
	 /**
     * dt
     * @param dt dt
     */
	public void setDtString(String dt) {
		setDt(DateUtils.parse(dt,DateUtils.FORMAT3,java.util.Date.class));
	}
	
		 /**
	     * dt
	     * @return dt
	     */
		@Column(name="dt")
		public java.util.Date getDt() {
			return this.dt;
		}
	
	/**
     * dt
     * @param dt dt
     */
	public void setDt(java.util.Date dt) {
		this.dt = dt;
	}
		 /**
	     * 排序
	     * @return 排序
	     */
		@Column(name="indexid")
		public java.lang.Long getIndexid() {
			return this.indexid;
		}
	
	/**
     * 排序
     * @param indexid 排序
     */
	public void setIndexid(java.lang.Long indexid) {
		this.indexid = indexid;
	}
		 /**
	     * memberId
	     * @return memberId
	     */
		@Column(name="member_id")
		public java.lang.Long getMemberId() {
			return this.memberId;
		}
	
	/**
     * memberId
     * @param memberId memberId
     */
	public void setMemberId(java.lang.Long memberId) {
		this.memberId = memberId;
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
		if(obj instanceof Papp == false) return false;
		if(this == obj) return true;
		Papp other = (Papp)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}

}

