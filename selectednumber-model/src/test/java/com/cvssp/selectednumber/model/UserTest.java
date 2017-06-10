package com.cvssp.selectednumber.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cvssp.selectednumber.model.dao.IUserDao;
import com.cvssp.selectednumber.model.domain.User;


@RunWith(SpringRunner.class)
//@SpringBootTest(classes=SelectednumberModelApplication.class)
@SpringBootTest
public class UserTest {

	@Autowired
	private IUserDao userDao;
	
	@Test
	public void test() {
		User user = new User();
		user.setName("test");
		userDao.save(user);
	}

}
