/*
 * Powered By neusoft 
 * Since 2008 - 2013
 */

package com.neusoft.model.space;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.neusoft.base.DateUtils;

/**
 * database table: space_resource_file
 * database table comments: ResourceFile
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
public class ResourceFile  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ResourceFile";
	public static final String ALIAS_ID = "ID";
	public static final String ALIAS_TITLE = "标题";
	public static final String ALIAS_DESCRIPTION = "描述";
	public static final String ALIAS_PATH = "路径";
	public static final String ALIAS_OWNER_ID = "ownerId";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_TYPE = "type";
	
    /**
     * ID       db_column: ID 
     */	
	private java.lang.Long id;
    /**
     * 标题       db_column: title 
     */	
	private java.lang.String title;
    /**
     * 描述       db_column: description 
     */	
	private java.lang.String description;
    /**
     * 路径       db_column: path 
     */	
	private java.lang.String path;
    /**
     * ownerId       db_column: owner_id 
     */	
	private java.lang.Long ownerId;
    /**
     * createTime       db_column: create_time 
     */	
	private java.util.Date createTime;
    /**
     * type       db_column: type 
     */	
	private java.lang.String type;
	//columns END

	public ResourceFile(){
	}

	public ResourceFile(
		java.lang.Long id
	){
		this.id = id;
	}

	 /**
     * ID
     * @param id ID
     */
	public void setId(java.lang.Long id) {
		this.id = id;
	}
	  /**
     * ID
     * @return ID
     */
	public java.lang.Long getId() {
		return this.id;
	}
	 /**
     * 标题
     * @param title 标题
     */
	public void setTitle(java.lang.String title) {
		this.title = title;
	}
	  /**
     * 标题
     * @return 标题
     */
	public java.lang.String getTitle() {
		return this.title;
	}
	 /**
     * 描述
     * @param description 描述
     */
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	  /**
     * 描述
     * @return 描述
     */
	public java.lang.String getDescription() {
		return this.description;
	}
	 /**
     * 路径
     * @param path 路径
     */
	public void setPath(java.lang.String path) {
		this.path = path;
	}
	  /**
     * 路径
     * @return 路径
     */
	public java.lang.String getPath() {
		return this.path;
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
	public java.lang.Long getOwnerId() {
		return this.ownerId;
	}
	    /**
	     * createTime
	     * @return createTime
	     */
	public String getCreateTimeString() {
		//return DateConvertUtils.format(getCreateTime(), FORMAT_CREATE_TIME);
		return  DateUtils.format(DateUtils.FORMAT3,getCreateTime());
	}
	 /**
     * createTime
     * @param createTime createTime
     */
	public void setCreateTimeString(String createTime) {
		setCreateTime(DateUtils.parse(createTime,DateUtils.FORMAT3,java.util.Date.class));
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
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	 /**
     * type
     * @param type type
     */
	public void setType(java.lang.String type) {
		this.type = type;
	}
	  /**
     * type
     * @return type
     */
	public java.lang.String getType() {
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
		if(obj instanceof ResourceFile == false) return false;
		if(this == obj) return true;
		ResourceFile other = (ResourceFile)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

