package com.cruds.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="credentialbean")
public class CredentialBean {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=6,name="userID")
	private Long userID;
	
	@Column(name="password",length=20, nullable = false)
	private String password;
	
	@Column(name="userType",length=15,nullable = false)
	private String userType = "C";   //(admin or customer)
	
	@Column(name="loginStatus",length=1, nullable = false)
	private int loginStatus = 1;   //(1 ,0)
	
	@OneToMany(mappedBy="credentials",cascade = CascadeType.ALL)
	private Set<OrderBean> orders;

	public CredentialBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CredentialBean(Long userID, String password, String userType, int loginStatus) {
		super();
		this.userID = userID;
		this.password = password;
		this.userType = userType;
		this.loginStatus = loginStatus;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
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

	public Set<OrderBean> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderBean> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CredentialBean [userID=" + userID + ", password=" + password + ", userType=" + userType
				+ ", loginStatus=" + loginStatus + ", orders=" + orders + "]";
	}
	
}
