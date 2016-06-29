package com.ian.hib.domain;

public class User {

	private Integer id;
	private String name;
	private String nationality;
	
	public User(){}
	
	public User(Integer id, String name, String nationality){
		this.id = id;
		this.name = name;
		this.nationality = nationality;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}
