package com.management.university.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="teacher_attendence")
public class TeacherAttendence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="date")
	private Date date;
	@Column(name="day", length = 20)
	private String day;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	@MapsId("course_teacher_id")
	@JoinColumn(name="course_teacher_id")
	private CourseTeacher courseTeacher;

	public TeacherAttendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherAttendence(Date date, String day) {
		super();
		this.date = date;
		this.day = day;
	}

	public long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public CourseTeacher getCourseTeacher() {
		return courseTeacher;
	}

	public void setCourseTeacher(CourseTeacher courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	
	
}
