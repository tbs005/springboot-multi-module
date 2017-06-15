package com.cvssp.selectednumber.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.cvssp.selectednumber.model.JpaConfig;

/**
 * Created by wgq on 2017/6/14.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorNumberTest {


    @Autowired
    GeneratorService generatorService;
    
    @Autowired
    UserService userService;
    
    
    @SpringBootApplication
    @Import(ServiceConfiguration.class)
    static class TestConfiguration {
    }

    @Test
    public void synchronizedBatchCountToGenerator() {

//        String dnseg = "183";
//        boolean exist =   generatorService.isExistNumber(dnseg);
//        boolean sysnsuccess = generatorService.syschronBatchCount(dnseg);
    	
    	userService.count();
    }
}



