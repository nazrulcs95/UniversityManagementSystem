package com.management.university.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="section")
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="code",length = 20)
	private String code;
	@Column(name="name",length = 30)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy = "section")
	private List<CourseRegistration> courseRegistrations;
	@OneToMany(fetch=FetchType.LAZY,mappedBy = "section")
	private List<CourseTeacher> CourseTeacher;
	public Section() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Section(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public int getId() {
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
	public List<CourseRegistration> getCourseRegistrations() {
		return courseRegistrations;
	}
	public void setCourseRegistrations(List<CourseRegistration> courseRegistrations) {
		this.courseRegistrations = courseRegistrations;
	}
	public List<CourseTeacher> getCourseTeacher() {
		return CourseTeacher;
	}
	public void setCourseTeacher(List<CourseTeacher> courseTeacher) {
		CourseTeacher = courseTeacher;
	}
	
}
