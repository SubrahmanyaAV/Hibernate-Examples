package com.cruds.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderBean {
	
	@Id
	@GeneratedValue
	@Column(length=6,name="orderID")
	private Long orderID;			
	                 
/*	@Column(name="orderDate",nullable = false)
	private String orderDateO;
*/	
	@Column(name="totalPrice",nullable = false)
	private double totalPrice;
	
	@Column(name="orderStatus",length=15)
	private String oStatus;
	
	@Column(name="street",length=50, nullable = false)
	private String oStreet;
	
	@Column(name="city",length=15, nullable = false)
	private String oCity;
	
	@Column(name="state",length=15, nullable = false)
	private String oState;
	
	@Column(name="pincode",length=10)
	private String pincodeO;
	
	@Column(name="mobileNo",length=10, nullable = false)
	private String mobileNum;
	
	@ManyToOne
	@JoinColumn(name="userID")
	private CredentialBean credentials;

	public OrderBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderBean( double totalPrice, String oStatus, String oStreet, String oCity,
			String oState, String pincodeO, String mobileNum) {
		super();
		this.totalPrice = totalPrice;
		this.oStatus = oStatus;
		this.oStreet = oStreet;
		this.oCity = oCity;
		this.oState = oState;
		this.pincodeO = pincodeO;
		this.mobileNum = mobileNum;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getoStatus() {
		return oStatus;
	}

	public void setoStatus(String oStatus) {
		this.oStatus = oStatus;
	}

	public String getoStreet() {
		return oStreet;
	}

	public void setoStreet(String oStreet) {
		this.oStreet = oStreet;
	}

	public String getoCity() {
		return oCity;
	}

	public void setoCity(String oCity) {
		this.oCity = oCity;
	}

	public String getoState() {
		return oState;
	}

	public void setoState(String oState) {
		this.oState = oState;
	}

	public String getPincodeO() {
		return pincodeO;
	}

	public void setPincodeO(String pincodeO) {
		this.pincodeO = pincodeO;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public CredentialBean getCredentials() {
		return credentials;
	}

	public void setCredentials(CredentialBean credentials) {
		this.credentials = credentials;
	}

	@Override
	public String toString() {
		return "OrderBean [orderID=" + orderID + ", orderDateO="  + ", totalPrice=" + totalPrice
				+ ", oStatus=" + oStatus + ", oStreet=" + oStreet + ", oCity=" + oCity + ", oState=" + oState
				+ ", pincodeO=" + pincodeO + ", mobileNum=" + mobileNum + ", credentials=" + credentials + "]";
	}
	
}
