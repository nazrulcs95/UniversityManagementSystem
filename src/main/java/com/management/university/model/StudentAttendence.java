package com.management.university.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_attendence")
public class StudentAttendence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="isAttend")
	private boolean isAttend;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_reg_id")
	private CourseRegistration courseRegistration;

	public StudentAttendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentAttendence(Date date, boolean isAttend) {
		super();
		this.date = date;
		this.isAttend = isAttend;
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

	public boolean isAttend() {
		return isAttend;
	}

	public void setAttend(boolean isAttend) {
		this.isAttend = isAttend;
	}

	public CourseRegistration getCourseRegistration() {
		return courseRegistration;
	}

	public void setCourseRegistration(CourseRegistration courseRegistration) {
		this.courseRegistration = courseRegistration;
	}
	
}
