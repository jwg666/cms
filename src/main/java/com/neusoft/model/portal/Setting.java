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
@Table(name = "tb_setting")
public class Setting  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * 网站标题       db_column: title 
     */	
	private java.lang.String title;
    /**
     * 网站描述       db_column: description 
     */	
	private java.lang.String description;
    /**
     * 网站关键字       db_column: keywords 
     */	
	private java.lang.String keywords;
	//columns END

	public Setting(){
	}

	public Setting(
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
	     * 网站标题
	     * @return 网站标题
	     */
		@Column(name="title")
		public java.lang.String getTitle() {
			return this.title;
		}
	
	/**
     * 网站标题
     * @param title 网站标题
     */
	public void setTitle(java.lang.String title) {
		this.title = title;
	}
		 /**
	     * 网站描述
	     * @return 网站描述
	     */
		@Column(name="description")
		public java.lang.String getDescription() {
			return this.description;
		}
	
	/**
     * 网站描述
     * @param description 网站描述
     */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
		 /**
	     * 网站关键字
	     * @return 网站关键字
	     */
		@Column(name="keywords")
		public java.lang.String getKeywords() {
			return this.keywords;
		}
	
	/**
     * 网站关键字
     * @param keywords 网站关键字
     */
	public void setKeywords(java.lang.String keywords) {
		this.keywords = keywords;
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
		if(obj instanceof Setting == false) return false;
		if(this == obj) return true;
		Setting other = (Setting)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

