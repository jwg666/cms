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
@Table(name = "tb_app_star")
public class AppStar  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * appId       db_column: app_id 
     */	
	private java.lang.Long appId;
    /**
     * memberId       db_column: member_id 
     */	
	private java.lang.Long memberId;
    /**
     * starnum       db_column: starnum 
     */	
	private java.lang.Integer starnum;
    /**
     * dt       db_column: dt 
     */	
	private java.util.Date dt;
	//columns END

	public AppStar(){
	}

	public AppStar(
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
	     * appId
	     * @return appId
	     */
		@Column(name="app_id")
		public java.lang.Long getAppId() {
			return this.appId;
		}
	
	/**
     * appId
     * @param appId appId
     */
	public void setAppId(java.lang.Long appId) {
		this.appId = appId;
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
		 /**
	     * starnum
	     * @return starnum
	     */
		@Column(name="starnum")
		public java.lang.Integer getStarnum() {
			return this.starnum;
		}
	
	/**
     * starnum
     * @param starnum starnum
     */
	public void setStarnum(java.lang.Integer starnum) {
		this.starnum = starnum;
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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTbid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof AppStar == false) return false;
		if(this == obj) return true;
		AppStar other = (AppStar)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

