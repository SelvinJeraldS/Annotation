package edu.jsp.annotation.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class config {
	
	@Bean
	public List<Passengers> passengers() {
		List<Passengers> p=new ArrayList<Passengers>();
		Passengers p1=new Passengers();
		p1.setName("Gopi");
		p1.setAge(35);
		p1.setGender("Male");
		p1.setFrom("Chennai");
		p1.setTo("Pondi");
		
		Passengers p2=new Passengers();
		p2.setName("Sudhakar");
		p2.setAge(35);
		p2.setGender("Male");
		p2.setFrom("Chennai");
		p2.setTo("Pondi");
		
		Passengers p3=new Passengers();
		p3.setName("Selvam");
		p3.setAge(35);
		p3.setGender("Male");
		p3.setFrom("Chennai");
		p3.setTo("Pondi");
		
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		return p;
	}

}
