package com.ian.spring.app.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.ian.spring.app.dao.PersonDao;
import com.ian.spring.app.domain.Person;

public class PersonDaoHibernate extends HibernateDaoSupport implements PersonDao{

	public Person get(Integer id) {		
		
		return getHibernateTemplate().get(Person.class, id);
	}

	public Integer save(Person person) {
		
		return (Integer)getHibernateTemplate().save(person);
	}

	public void update(Person person) {
		
		getHibernateTemplate().update(person);
	}

	public void delete(Integer id) {
		
		getHibernateTemplate().delete(get(id));
	}

	public void delete(Person person) {

		getHibernateTemplate().delete(person);
	}

	public List<Person> findByName(String name) {
		
		return (List<Person>)getHibernateTemplate()
				.find("from Person p where p.name like ?", name);
	}

	public List<Person> findAllPerson() {
		
		return (List<Person>)getHibernateTemplate()
				.find("from Person");
	}

	
}
