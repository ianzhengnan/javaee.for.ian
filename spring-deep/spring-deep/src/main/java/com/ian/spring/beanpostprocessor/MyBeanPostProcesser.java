package com.ian.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.ian.spring.impl.Chinese;

public class MyBeanPostProcesser implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强处理....");
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean后处理器在初始化之后对" + beanName + "进行增强处理....");
		
		if (bean instanceof Chinese) {
			Chinese chinese = (Chinese)bean;
			chinese.setName("Struts2权威指南");
		}
		
		return bean;
	}

	
}
