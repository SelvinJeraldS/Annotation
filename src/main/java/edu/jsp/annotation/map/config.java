package edu.jsp.annotation.map;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class config {
	
	@Bean
	public Map<String,String> vec (){
		
		Map<String,String> v=new HashMap<String, String>();
		v.put("1", "pradeeep");
		v.put("2", "john");
		v.put("3", "Maari");
		v.put("4", "Karthick");
		return v;
	}

}
