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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_payment_info")
public class EmployeePaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="account_number",length = 50)
	private String accountNumber;
	@Column(name="card_no",length = 50)
	private String cardNo;
	@Column(name="month",length = 20)
	private String month;
	@Column(name="is_verified")
	private boolean isVerified;
	@Column(name="is_received")
	private boolean isReceived;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
    @JoinColumn(name="bank_id")
    private BankInfo bankInfo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
	@JoinColumn(name="method_id")
	private PaymentMethod paymentMethod;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "StaffPaymentInfo")
	@MapsId("id")
	@JoinColumn(name="staff_pay_id")
	private StaffsPayment staffsPayment;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "teacherPaymentInfo")
	@MapsId("id")
	@JoinColumn(name="teacher_pay_id")
	private TeachersPayment teachersPayment;

	public EmployeePaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePaymentInfo(Date date, String accountNumber, String cardNo, boolean isVerified, boolean isReceived) {
		super();
		this.date = date;
		this.accountNumber = accountNumber;
		this.cardNo = cardNo;
		this.isVerified = isVerified;
		this.isReceived = isReceived;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public boolean isReceived() {
		return isReceived;
	}

	public void setReceived(boolean isReceived) {
		this.isReceived = isReceived;
	}

	public BankInfo getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public StaffsPayment getStaffsPayment() {
		return staffsPayment;
	}

	public void setStaffsPayment(StaffsPayment staffsPayment) {
		this.staffsPayment = staffsPayment;
	}

	public TeachersPayment getTeachersPayment() {
		return teachersPayment;
	}

	public void setTeachersPayment(TeachersPayment teachersPayment) {
		this.teachersPayment = teachersPayment;
	}
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
}
