package com.management.university.model;

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
@Table(name="complete_result")
public class CompleteResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="cgpa")
	private float CGPA;
	@Column(name="grade",length = 10)
	private String grade;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	public CompleteResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CompleteResult(float cGPA, String grade) {
		super();
		CGPA = cGPA;
		this.grade = grade;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getCGPA() {
		return CGPA;
	}
	public void setCGPA(float cGPA) {
		CGPA = cGPA;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
