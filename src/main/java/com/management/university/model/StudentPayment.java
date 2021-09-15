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
@Table(name="student_payment")
public class StudentPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="semester_fee")
	private double semsterFee;
	@Column(name="fee_per_credit")
	private double feePerCredit;
	@Column(name="course_fee")
	private double courseFee;
	@Column(name="others")
	private double others;
	@Column(name="total_fees")
	private double totalFees;
	@Column(name="total_due")
	private double totalDue;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "studentPayment")
	private List<CourseRegistration> courseRegistrations;

	public StudentPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPayment(Date date, double semsterFee, double feePerCredit, double courseFee, double others,
			double totalFees, double totalDue) {
		super();
		this.date = date;
		this.semsterFee = semsterFee;
		this.feePerCredit = feePerCredit;
		this.courseFee = courseFee;
		this.others = others;
		this.totalFees = totalFees;
		this.totalDue = totalDue;
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

	public double getSemsterFee() {
		return semsterFee;
	}

	public void setSemsterFee(double semsterFee) {
		this.semsterFee = semsterFee;
	}

	public double getFeePerCredit() {
		return feePerCredit;
	}

	public void setFeePerCredit(double feePerCredit) {
		this.feePerCredit = feePerCredit;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	public double getOthers() {
		return others;
	}

	public void setOthers(double others) {
		this.others = others;
	}

	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

	public double getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(double totalDue) {
		this.totalDue = totalDue;
	}

	public List<CourseRegistration> getCourseRegistrations() {
		return courseRegistrations;
	}

	public void setCourseRegistrations(List<CourseRegistration> courseRegistrations) {
		this.courseRegistrations = courseRegistrations;
	}
	
	
	
}
