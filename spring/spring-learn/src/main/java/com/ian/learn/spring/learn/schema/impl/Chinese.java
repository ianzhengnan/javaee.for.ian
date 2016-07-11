package com.ian.learn.spring.learn.schema.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ian.learn.spring.learn.schema.Axe;
import com.ian.learn.spring.learn.schema.Person;

public class Chinese implements Person{

	private Axe axe;
	private int age;
	private List schools;
	private Map scores;
	private Set axes;
	
	public Chinese(){
		
	}
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List getSchools() {
		return schools;
	}

	public void setSchools(List schools) {
		this.schools = schools;
	}

	public Map getScores() {
		return scores;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	public Set getAxes() {
		return axes;
	}

	public void setAxes(Set axes) {
		this.axes = axes;
	}

	public void useAxe(){
		System.out.println(axe.chop());
		System.out.println("age属性值：" + age);
		System.out.println(schools);
		System.out.println(scores);
		System.out.println(axes);
	}
}
