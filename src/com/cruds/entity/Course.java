package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name="course_id")
	private long Id;
	
	@Column
	private String name;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course( String name) {
		super();
		this.name = name;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + "]";
	}
	
	

}
