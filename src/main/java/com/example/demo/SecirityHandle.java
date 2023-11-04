package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecirityHandle  extends WebSecurityConfigurerAdapter{

	@Bean
	@Override
	protected UserDetailsService userDetailsService() 
	{
		List<UserDetails> users=new ArrayList();
		
	    users.add(User.withDefaultPasswordEncoder().username("ram").password("123").roles("USER").build());
	    users.add(User.withDefaultPasswordEncoder().username("sham").password("123").roles("USER").build());

	    return new InMemoryUserDetailsManager(users);
	}
}