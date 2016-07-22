package com.ian.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer{

	public void update(Observable o, Object arg) {
		if (arg instanceof Double) {			
			System.out.println("价格观察者：" + o + "物品价格已经更改为：" + arg);
		}
	}

}
