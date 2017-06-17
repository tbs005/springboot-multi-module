package com.cvssp.selectednumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.cvssp.selectednumber.service.ServiceConfiguration;

/*@SpringBootApplication(
		scanBasePackages={"classpath*:com.cvssp.selectednumber.*"},
		exclude={  
	    DataSourceAutoConfiguration.class,  
        HibernateJpaAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,  
        })  */
@SpringBootApplication(scanBasePackages={"classpath*:com.cvssp.selectednumber.*"})  
//@Import({DBConfig.class,JpaConfig.class,ServiceConfiguration.class})
//@Import({JpaConfig.class,ServiceConfiguration.class})
@Import({ServiceConfiguration.class})
@ComponentScan
//@EnableAutoConfiguration
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}
