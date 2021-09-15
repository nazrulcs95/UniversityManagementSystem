package com.management.university.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name", nullable = false, length = 100)
	private String firstName;
	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;
	@Column(name = "primary_email", nullable = false, length = 100)
	private String primaryEmail;
	@Column(name = "secondary_email", length = 100)
	private String secondaryEmail;
	@Column(name = "phone_no", nullable = false, length = 100)
	private String phoneNo;
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", length = 100)
	private Gender gender;
	@Column(name = "date_of_birth", length = 50)
	private Date dob;
	@Column(name = "religion", length = 100)
	private String religion;
	@Column(name = "merital_status", length = 100)
	private String meritalStatus;
	@Column(name = "blood_group", length = 100)
	private String bloodGroup;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_info_id")
	private  User user;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "userInfo")
	private Address address;

	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(String firstName, String lastName, String primaryEmail, String secondaryEmail, String phoneNo,
			Gender gender, Date dob, String religion, String meritalStatus, String bloodGroup) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.dob = dob;
		this.religion = religion;
		this.meritalStatus = meritalStatus;
		this.bloodGroup = bloodGroup;
	}

	
	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMeritalStatus() {
		return meritalStatus;
	}

	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
