package edu.jsp.annotation.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driverClass {
public static void main(String[] args) {
	
	ApplicationContext applicationContext= new AnnotationConfigApplicationContext(config.class);
	Vechile v=applicationContext.getBean("vechile", Vechile.class);
	System.out.println(v);
}
}
