package com.cvssp.selectednumber.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cvssp.selectednumber.model.JpaConfig;
import com.cvssp.selectednumber.service.Impl.GeneratorServiceImpl;
import com.cvssp.selectednumber.service.Impl.UserServiceImpl;

@Configuration
@Import(JpaConfig.class)
//@ComponentScan(value = "com.cvssp.selectednumber.*")
public class ServiceConfiguration {

	@Bean
	public GeneratorService generatorService(){
		return new GeneratorServiceImpl();
	}
	
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
