package com.ian.hib.domain;


public class Enrolment {

	private Integer enrolmentId;
	private int year;
	
	private int semester;
	private Student student;
	
	private Course course;
	
	public Enrolment(){}
	
	public Enrolment(Integer enrolmentId, int year, int semester){
		this.enrolmentId = enrolmentId;
		this.year = year;
		this.semester = semester;
	}

	public Integer getEnrolmentId() {
		return enrolmentId;
	}

	public void setEnrolmentId(Integer enrolmentId) {
		this.enrolmentId = enrolmentId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
