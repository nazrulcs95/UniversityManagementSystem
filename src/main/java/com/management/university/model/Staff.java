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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "joining_date")
	private Date joiningDate;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE)
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "staff")
	private List<StaffsPayment> staffsPaymentList;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "staff")
	private List<StaffAttendence> staffAttendenceList;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="designation_id")
	private Designation designation;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="department_id")
	private Department department;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(Date joiningDate) {
		super();
		this.joiningDate = joiningDate;
	}

	public long getId() {
		return id;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<StaffsPayment> getStaffsPaymentList() {
		return staffsPaymentList;
	}

	public void setStaffsPaymentList(List<StaffsPayment> staffsPaymentList) {
		this.staffsPaymentList = staffsPaymentList;
	}

	public List<StaffAttendence> getStaffAttendenceList() {
		return staffAttendenceList;
	}

	public void setStaffAttendenceList(List<StaffAttendence> staffAttendenceList) {
		this.staffAttendenceList = staffAttendenceList;
	}
	
	
}
