package com.ian.spring.app.jpa.dao;

import java.util.List;

import com.ian.spring.app.jpa.domain.Person;

public interface PersonDao {
	
	Person get(Integer id);
	
	Integer save(Person person);
	
	void update(Person person);
	
	void delete(Integer id);
	
	void delete(Person person);
	
	List<Person> findByName(String name);
	
	public List<Person> findAllPerson();
}
