package com.management.university.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="code", length = 20)
	private String code;
	@Column(name="name", length = 50)
	private String name;
	@Column(name="date")
	private Date establishedDate;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "department")
	private List<Teacher> teacherList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "department")
	private List<Student> studentList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "department")
	private List<Staff> staffList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "department")
	private List<AdminStaff> adminStaffList;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String code, String name, Date establishedDate) {
		super();
		this.code = code;
		this.name = name;
		this.establishedDate = establishedDate;
	}
	public long getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getEstablishedDate() {
		return establishedDate;
	}
	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}
}
