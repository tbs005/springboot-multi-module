package com.cvssp.selectednumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.cvssp.selectednumber.model.DBConfig;
import com.cvssp.selectednumber.model.JpaConfig;
import com.cvssp.selectednumber.service.ServiceConfiguration;

@SpringBootApplication(
		scanBasePackages={"classpath*:com.cvssp.selectednumber.*"},
		exclude={  
	    DataSourceAutoConfiguration.class,  
        HibernateJpaAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,  
        })  
//@Import({DBConfig.class,JpaConfig.class,ServiceConfiguration.class})
//@Import({JpaConfig.class,ServiceConfiguration.class})
@Import({ServiceConfiguration.class})
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}
}
