/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.model.space;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * database table: space_blog
 * database table comments: Blog
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
@Entity
@Table(name="space_blog")
public class Blog  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Blog";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TITLE = "title";
	public static final String ALIAS_DESCRIPTION = "description";
	public static final String ALIAS_CONTENTS = "contents";
	public static final String ALIAS_OWNER_ID = "ownerId";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_STATUS = "status";
	public static final String ALIAS_TYPE = "type";
	
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * title       db_column: title 
     */	
	private java.lang.String title;
    /**
     * description       db_column: description 
     */	
	private java.lang.String description;
    /**
     * contents       db_column: contents 
     */	
	private java.lang.String contents;
    /**
     * ownerId       db_column: owner_id 
     */	
	private java.lang.Long ownerId;
    /**
     * createTime       db_column: create_time 
     */	
	private java.util.Date createTime;
    /**
     * status       db_column: status 
     */	
	private java.lang.String status;
    /**
     * type       db_column: type 
     */	
	private java.lang.Long type;
	//columns END

	public Blog(){
	}

	public Blog(
		java.lang.Long id
	){
		this.id = id;
	}

	 /**
     * id
     * @param id id
     */
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	  /**
     * id
     * @return id
     */
	@Id  
    @GeneratedValue
    @Column(name = "id")
	public java.lang.Long getId() {
		return this.id;
	}
	 /**
     * title
     * @param title title
     */
	public void setTitle(java.lang.String title) {
		this.title = title;
	}
	  /**
     * title
     * @return title
     */
	@Column(name = "title")
	public java.lang.String getTitle() {
		return this.title;
	}
	 /**
     * description
     * @param description description
     */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	  /**
     * description
     * @return description
     */
	@Column(name = "description")
	public java.lang.String getDescription() {
		return this.description;
	}
	 /**
     * contents
     * @param contents contents
     */
	public void setContents(java.lang.String contents) {
		this.contents = contents;
	}
	  /**
     * contents
     * @return contents
     */
	@Column(name = "contents")
	public java.lang.String getContents() {
		return this.contents;
	}
	 /**
     * ownerId
     * @param ownerId ownerId
     */
	public void setOwnerId(java.lang.Long ownerId) {
		this.ownerId = ownerId;
	}
	  /**
     * ownerId
     * @return ownerId
     */
	@Column(name = "owner_id")
	public java.lang.Long getOwnerId() {
		return this.ownerId;
	}
	  
	
	 /**
     * createTime
     * @param createTime createTime
     */
	
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	  /**
     * createTime
     * @return createTime
     */
	@Column(name = "create_time")
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	 /**
     * status
     * @param status status
     */
	public void setStatus(java.lang.String status) {
		this.status = status;
	}
	  /**
     * status
     * @return status
     */
	@Column(name = "status")
	public java.lang.String getStatus() {
		return this.status;
	}
	 /**
     * type
     * @param type type
     */
	public void setType(java.lang.Long type) {
		this.type = type;
	}
	  /**
     * type
     * @return type
     */
	@Column(name = "type")
	public java.lang.Long getType() {
		return this.type;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Blog == false) return false;
		if(this == obj) return true;
		Blog other = (Blog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

