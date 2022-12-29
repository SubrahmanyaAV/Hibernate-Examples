package com.cruds.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_profile")
public class UserProfile {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="firstName",length=20, nullable = false)
	private String firstName; 

	@Column(name="lastName",length=20, nullable = false)
	private String lastName; 

/*	@Column(name="dateOfBirth", nullable = false)
	private Date dateOfBirth; 
*/
	@Column(name="gender",length=7, nullable = false)
	private String gender;

	@Column(name="street",length=30, nullable = false)
	private String street; 

	@Column(name="location",length=20, nullable = false)
	private String location; 

	@Column(name="city",length=20, nullable = false)
	private String city; 

	@Column(name="state",length=20, nullable = false)
	private String state; 

	@Column(name="pincode",length=10)
	private String pincode; 

	@Column(name="mobileNo",length=10, nullable = false)
	private String mobileNo; 

	@Column(name="emailID",length=30, nullable = false)
	private String emailID;

	public UserProfile(String firstName, String lastName, String gender, String street, String location, String city,
			String state, String pincode, String mobileNo, String emailID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.street = street;
		this.location = location;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobileNo = mobileNo;
		this.emailID = emailID;
	}

	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", street=" + street + ", location=" + location + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", mobileNo=" + mobileNo + ", emailID=" + emailID + "]";
	}

}
