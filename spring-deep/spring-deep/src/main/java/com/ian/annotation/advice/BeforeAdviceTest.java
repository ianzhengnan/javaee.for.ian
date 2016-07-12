package com.ian.annotation.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAdviceTest {

//	@Before("execution(* com.ian.annotation.impl.*.*(..))")
	public void authority(){
		System.out.println("模拟执行权限检查");
	}
}
