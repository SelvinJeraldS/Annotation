package edu.jsp.annotation.one_to_many;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class driverClass {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(config.class);
	Bus b=applicationContext.getBean("bus",Bus.class);
	System.out.println(b);
}
}
