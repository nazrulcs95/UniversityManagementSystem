package com.management.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.university.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
