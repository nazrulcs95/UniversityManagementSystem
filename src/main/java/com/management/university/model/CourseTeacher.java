package com.management.university.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course_teacher")
public class CourseTeacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long course_teacher_id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
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
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "courseTeacher",cascade = CascadeType.REMOVE)
	private List<TeacherAttendence> teacherAttendenceList;

	public CourseTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseTeacher(Teacher teacher, Course course, Section section, Semester semester) {
		super();
		this.teacher = teacher;
		this.course = course;
		this.section = section;
		this.semester = semester;
	}

	public long getId() {
		return course_teacher_id;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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

	public List<TeacherAttendence> getTeacherAttendenceList() {
		return teacherAttendenceList;
	}

	public void setTeacherAttendenceList(List<TeacherAttendence> teacherAttendenceList) {
		this.teacherAttendenceList = teacherAttendenceList;
	}
	
}
