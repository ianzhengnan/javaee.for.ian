package com.ian.hib.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {

	private Integer id;
	private String name;
	private int age;
	
	private Set<MyEvent> myEvents = new HashSet<>();
	private Set<String> emails = new HashSet<>();
	
	public Person() {
		
	}
	
	public Person(Integer id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<MyEvent> getMyEvents() {
		return myEvents;
	}

	public void setMyEvents(Set<MyEvent> myEvents) {
		this.myEvents = myEvents;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}
	
	
}
