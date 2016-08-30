package com.ian.jpa.big;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="person_table")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="person_name", length=50)
	private String name;
	
	@Lob
	private byte[] pic;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birth;
	
	public Person(){
		
	}
	
	public Person(int id, String name, byte[] pic, Date birth){
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.birth = birth;
	}

	public Date getBirth(){
		return this.birth;
	}
	
	public void setBirth(Date birth){
		this.birth = birth;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getPic() {
		return pic;
	}

	public void setPic(byte[] pic) {
		this.pic = pic;
	}
	
}
