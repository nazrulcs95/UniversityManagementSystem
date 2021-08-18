package com.management.university.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bank_info")
public class BankInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="name",length = 60)
	private String name;
	@Column(name="address",length = 200)
	private String address;
	@Column(name="swift_code",length = 20)
	private String swiftCode;
	@Column(name="branch",length = 40)
	private String branch;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "bankInfo")
	private List<EmployeePaymentInfo> OtherPaymentInfo;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "bankInfo")
	private List<StudentPaymentInfo> studentPaymentInfoList;

	public BankInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankInfo(String name, String address, String swiftCode, String branch) {
		super();
		this.name = name;
		this.address = address;
		this.swiftCode = swiftCode;
		this.branch = branch;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<EmployeePaymentInfo> getOtherPaymentInfo() {
		return OtherPaymentInfo;
	}

	public void setOtherPaymentInfo(List<EmployeePaymentInfo> otherPaymentInfo) {
		OtherPaymentInfo = otherPaymentInfo;
	}

	public List<StudentPaymentInfo> getStudentPaymentInfoList() {
		return studentPaymentInfoList;
	}

	public void setStudentPaymentInfoList(List<StudentPaymentInfo> studentPaymentInfoList) {
		this.studentPaymentInfoList = studentPaymentInfoList;
	}
	
}
