package com.ian.learn.spring.learn.spel;


import java.util.ArrayList;
import java.util.List;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class EsplTest {

	public static void main(String[] args) {
		
		ExpressionParser parser = new SpelExpressionParser();
		
		EvaluationContext ctx = new StandardEvaluationContext();
		
		System.out.println(parser.parseExpression("'HelloWorld'.substring(2,5)")
				.getValue());
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("struts");
		list.add("spring");
		list.add("hibernate");
		
		ctx.setVariable("myList", list);
		System.out.println(parser.parseExpression("#myList.subList(1,3)").getValue(ctx));
		
		
	}
}
