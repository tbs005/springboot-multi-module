package com.cvssp.selectednumber.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.cvssp.selectednumber.model.dao.IUserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchDaoTest {

    @SpringBootApplication
    @Import(JpaConfig.class)
    static class TestConfiguration {
    }
    
	@Autowired
	private IUserDao userDao;
	
	@Test
	public void test() {
		userDao.count();
	}


}
