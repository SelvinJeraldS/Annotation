package edu.jsp.annotation;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class config {
	
	@Bean
	public Set <String> dishes(){
		
		Set<String> s=new HashSet<String>();
		s.add("Chicken");
		s.add("Mutton");
		
		return s;
		
	}

}
