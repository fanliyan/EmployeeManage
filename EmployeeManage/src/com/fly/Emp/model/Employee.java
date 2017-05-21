package com.fly.Emp.model;

import java.sql.Timestamp;

public class Employee {

	private Integer id;
	private String name;
	private Integer age;
	private double wage;
	private Timestamp inductionTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public Timestamp getInductionTime() {
		return inductionTime;
	}
	public void setInductionTime(Timestamp inductionTime) {
		this.inductionTime = inductionTime;
	}
	
	
	
}
