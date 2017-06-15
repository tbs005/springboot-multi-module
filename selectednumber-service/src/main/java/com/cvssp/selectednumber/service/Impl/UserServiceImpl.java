package com.cvssp.selectednumber.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cvssp.selectednumber.model.dao.IUserDao;
import com.cvssp.selectednumber.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userDao.count();
	}
}
