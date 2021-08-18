package com.management.university.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="payment_method")
public class PaymentMethod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="method",length = 20)
	private String method;
	
	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.REMOVE,mappedBy = "paymentMethod")
	private List<EmployeePaymentInfo> paymentInfoList;

	public PaymentMethod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentMethod(String method) {
		super();
		this.method = method;
	}

	public int getId() {
		return id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public List<EmployeePaymentInfo> getPaymentInfoList() {
		return paymentInfoList;
	}

	public void setPaymentInfoList(List<EmployeePaymentInfo> paymentInfoList) {
		this.paymentInfoList = paymentInfoList;
	}
	
	
}
