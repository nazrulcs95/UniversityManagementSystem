package com.management.university.model;

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
@Table(name="course_rating")
public class CourseRating {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="topic",length = 400)
	private String topic;
	@Column(name="rating")
	private int rating;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="course_id")
	private Course course;

	public CourseRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseRating(String topic, int rating) {
		super();
		this.topic = topic;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
