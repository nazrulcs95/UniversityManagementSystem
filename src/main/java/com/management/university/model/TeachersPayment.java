package com.management.university.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teachers_payment")
public class TeachersPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="no_of_lectures")
	private int noOfLectures;
	@Column(name="amount_per_lecture")
	private double amountPerLecture;
	@Column(name="no_of_exam_coordinated")
	private int noOfExamCoordinated;
	@Column(name="amount_per_exam")
	private double amountPerExam;
	@Column(name="no_of_exam_paper_review")
	private int noOfExamPaperReiewed;
	@Column(name="amount_per_paper")
	private double amountPerPaper;
	@Column(name="total_amount")
	private double totalAmount;
	@Column(name="month", length = 20)
	private String month;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private EmployeePaymentInfo teacherPaymentInfo;

	public TeachersPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeachersPayment(int noOfLectures, double amountPerLecture, int noOfExamCoordinated, double amountPerExam,
			int noOfExamPaperReiewed, double amountPerPaper, double totalAmount, String month) {
		super();
		this.noOfLectures = noOfLectures;
		this.amountPerLecture = amountPerLecture;
		this.noOfExamCoordinated = noOfExamCoordinated;
		this.amountPerExam = amountPerExam;
		this.noOfExamPaperReiewed = noOfExamPaperReiewed;
		this.amountPerPaper = amountPerPaper;
		this.totalAmount = totalAmount;
		this.month = month;
	}

	public long getId() {
		return id;
	}

	public int getNoOfLectures() {
		return noOfLectures;
	}

	public void setNoOfLectures(int noOfLectures) {
		this.noOfLectures = noOfLectures;
	}

	public double getAmountPerLecture() {
		return amountPerLecture;
	}

	public void setAmountPerLecture(double amountPerLecture) {
		this.amountPerLecture = amountPerLecture;
	}

	public int getNoOfExamCoordinated() {
		return noOfExamCoordinated;
	}

	public void setNoOfExamCoordinated(int noOfExamCoordinated) {
		this.noOfExamCoordinated = noOfExamCoordinated;
	}

	public double getAmountPerExam() {
		return amountPerExam;
	}

	public void setAmountPerExam(double amountPerExam) {
		this.amountPerExam = amountPerExam;
	}

	public int getNoOfExamPaperReiewed() {
		return noOfExamPaperReiewed;
	}

	public void setNoOfExamPaperReiewed(int noOfExamPaperReiewed) {
		this.noOfExamPaperReiewed = noOfExamPaperReiewed;
	}

	public double getAmountPerPaper() {
		return amountPerPaper;
	}

	public void setAmountPerPaper(double amountPerPaper) {
		this.amountPerPaper = amountPerPaper;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public EmployeePaymentInfo getTeacherPaymentInfo() {
		return teacherPaymentInfo;
	}

	public void setTeacherPaymentInfo(EmployeePaymentInfo teacherPaymentInfo) {
		this.teacherPaymentInfo = teacherPaymentInfo;
	}
	
}
