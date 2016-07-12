package com.ian.annotation.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAdviceTest {

//	@AfterReturning(returning="vrt", pointcut="execution(* com.ian.annotation.impl.*.*(..))")
	public void log(Object vrt){
		System.out.println("获取目标方法的返回值：" + vrt);
		System.out.println("模拟记录日志功能");
	}
}
