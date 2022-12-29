package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student_demo")
public class StudentDemo {

	@Id
	private int rollno;

	@Column(nullable=false)
	private String name;


	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDemo(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentDemo [rollno=" + rollno + ", name=" + name + "]";
	}


}



