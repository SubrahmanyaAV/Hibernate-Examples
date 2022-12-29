package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {

	@Id
	@GeneratedValue
	@Column(name="phone_id")
	private long phoneId;
	
	@Column(name="phone_type",nullable=false,length=10)
	private String phoneType;
	
	@Column(name="phone_number",nullable=false,length=10)
	private String phoneNumber;

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone( String phoneType, String phoneNumber) {
		super();
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneType=" + phoneType + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
