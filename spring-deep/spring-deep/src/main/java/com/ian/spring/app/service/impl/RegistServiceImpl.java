package com.ian.spring.app.service.impl;

import com.ian.spring.app.dao.PersonDao;
import com.ian.spring.app.domain.Person;
import com.ian.spring.app.service.AuthService;

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
