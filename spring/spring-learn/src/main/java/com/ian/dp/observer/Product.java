package com.ian.dp.observer;

import java.util.Observable;

public class Product extends Observable{

	private String name;
	private double price;
	
	public Product(){
		
	}
	
	public Product(String name, double price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers(name);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		setChanged();
		notifyObservers(price);
	}
	
	
}