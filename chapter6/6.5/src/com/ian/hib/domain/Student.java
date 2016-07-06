package com.ian.hib.domain;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private Integer studentNumber;
	private String name;
	private Set<Enrolment> enrolments = new HashSet<>();
	
	public Student(){}
	
	public Student(Integer studentNumber, String name){
		this.studentNumber = studentNumber;
		this.name = name;
	}

	public Integer getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(Integer studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Enrolment> getEnrolments() {
		return enrolments;
	}

	public void setEnrolments(Set<Enrolment> enrolments) {
		this.enrolments = enrolments;
	}
	
	
}
