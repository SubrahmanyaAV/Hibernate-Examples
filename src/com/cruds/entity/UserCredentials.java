package com.cruds.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="user_credentials")
public class UserCredentials {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(unique=true,length=6,name="userID")
	private String userID;

	@Column(name="password",length=20, nullable = false)
	private String password;

	@ColumnDefault("'C'")
	@Column(name="userType",length=15,nullable = false)
	private String userType = "C";   //(admin or customer)

	@Column(name="loginStatus",length=1, nullable = false)
	private int loginStatus = 1;   //(1 ,0)

	@OneToOne(cascade = CascadeType.ALL)
	private UserProfile profile;

	public UserCredentials() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCredentials(String userID, String password, int loginStatus, UserProfile profile) {
		super();
		this.userID = userID;
		this.password = password;
		this.loginStatus = loginStatus;
		this.profile = profile;
	}

	public UserCredentials(String userID, String password, String userType, int loginStatus, UserProfile profile) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
		this.profile = profile;
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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(int loginStatus) {
		this.loginStatus = loginStatus;
	}

	public UserProfile getProfile() {
		return profile;
	}

	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "UserCredentials [id=" + id + ", userID=" + userID + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + ", profile=" + profile + "]";
	}

}
