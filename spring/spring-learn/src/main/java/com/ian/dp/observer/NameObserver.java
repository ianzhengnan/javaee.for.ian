package com.ian.dp.observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NameObserver implements Observer{

	public void update(Observable o, Object arg){
		
		if (arg instanceof String) {
			
			String name = (String)arg;
			JFrame jf = new JFrame("观察者");
			JLabel label = new JLabel("名称改变为：" + name);
			
			jf.add(label);
			jf.pack();
			jf.setVisible(true);
			System.out.println("名称观察者：" + o + "物品名称已经改变为：" + name);
		}
	}
}
