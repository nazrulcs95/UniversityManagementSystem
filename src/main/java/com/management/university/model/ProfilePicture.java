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
@Table(name="Profile_picture")
public class ProfilePicture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="profile_pic_id")
	private  User user;
	
	@Column(name="profile_pic_path",length = 150)
	private String imagePath;
	
	public ProfilePicture(String imagePath) {
		super();
		this.imagePath = imagePath;
	}

	public long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	 	
}
