/**
 * 
 */
package com.ifli.rapid.services.helper.beans;

import java.util.Date;

/**
 * @author Madhu
 *
 */
public class CustomerFamilyBean {
	
	private int familyMemberId;
	private String memberId;
	private String relationshipId;
	private String relationshipName;
	private String memberName;
	private String isDependant;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;
	private String dateOfBirth;
	private int age;
	private String familyId;
	private int contactId;
	private boolean isActive;
	public String getFamilyId() {
		return familyId;
	}
	public void setFamilyId(String familyId) {
		this.familyId = familyId;
	}
	
	public String getIsDependant() {
		return isDependant;
	}
	public void setIsDependant(String isDependant) {
		this.isDependant = isDependant;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getFamilyMemberId() {
		return familyMemberId;
	}
	public void setFamilyMemberId(int familyMemberId) {
		this.familyMemberId = familyMemberId;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getRelationshipId() {
		return relationshipId;
	}
	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}
	public String getRelationshipName() {
		return relationshipName;
	}
	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}
	public String isDependant() {
		return isDependant;
	}
	public void setDependant(String isDependant) {
		this.isDependant = isDependant;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
