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
@Table(name = "tb_folder")
public class Folder  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * icon       db_column: icon 
     */	
	private java.lang.String icon;
    /**
     * name       db_column: name 
     */	
	private java.lang.String name;
    /**
     * content       db_column: content 
     */	
	private java.lang.String content;
    /**
     * memberId       db_column: member_id 
     */	
	private java.lang.Long memberId;
    /**
     * dt       db_column: dt 
     */	
	private java.util.Date dt;
	//columns END

	public Folder(){
	}

	public Folder(
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
	     * icon
	     * @return icon
	     */
		@Column(name="icon")
		public java.lang.String getIcon() {
			return this.icon;
		}
	
	/**
     * icon
     * @param icon icon
     */
	public void setIcon(java.lang.String icon) {
		this.icon = icon;
	}
		 /**
	     * name
	     * @return name
	     */
		@Column(name="name")
		public java.lang.String getName() {
			return this.name;
		}
	
	/**
     * name
     * @param name name
     */
	public void setName(java.lang.String name) {
		this.name = name;
	}
		 /**
	     * content
	     * @return content
	     */
		@Column(name="content")
		public java.lang.String getContent() {
			return this.content;
		}
	
	/**
     * content
     * @param content content
     */
	public void setContent(java.lang.String content) {
		this.content = content;
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
		if(obj instanceof Folder == false) return false;
		if(this == obj) return true;
		Folder other = (Folder)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

