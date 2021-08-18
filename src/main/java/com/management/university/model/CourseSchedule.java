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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course_schedule")
public class CourseSchedule{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="day",length = 20)
	private String day;
	@Column(name="start_time")
	private LocalTime startTime;
	@Column(name="end_time")
	private LocalTime endTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="course_id")
	private Course course;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "courseRegistration")
	private CourseRegistration courseRegistration;

	public CourseSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseSchedule(Date date, String day, LocalTime startTime, LocalTime endTime) {
		super();
		this.date = date;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
