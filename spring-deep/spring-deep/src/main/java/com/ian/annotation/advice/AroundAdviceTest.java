package com.ian.annotation.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAdviceTest {

	@Around("execution(* com.ian.annotation.impl.*.*(..))")
	public Object processTx(ProceedingJoinPoint point) throws Throwable{
		
		System.out.println("执行目标代码之前，模拟执行事务。。。");
		Object rvt = point.proceed(new String[]{"被改变的参数"});
		return rvt + " 新增的返回值";
	}
}
