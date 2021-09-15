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
import javax.persistence.Table;

@Entity
@Table(name="staff_attendence")
public class StaffAttendence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="staff_id")
	private Staff staff;

	public StaffAttendence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaffAttendence(Date date) {
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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
}
