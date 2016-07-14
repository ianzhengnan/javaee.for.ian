package com.ian.spring.app.jpa.service.impl;

import com.ian.spring.app.jpa.dao.PersonDao;
import com.ian.spring.app.jpa.domain.Person;
import com.ian.spring.app.jpa.service.AuthService;

public class RegistServiceImpl implements AuthService{

	private PersonDao personDao;
	
	public void setPersonDao(PersonDao personDao){
		this.personDao = personDao;
	}
	
	public boolean regist(Person person) {
		
		int result = personDao.save(person);
		if (result > 0) {
			return true;
		}
		return false;
	}
}
