package edu.jsp.annotation.map;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vechile {
	@Value("YAMAHA")
	private String Company;
	@Value("RX")
	private String Model;
	@Value("150cc")
	private String cc;
	@Value(" Black")
	private String color;
	@Value("150000D")
	private double price;
	
	
	@Autowired
	private Map<String, String> vechileDetails;

	@Override
	public String toString() {
		return "Vechile [Company=" + Company + ", Model=" + Model + ", cc=" + cc + ", color=" + color + ", price="
				+ price + ", vechileDetails=" + vechileDetails + "]";
	}

	
}
