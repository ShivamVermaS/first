package com.CourseFile.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Courses")
public class Courses {

	@Id
	long id ;
	String name;


	public Courses(long id, String name,String last_name, String Course, double Fee) {
		super();
		this.id = id;
		this.name = name;
		this.last_name=last_name;
		this.Course=Course;
		this.Fee=Fee;
	}
	
	String last_name;
	String Course;
	double Fee;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getFee() {
		return Fee;
	}
	public void setFee(double fee) {
		Fee = fee;
	}
	
		@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", last_name=" + last_name + ", Course=" + Course
				+ ", Fee=" + Fee + "]";
	}
	
}

