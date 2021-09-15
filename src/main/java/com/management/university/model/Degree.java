package com.management.university.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="degree")
public class Degree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",nullable = false, length = 50)
	private String name;
	@Column(name="engaged_date")
	private Date engagedDate;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy ="degreeList")
	private List<Student> studentList;
	
	
	
	public Degree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Degree(String name, Date engagedDate) {
		super();
		this.name = name;
		this.engagedDate = engagedDate;
	}


	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getInclutionDate() {
		return engagedDate;
	}
	public void setInclutionDate(Date inclutionDate) {
		this.engagedDate = inclutionDate;
	}
	public List<Student> getStudent() {
		return studentList;
	}
	public void setStudent(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
}
