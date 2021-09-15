package com.management.university.model;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course_registration")
public class CourseRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="student_id")
	private Student student;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="course_id")
	private Course course;
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="section_id")
	private Section section;
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="semester_id")
	private Semester semester;
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="payment_id")
	private StudentPayment studentPayment;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "courseRegistration")
	private CourseResult courseResult;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "courseRegistration")
	private StudentAttendence studentAttendence;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_schedule_id")
	private CourseSchedule courseSchedule;

	public CourseRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseRegistration(Date date) {
		super();
		this.date = date;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Semester getSemester() {
		return semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public StudentPayment getStudentPayment() {
		return studentPayment;
	}

	public void setStudentPayment(StudentPayment studentPayment) {
		this.studentPayment = studentPayment;
	}

	public CourseResult getCourseResult() {
		return courseResult;
	}

	public void setCourseResult(CourseResult courseResult) {
		this.courseResult = courseResult;
	}

	public StudentAttendence getStudentAttendence() {
		return studentAttendence;
	}

	public void setStudentAttendence(StudentAttendence studentAttendence) {
		this.studentAttendence = studentAttendence;
	}

	public CourseSchedule getCourseSchedule() {
		return courseSchedule;
	}

	public void setCourseSchedule(CourseSchedule courseSchedule) {
		this.courseSchedule = courseSchedule;
	}
	
	
}
