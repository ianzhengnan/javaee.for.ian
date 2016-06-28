package com.ian.hib.related;


public class Address{

	private String addressId;
	private String addressDetail;
	private Person person;

	public Address(){}

	public Address(String addressDetail){
		this.addressDetail = addressDetail;
	}

	public void setAddressId(String addressId){
		this.addressId = addressId;
	}
	public String getAddressId(){
		return addressId;
	}

	public void setAddressDetail(String addressDetail){
		this.addressDetail = addressDetail;
	}
	public String getAddressDetail(){
		return addressDetail;
	}

	public void setPerson(Person person){
		this.person = person;
	}
	public Person getPerson(){
		return person;
	}

}