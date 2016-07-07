package com.ian.learn.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean
	MessageService mockMessageService(){
		
		return new MessageService() {
			
			public String getMessage() {
				// TODO Auto-generated method stub
				return "Hello Ian!";
			}
		};
	}
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		
		printer.pringMessage();
	}
	
}
