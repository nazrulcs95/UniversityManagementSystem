package com.management.university;

import java.text.SimpleDateFormat;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.management.university.model.Gender;
import com.management.university.model.Student;
import com.management.university.model.User;
import com.management.university.model.UserInfo;
import com.management.university.repository.StudentRepository;
import com.management.university.repository.UserInfoRepository;
import com.management.university.repository.UserRepository;

@SpringBootApplication
public class UniversityManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(UniversityManagementSystemApplication.class, args);
	}
	
	/*
	 * private static final Logger log =
	 * LoggerFactory.getLogger(UniversityManagementSystemApplication.class);
	 * 
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Autowired private UserInfoRepository userInfoRepository;
	 * 
	 * @Autowired private StudentRepository studentRepository;
	 * 
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub User user = new User();
	 * user.setUserRole("Student"); user.setEmail("imran@gmail.com");
	 * user.setPassword("khan");
	 * 
	 * UserInfo userInfo = new UserInfo(); userInfo.setFirstName("Imran");
	 * userInfo.setLastName("Khan"); userInfo.setPrimaryEmail("imran@gmail.com");
	 * userInfo.setSecondaryEmail(""); userInfo.setGender(Gender.MALE);
	 * userInfo.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("23/05/1993"));
	 * userInfo.setBloodGroup("B+"); userInfo.setReligion("Islam");
	 * userInfo.setMeritalStatus("Unmaried"); userInfo.setPhoneNo("017147384349");
	 * 
	 * user.setUserInfo(userInfo); userInfo.setUser(user);
	 * 
	 * Student student = new Student(); student.setStudentId("142153704");
	 * 
	 * user.setStudent(student); student.setUser(user);
	 * 
	 * userRepository.save(user); studentRepository.save(student);
	 * 
	 * List<User> findAll = userRepository.findAll(); log.info("ALL USERS: " +
	 * findAll); }
	 */

}
