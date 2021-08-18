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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "joining_date", nullable = false)
	private Date joiningDate;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "teacher")
	private List<CourseTeacher> courseTeacherList;

	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "teacher")
	private List<TeachersRating> teachersRatingList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "teacher")
	private List<TeachersPayment> teachersPaymentList;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="designation_id")
	private Designation designation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="department_id")
	private Department department;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Date joiningDate, User user) {
		super();
		this.joiningDate = joiningDate;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CourseTeacher> getCourseTeacherList() {
		return courseTeacherList;
	}

	public void setCourseTeacherList(List<CourseTeacher> courseTeacherList) {
		this.courseTeacherList = courseTeacherList;
	}

	public List<TeachersRating> getTeachersRatingList() {
		return teachersRatingList;
	}

	public void setTeachersRatingList(List<TeachersRating> teachersRatingList) {
		this.teachersRatingList = teachersRatingList;
	}

	public List<TeachersPayment> getTeachersPaymentList() {
		return teachersPaymentList;
	}

	public void setTeachersPaymentList(List<TeachersPayment> teachersPaymentList) {
		this.teachersPaymentList = teachersPaymentList;
	}
	
	
}
