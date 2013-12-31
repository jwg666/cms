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
@Table(name = "tb_permission")
public class Permission  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	

	
    /**
     * tbid       db_column: tbid 
     */	
	private java.lang.Long tbid;
    /**
     * name       db_column: name 
     */	
	private java.lang.String name;
    /**
     * appsId       db_column: apps_id 
     */	
	private java.lang.String appsId;
	//columns END

	public Permission(){
	}

	public Permission(
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
	     * appsId
	     * @return appsId
	     */
		@Column(name="apps_id")
		public java.lang.String getAppsId() {
			return this.appsId;
		}
	
	/**
     * appsId
     * @param appsId appsId
     */
	public void setAppsId(java.lang.String appsId) {
		this.appsId = appsId;
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
		if(obj instanceof Permission == false) return false;
		if(this == obj) return true;
		Permission other = (Permission)obj;
		return new EqualsBuilder()
			.append(getTbid(),other.getTbid())
			.isEquals();
	}
}

