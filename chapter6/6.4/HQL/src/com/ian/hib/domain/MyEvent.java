package com.ian.hib.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MyEvent {

	private Integer id;
	private String title;
	private Date happenDate;
	private Set<Person> actors = new HashSet<>();
	
	public MyEvent() {
		// TODO Auto-generated constructor stub
	}
	
	public MyEvent(Integer id, String title, Date happenDate){
		this.id = id;
		this.title = title;
		this.happenDate = happenDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getHappenDate() {
		return happenDate;
	}

	public void setHappenDate(Date happenDate) {
		this.happenDate = happenDate;
	}

	public Set<Person> getActors() {
		return actors;
	}

	public void setActors(Set<Person> actors) {
		this.actors = actors;
	}
	
	
}
