package com.example.SwiggyProject.SecurityConfiguration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		super.configure(auth);
		}
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
		          .antMatchers("/partyHost").hasRole("Host")
		          .antMatchers("/partyGuest").hasRole("Guest")
		          .antMatchers("/").permitAll()
		          .and().formLogin();
	}
}
