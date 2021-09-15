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
@Table(name="student_payment_info")
public class StudentPaymentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="date")
	private Date date;
	@Column(name="pay_slip_no")
	private long paySlipNo;
	@Column(name="transaction_id", length = 50)
	private String transactionId;
	@Column(name="is_verified")
	private boolean isVerified;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("id")
    @JoinColumn(name="bank_id")
    private BankInfo bankInfo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PaymentMethod paymentMethod;

	public StudentPaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPaymentInfo(Date date, long paySlipNo, String transactionId, boolean isVerified) {
		super();
		this.date = date;
		this.paySlipNo = paySlipNo;
		this.transactionId = transactionId;
		this.isVerified = isVerified;
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

	public long getPaySlipNo() {
		return paySlipNo;
	}

	public void setPaySlipNo(long paySlipNo) {
		this.paySlipNo = paySlipNo;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
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
	
	
}
