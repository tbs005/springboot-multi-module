package com.cvssp.selectednumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.cvssp.selectednumber.service.ServiceConfiguration;

@SpringBootApplication
@Import(ServiceConfiguration.class)
public class SelectednumberAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelectednumberAdminApplication.class, args);
	}
}
