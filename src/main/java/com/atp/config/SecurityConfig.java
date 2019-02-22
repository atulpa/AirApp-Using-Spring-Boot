/*package com.atp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
       
	//  set role to uri like for whom user or admin
	   http.csrf().disable().authorizeRequests().antMatchers("/api/get/**").hasAnyRole("admin","user").and().formLogin();
	   http.csrf().disable().authorizeRequests().antMatchers("/api/admin/**").hasAnyRole("admin").and().formLogin();
	
// set username and password
	   
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("a").password("{noop}a").roles("user");// username and password for user 
		auth.inMemoryAuthentication().withUser("b").password("{noop}b").roles("user","admin");//username and password for admin
		
		
		
		
	}

}
*/