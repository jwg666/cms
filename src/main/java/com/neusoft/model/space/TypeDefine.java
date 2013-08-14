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
 * database table: space_type_define
 * database table comments: TypeDefine
 * 
 *
 * @author jiawg-贾伟光
 * @Email jiawg@neusoft.com
 *
 
 */
public class TypeDefine  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "TypeDefine";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TYPE_NAME = "typeName";
	public static final String ALIAS_TYPE_DESCRIPTION = "typeDescription";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_OWNER_ID = "ownerId";
	
    /**
     * id       db_column: id 
     */	
	private java.lang.Long id;
    /**
     * typeName       db_column: type_name 
     */	
	private java.lang.String typeName;
    /**
     * typeDescription       db_column: type_description 
     */	
	private java.lang.String typeDescription;
    /**
     * createTime       db_column: create_time 
     */	
	private java.util.Date createTime;
    /**
     * ownerId       db_column: owner_id 
     */	
	private java.lang.Long ownerId;
	//columns END

	public TypeDefine(){
	}

	public TypeDefine(
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
	public java.lang.Long getId() {
		return this.id;
	}
	 /**
     * typeName
     * @param typeName typeName
     */
	public void setTypeName(java.lang.String typeName) {
		this.typeName = typeName;
	}
	  /**
     * typeName
     * @return typeName
     */
	public java.lang.String getTypeName() {
		return this.typeName;
	}
	 /**
     * typeDescription
     * @param typeDescription typeDescription
     */
	public void setTypeDescription(java.lang.String typeDescription) {
		this.typeDescription = typeDescription;
	}
	  /**
     * typeDescription
     * @return typeDescription
     */
	public java.lang.String getTypeDescription() {
		return this.typeDescription;
	}
	    /**
	     * createTime
	     * @return createTime
	     */
	public String getCreateTimeString() {
		//return DateConvertUtils.format(getCreateTime(), FORMAT_CREATE_TIME);
		return  DateUtils.format(DateUtils.format2,getCreateTime());
	}
	 /**
     * createTime
     * @param createTime createTime
     */
	public void setCreateTimeString(String createTime) {
		setCreateTime(DateUtils.parse(createTime,DateUtils.format2,java.util.Date.class));
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

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TypeDefine == false) return false;
		if(this == obj) return true;
		TypeDefine other = (TypeDefine)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

