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
@Table(name="semester")
public class Semester {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",length = 30)
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "semester")
	private List<CourseRegistration> courseRegistrationsList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "semester")
	private List<CourseTeacher> CourseTeacherList;
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "semester")
	private List<Exam> examList;
	public Semester() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semester(String name) {
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
	public List<CourseRegistration> getCourseRegistrationsList() {
		return courseRegistrationsList;
	}
	public void setCourseRegistrationsList(List<CourseRegistration> courseRegistrationsList) {
		this.courseRegistrationsList = courseRegistrationsList;
	}
	public List<CourseTeacher> getCourseTeacherList() {
		return CourseTeacherList;
	}
	public void setCourseTeacherList(List<CourseTeacher> courseTeacherList) {
		CourseTeacherList = courseTeacherList;
	}
	public List<Exam> getExamList() {
		return examList;
	}
	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}
	
}
