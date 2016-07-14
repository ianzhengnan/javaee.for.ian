package com.ian.spring.app.jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.ian.spring.app.jpa.dao.PersonDao;
import com.ian.spring.app.jpa.domain.Person;

public class PersonDaoJpa implements PersonDao{

	private EntityManagerFactory emf = null;
	
	private EntityManager em = null;
	
	public void setEmf(EntityManagerFactory emf){
		this.emf = emf;
	}
	
	public void setEm(EntityManager em){
		if (this.em == null) {
			this.em =  this.emf.createEntityManager();
		}
	}
	
	public EntityManager getEm(){
		if (this.em == null) {
			this.em = this.emf.createEntityManager();
			return this.em;
		}else{
			return this.em;
		}
	}
	
	public Person get(Integer id) {

		return getEm().find(Person.class, id);
	}

	public Integer save(Person person) {
		
		getEm().persist(person);
		return person.getId();
	}

	public void update(Person person) {
		
		getEm().merge(person);
	}

	public void delete(Integer id) {
		
		getEm().remove(get(id));
	}

	public void delete(Person person) {
		
		getEm().remove(person);
	}

	public List<Person> findByName(String name) {
		
		return (List<Person>)getEm().createQuery("select obj from Person obj where obj.name = ?")
				.setParameter("name", name)
				.getResultList();
	}

	public List<Person> findAllPerson() {
		
		return (List<Person>)getEm().createQuery("select obj from Person obj")
				.getResultList();
	}

}
