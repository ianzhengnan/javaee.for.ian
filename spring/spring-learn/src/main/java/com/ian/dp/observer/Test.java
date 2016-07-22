package com.ian.dp.observer;

public class Test {

	public static void main(String[] args) {
		
		Product product = new Product("电视机", 1800);
		NameObserver nameObserver = new NameObserver();
		PriceObserver priceObserver = new PriceObserver();
		
		product.addObserver(nameObserver);
		product.addObserver(priceObserver);
		
		product.setName("洗衣机");
		product.setPrice(1000);
	}
}
