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
@Table(name="staff_payment")
public class StaffsPayment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="working_hour")
	private int workingHour;
	@Column(name="hourly_rate")
	private int hourlyRate;
	@Column(name="over_time")
	private int overTime;
	@Column(name="overtime_hourly_rate")
	private int overtimeHourlyRate;
	@Column(name="total_leave")
	private int noOfLeave;
	@Column(name="total_paid_leave")
	private int noOfPaidLeave;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="staff_id")
	private Staff staff;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
	private EmployeePaymentInfo StaffPaymentInfo;

	public StaffsPayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StaffsPayment(int workingHour, int hourlyRate, int overTime, int overtimeHourlyRate, int noOfLeave,
			int noOfPaidLeave) {
		super();
		this.workingHour = workingHour;
		this.hourlyRate = hourlyRate;
		this.overTime = overTime;
		this.overtimeHourlyRate = overtimeHourlyRate;
		this.noOfLeave = noOfLeave;
		this.noOfPaidLeave = noOfPaidLeave;
	}

	public long getId() {
		return id;
	}

	public int getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	public int getOvertimeHourlyRate() {
		return overtimeHourlyRate;
	}

	public void setOvertimeHourlyRate(int overtimeHourlyRate) {
		this.overtimeHourlyRate = overtimeHourlyRate;
	}

	public int getNoOfLeave() {
		return noOfLeave;
	}

	public void setNoOfLeave(int noOfLeave) {
		this.noOfLeave = noOfLeave;
	}

	public int getNoOfPaidLeave() {
		return noOfPaidLeave;
	}

	public void setNoOfPaidLeave(int noOfPaidLeave) {
		this.noOfPaidLeave = noOfPaidLeave;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public EmployeePaymentInfo getStaffPaymentInfo() {
		return StaffPaymentInfo;
	}

	public void setStaffPaymentInfo(EmployeePaymentInfo staffPaymentInfo) {
		StaffPaymentInfo = staffPaymentInfo;
	}
	
	
	
}
