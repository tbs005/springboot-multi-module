package com.cvssp.selectednumber.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends DomainImpl{

	
	@Column(name="name",nullable=true)
	private String name;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
