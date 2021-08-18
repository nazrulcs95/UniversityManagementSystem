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
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="present_address",length = 200)
	private String presentAddress;
	@Column(name="present_dvission",length = 40)
	private String presentDivission;
	@Column(name="present_district",length = 40)
	private String presentDistrict;
	@Column(name="present_police_station",length = 40)
	private String presentPoliceStation;
	@Column(name="present_postal_code",length = 20)
	private String presentPoastalCode;
	@Column(name="permanent_address",length = 200)
	private String permanentAddress;
	@Column(name="permanent_divission",length = 40)
	private String permanentDivission;
	@Column(name="permanent_district",length = 40)
	private String permanentDistrict;
	@Column(name="permanent_polic_station",length = 500)
	private String permanentPoliceStation;
	@Column(name="permanent_postal_code",length = 20)
	private String permanentPoastalCode;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_info_id")
	private  UserInfo userInfo;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String presentAddress, String presentDivission, String presentDistrict,
			String presentPoliceStation, String presentPoastalCode, String permanentAddress, String permanentDivission,
			String permanentDistrict, String permanentPoliceStation, String permanentPoastalCode) {
		super();
		this.presentAddress = presentAddress;
		this.presentDivission = presentDivission;
		this.presentDistrict = presentDistrict;
		this.presentPoliceStation = presentPoliceStation;
		this.presentPoastalCode = presentPoastalCode;
		this.permanentAddress = permanentAddress;
		this.permanentDivission = permanentDivission;
		this.permanentDistrict = permanentDistrict;
		this.permanentPoliceStation = permanentPoliceStation;
		this.permanentPoastalCode = permanentPoastalCode;
	}

	public long getId() {
		return id;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPresentDivission() {
		return presentDivission;
	}

	public void setPresentDivission(String presentDivission) {
		this.presentDivission = presentDivission;
	}

	public String getPresentDistrict() {
		return presentDistrict;
	}

	public void setPresentDistrict(String presentDistrict) {
		this.presentDistrict = presentDistrict;
	}

	public String getPresentPoliceStation() {
		return presentPoliceStation;
	}

	public void setPresentPoliceStation(String presentPoliceStation) {
		this.presentPoliceStation = presentPoliceStation;
	}

	public String getPresentPoastalCode() {
		return presentPoastalCode;
	}

	public void setPresentPoastalCode(String presentPoastalCode) {
		this.presentPoastalCode = presentPoastalCode;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPermanentDivission() {
		return permanentDivission;
	}

	public void setPermanentDivission(String permanentDivission) {
		this.permanentDivission = permanentDivission;
	}

	public String getPermanentDistrict() {
		return permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentPoliceStation() {
		return permanentPoliceStation;
	}

	public void setPermanentPoliceStation(String permanentPoliceStation) {
		this.permanentPoliceStation = permanentPoliceStation;
	}

	public String getPermanentPoastalCode() {
		return permanentPoastalCode;
	}

	public void setPermanentPoastalCode(String permanentPoastalCode) {
		this.permanentPoastalCode = permanentPoastalCode;
	}

	public UserInfo getUser() {
		return userInfo;
	}

	public void setUser(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
