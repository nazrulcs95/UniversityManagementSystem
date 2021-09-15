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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "student_id", nullable = false, length = 100)
	private String studentId;
	@Column(name = "addmission_date")
	private Date addmissionDate;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "student")
	private Parent parent;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "student")
	private CompleteResult completeResult;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "student")
	private List<CourseRegistration> courseRegistrationsList;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="department_id")
	private Department department;

	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(
	        name = "student_degree", 
	        joinColumns = { @JoinColumn(name = "student_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "degree_id") }
	    )
	private List<Degree> degreeList;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentId, Date addmissionDate) {
		super();
		this.studentId = studentId;
		this.addmissionDate = addmissionDate;
	}

	public long getId() {
		return id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
