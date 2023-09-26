package edu.jsp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driverclass {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(config.class);
		
		Hotel h= applicationContext.getBean("hotel",Hotel.class);
		System.out.println(h);
	
		h.getName();
		h.getLoc();
		h.getPhone();
		h.getDishes();
	}

}
