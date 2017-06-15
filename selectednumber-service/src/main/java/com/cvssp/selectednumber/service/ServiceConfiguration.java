package com.cvssp.selectednumber.service;

import org.springframework.context.annotation.Configuration;

import com.cvssp.selectednumber.service.Impl.GeneratorServiceImpl;

@Configuration
public class ServiceConfiguration {

	public GeneratorService generatorService(){
		return new GeneratorServiceImpl();
	}
}
