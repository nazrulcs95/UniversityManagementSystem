package com.management.university.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.management.university.utils.StringListConverter;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="code",length = 20)
	private String code;
	@Column(name="name",length = 50)
	private String name;
	@Column(name="credit")
	private float credit;
	@Column(name="contents_file_location",length = 200)
	private String contentsFileLocation;
	
	@Column(name="prerequisite_courses_ids")
	@Convert(converter = StringListConverter.class)
	private List<Long> prerequisiteCoursesIds;
	
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<CourseRegistration> courseRegistrationsList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<CourseTeacher> CourseTeacherList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<Exam> examList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<TeachersRating> teachersRatingsList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<CourseRating> courseRatingList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "course")
	private List<CourseSchedule> courseScheduleList;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String code, String name, float credit, String contentsFileLocation) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
		this.contentsFileLocation = contentsFileLocation;
	}

	public long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String getContents() {
		return contentsFileLocation;
	}

	public void setContents(String contentsFileLocation) {
		this.contentsFileLocation = contentsFileLocation;
	}

	public List<Long> getPrerequisiteCoursesIds() {
		return prerequisiteCoursesIds;
	}

	public void setPrerequisiteCoursesIds(List<Long> prerequisiteCoursesIds) {
		this.prerequisiteCoursesIds = prerequisiteCoursesIds;
	}

	public List<CourseRegistration> getCourseRegistrationsList() {
		return courseRegistrationsList;
	}

	public void setCourseRegistrationsList(List<CourseRegistration> courseRegistrationsList) {
		this.courseRegistrationsList = courseRegistrationsList;
	}

	public List<CourseTeacher> getCourseTeacherList() {
		return CourseTeacherList;
	}

	public void setCourseTeacherList(List<CourseTeacher> courseTeacherList) {
		CourseTeacherList = courseTeacherList;
	}

	public List<Exam> getExamList() {
		return examList;
	}

	public void setExamList(List<Exam> examList) {
		this.examList = examList;
	}

	public List<TeachersRating> getTeachersRatingsList() {
		return teachersRatingsList;
	}

	public void setTeachersRatingsList(List<TeachersRating> teachersRatingsList) {
		this.teachersRatingsList = teachersRatingsList;
	}

	public List<CourseRating> getCourseRatingList() {
		return courseRatingList;
	}

	public void setCourseRatingList(List<CourseRating> courseRatingList) {
		this.courseRatingList = courseRatingList;
	}

	public List<CourseSchedule> getCourseScheduleList() {
		return courseScheduleList;
	}

	public void setCourseScheduleList(List<CourseSchedule> courseScheduleList) {
		this.courseScheduleList = courseScheduleList;
	}
	
}
