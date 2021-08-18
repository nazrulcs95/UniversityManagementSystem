package com.management.university.model;

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
@Table(name="designation")
public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",length = 50)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "designation")
	private List<Teacher> teacherList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "designation")
	private List<Staff> staffList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "designation")
	private List<AdminStaff> adminStaffList;
	
	public Designation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Designation(String name) {
		super();
		this.name = name;
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
	
}
