package com.management.university.model;

import java.time.LocalTime;
import java.util.Date;

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
@Table(name="exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="start_time")
	private LocalTime startTime;
	@Column(name="end_time")
	private LocalTime endTime;
	@Column(name="category",length = 50)
	private String Category;
	@Column(name="quetion_papper",length = 50)
	private String quetionPapper;
	@Column(name="answer_sheet",length = 50)
	private String answerSheet;
	@Column(name="type",length = 50)
	private String type;
	@Column(name="total_marks")
	private double totalMarks;
	@Column(name="pass_marks")
	private double passMarrks;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="course_id")
	private Course course;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="semester_id")
	private Semester semester;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(Date date, LocalTime startTime, LocalTime endTime, String category, String quetionPapper,
			String answerSheet, String type, double totalMarks, double passMarrks) {
		super();
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		Category = category;
		this.quetionPapper = quetionPapper;
		this.answerSheet = answerSheet;
		this.type = type;
		this.totalMarks = totalMarks;
		this.passMarrks = passMarrks;
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

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getQuetionPapper() {
		return quetionPapper;
	}

	public void setQuetionPapper(String quetionPapper) {
		this.quetionPapper = quetionPapper;
	}

	public String getAnswerSheet() {
		return answerSheet;
	}

	public void setAnswerSheet(String answerSheet) {
		this.answerSheet = answerSheet;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public double getPassMarrks() {
		return passMarrks;
	}

	public void setPassMarrks(double passMarrks) {
		this.passMarrks = passMarrks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}
	
}
