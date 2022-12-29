package com.cruds.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Credentials {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="userID")
	private String userID;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Profile profile;

	public Credentials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Credentials(String userID, String password, Profile profile) {
		super();
		this.userID = userID;
		this.password = password;
		this.profile = profile;
	}

	public Credentials(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Credentials [id=" + id + ", userID=" + userID + ", password=" + password + ", profile=" + profile + "]";
	}

}
