package com.example.SwiggyProject.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.SwiggyProject.Model.User;
import com.example.SwiggyProject.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registaionDto);
}
