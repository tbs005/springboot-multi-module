package com.cvssp.selectednumber.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cvssp.selectednumber.model.domain.User;

public interface IUserDao extends CrudRepository<User, Long>{
	public User findByName(String name);
}
