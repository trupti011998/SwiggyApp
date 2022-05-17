package com.example.SwiggyProject.ServiceImpl;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.SwiggyProject.Model.Role;
import com.example.SwiggyProject.Model.User;
import com.example.SwiggyProject.Repository.UserRepository;
import com.example.SwiggyProject.Service.UserService;
import com.example.SwiggyProject.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override
	public User save(UserRegistrationDto registrationDto) {
	 User user = new User( registrationDto.getFirstName(),
			                 registrationDto.getLastName(),
			               registrationDto.getEmail(),
			              // registrationDto.getPassword(),
			               passwordEncoder.encode( registrationDto.getPassword()),
			               Arrays.asList(new Role("ROLE_USER")));	
			              

	
	  return userRepository.save(user);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}
		
		//return user object this user object belongs to springSecurity
		//userDetails=interface ,User=class which implements userDetail interface
		//& user object is belongs to springSecurity , provided some data as mail,password
		
		return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),mapRolesToAuthorities(user.getRoles()));
		
		// return new org.springframework.security.core.userdetails.User(user.getEmail(), new BCryptPasswordEncoder().encode(user.getPassword()), getGrantedAuth(user));
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		
		//map role to authorities
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		
		//we have retrived a user object from database using findByEmail()
		//and we have check whether user is null or not if it is null then it will throw usernamenotfounexception
		//if not null then we created user object that is provided by springSecurity
		//and then we have map roles to authorities , so authorities basically springSecurity term
		//& we need to create SimpleGrantedAuthority object 



		
	}

}


