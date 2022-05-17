package com.example.SwiggyProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SwiggyProject.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {

	//retrieve user object by email address
	User findByEmail(String email);
}
