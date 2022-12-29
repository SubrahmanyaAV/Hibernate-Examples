package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name="pid")
public class Owner extends Person {
	
	@Column
	private Long stocks;
	
	@Column
	private Long stakes;
	
	public Owner() {}

	public Owner(String fname, String lname, Long stocks, Long stakes) {
		super(fname,lname);
		this.stocks = stocks;
		this.stakes = stakes;
	}
	
	

}
