package edu.jsp.annotation.one_to_many;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", name=" + name + ", color=" + color + ", passengers=" + passengers + "]";
	}


	@Value("123")
	private int busNo;
	@Value("Sundra Travels")
	private String name;
	@Value("RGB")
	private String color;
	
	@Autowired
	private List<Passengers> passengers;
	

}
