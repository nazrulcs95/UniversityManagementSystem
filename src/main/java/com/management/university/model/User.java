package com.management.university.model;

import javax.persistence.CascadeType;
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
@Table(name="users")
public class User {

	//Use this if you use hibernate5 and auto generate type under @Id annotation
	/*
	 * @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	 * 
	 * @GenericGenerator(name = "native", strategy = "native")
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "user_role", nullable = false, length = 100)
	private String userRole;
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	@Column(name = "password", nullable = false, length = 50)
	private String password;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
	private UserInfo userInfo;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")
	private ProfilePicture profilePicture;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "user")
	private Student student;
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "user")
	Admin admin = new Admin();
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "user")
	AdminStaff adminStaff = new AdminStaff();
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "user")
	Teacher teacher = new Teacher();
	
	@OneToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST,mappedBy = "user")
	Staff staff = new Staff();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long id, String userRole, String email, String password) {
		super();
		this.id = id;
		this.userRole = userRole;
		this.email = email;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public AdminStaff getAdminStaff() {
		return adminStaff;
	}

	public void setAdminStaff(AdminStaff adminStaff) {
		this.adminStaff = adminStaff;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
}
