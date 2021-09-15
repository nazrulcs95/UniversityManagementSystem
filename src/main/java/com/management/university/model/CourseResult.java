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
@Table(name="Course_result")
public class CourseResult {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="assessment_mark1")
	private float assessmentMark1;
	@Column(name="assessment_mark2")
	private float assessmentMark2;
	@Column(name="assessment_mark3")
	private float assessmentMark3;
	@Column(name="assessment_mark4")
	private float assessmentMark4;
	@Column(name="assessment_mark5")
	private float assessmentMark5;
	@Column(name="assignment_mark1")
	private float assignmentMark1;
	@Column(name="assignment_mark2")
	private float assignmentMark2;
	@Column(name="assignment_mark3")
	private float assignmentMark3;
	@Column(name="mid_term_marks")
	private float midTermMarks;
	@Column(name="final_term_marks")
	private float finalTermMarks;
	@Column(name="gpa")
	private float GPA;
	@Column(name="grade",length = 10)
	private String grade;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="course_reg_id")
	private CourseRegistration courseRegistration;

	public CourseResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseResult(float assessmentMark1, float assessmentMark2, float assessmentMark3, float assessmentMark4,
			float assessmentMark5, float assignmentMark1, float assignmentMark2, float assignmentMark3,
			float midTermMarks, float finalTermMarks, float gPA, String grade) {
		super();
		this.assessmentMark1 = assessmentMark1;
		this.assessmentMark2 = assessmentMark2;
		this.assessmentMark3 = assessmentMark3;
		this.assessmentMark4 = assessmentMark4;
		this.assessmentMark5 = assessmentMark5;
		this.assignmentMark1 = assignmentMark1;
		this.assignmentMark2 = assignmentMark2;
		this.assignmentMark3 = assignmentMark3;
		this.midTermMarks = midTermMarks;
		this.finalTermMarks = finalTermMarks;
		this.GPA = gPA;
		this.grade = grade;
	}

	public long getId() {
		return id;
	}

	public float getAssessmentMark1() {
		return assessmentMark1;
	}

	public void setAssessmentMark1(float assessmentMark1) {
		this.assessmentMark1 = assessmentMark1;
	}

	public float getAssessmentMark2() {
		return assessmentMark2;
	}

	public void setAssessmentMark2(float assessmentMark2) {
		this.assessmentMark2 = assessmentMark2;
	}

	public float getAssessmentMark3() {
		return assessmentMark3;
	}

	public void setAssessmentMark3(float assessmentMark3) {
		this.assessmentMark3 = assessmentMark3;
	}

	public float getAssessmentMark4() {
		return assessmentMark4;
	}

	public void setAssessmentMark4(float assessmentMark4) {
		this.assessmentMark4 = assessmentMark4;
	}

	public float getAssessmentMark5() {
		return assessmentMark5;
	}

	public void setAssessmentMark5(float assessmentMark5) {
		this.assessmentMark5 = assessmentMark5;
	}

	public float getAssignmentMark1() {
		return assignmentMark1;
	}

	public void setAssignmentMark1(float assignmentMark1) {
		this.assignmentMark1 = assignmentMark1;
	}

	public float getAssignmentMark2() {
		return assignmentMark2;
	}

	public void setAssignmentMark2(float assignmentMark2) {
		this.assignmentMark2 = assignmentMark2;
	}

	public float getAssignmentMark3() {
		return assignmentMark3;
	}

	public void setAssignmentMark3(float assignmentMark3) {
		this.assignmentMark3 = assignmentMark3;
	}

	public float getMidTermMarks() {
		return midTermMarks;
	}

	public void setMidTermMarks(float midTermMarks) {
		this.midTermMarks = midTermMarks;
	}

	public float getFinalTermMarks() {
		return finalTermMarks;
	}

	public void setFinalTermMarks(float finalTermMarks) {
		this.finalTermMarks = finalTermMarks;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public CourseRegistration getCourseRegistration() {
		return courseRegistration;
	}

	public void setCourseRegistration(CourseRegistration courseRegistration) {
		this.courseRegistration = courseRegistration;
	}
	
	
}
