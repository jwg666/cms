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
@Table(name = "tb_pwallpaper")
public class Pwallpaper  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * url       db_column: url 
     */	
	private java.lang.String url;
    /**
     * width       db_column: width 
     */	
	private java.lang.Integer width;
    /**
     * height       db_column: height 
     */	
	private java.lang.Integer height;
    /**
     * memberId       db_column: member_id 
     */	
	private java.lang.Long memberId;
	//columns END

	public Pwallpaper(){
	}

	public Pwallpaper(
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
	     * url
	     * @return url
	     */
		@Column(name="url")
		public java.lang.String getUrl() {
			return this.url;
		}
	
	/**
     * url
     * @param url url
     */
	public void setUrl(java.lang.String url) {
		this.url = url;
	}
		 /**
	     * width
	     * @return width
	     */
		@Column(name="width")
		public java.lang.Integer getWidth() {
			return this.width;
		}
	
	/**
     * width
     * @param width width
     */
	public void setWidth(java.lang.Integer width) {
		this.width = width;
	}
		 /**
	     * height
	     * @return height
	     */
		@Column(name="height")
		public java.lang.Integer getHeight() {
			return this.height;
		}
	
	/**
     * height
     * @param height height
     */
	public void setHeight(java.lang.Integer height) {
		this.height = height;
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
		if(obj instanceof Pwallpaper == false) return false;
		if(this == obj) return true;
		Pwallpaper other = (Pwallpaper)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

