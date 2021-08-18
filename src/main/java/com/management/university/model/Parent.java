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
@Table(name="parent")
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="father_name",length = 50)
	private String fatherName;
	@Column(name="father_conatct_no",length = 30)
	private String fatherConatctNo;
	@Column(name="father_occupation",length = 30)
	private String fatherOccupation;
	@Column(name="father_designation",length = 30)
	private String fatherDesignation;
	@Column(name="father_anual_income")
	private float fatherAnualIncome;
	@Column(name="mother_name",length = 50)
	private String motherName;
	@Column(name="mother_contact_no",length = 30)
	private String motherContactNo;
	@Column(name="mother_occupation",length = 30)
	private String motherOccupation;
	@Column(name="mother_designation",length = 30)
	private String motherDesignation;
	@Column(name="mother_anual_income")
	private float motherAnualIncome;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(String fatherName, String fatherConatctNo, String fatherOccupation, String fatherDesignation,
			float fatherAnualIncome, String motherName, String motherContactNo, String motherOccupation,
			String motherDesignation, float motherAnualIncome) {
		super();
		this.fatherName = fatherName;
		this.fatherConatctNo = fatherConatctNo;
		this.fatherOccupation = fatherOccupation;
		this.fatherDesignation = fatherDesignation;
		this.fatherAnualIncome = fatherAnualIncome;
		this.motherName = motherName;
		this.motherContactNo = motherContactNo;
		this.motherOccupation = motherOccupation;
		this.motherDesignation = motherDesignation;
		this.motherAnualIncome = motherAnualIncome;
	}
	public long getId() {
		return id;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getFatherConatctNo() {
		return fatherConatctNo;
	}
	public void setFatherConatctNo(String fatherConatctNo) {
		this.fatherConatctNo = fatherConatctNo;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getFatherDesignation() {
		return fatherDesignation;
	}
	public void setFatherDesignation(String fatherDesignation) {
		this.fatherDesignation = fatherDesignation;
	}
	public float getFatherAnualIncome() {
		return fatherAnualIncome;
	}
	public void setFatherAnualIncome(float fatherAnualIncome) {
		this.fatherAnualIncome = fatherAnualIncome;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMotherContactNo() {
		return motherContactNo;
	}
	public void setMotherContactNo(String motherContactNo) {
		this.motherContactNo = motherContactNo;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getMotherDesignation() {
		return motherDesignation;
	}
	public void setMotherDesignation(String motherDesignation) {
		this.motherDesignation = motherDesignation;
	}
	public float getMotherAnualIncome() {
		return motherAnualIncome;
	}
	public void setMotherAnualIncome(float motherAnualIncome) {
		this.motherAnualIncome = motherAnualIncome;
	}
	
}
