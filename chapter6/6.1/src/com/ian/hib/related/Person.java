package com.ian.hib.related;

import java.util.Set;
import java.util.HashSet;

public class Person{

	private Integer id;
	private String name;
	private int age;

	private Set<Address> addresses = new HashSet<Address>();

	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public Set<Address> getAddresses(){
		return addresses;
	}
	public void setAddresses(Set<Address> addresses){
		this.addresses = addresses;
	}
}