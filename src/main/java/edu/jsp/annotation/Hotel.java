package edu.jsp.annotation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	@Value("DTB")
	private String name;
	@Value("Dindugal")
    private String loc;
	@Value("123456789")
    private  long phone;
	@Value("Non-Veg")
    private String type;
    
	@Autowired
    private Set<String> dishes;
	
	
	

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLoc() {
		return loc;
	}




	public void setLoc(String loc) {
		this.loc = loc;
	}




	public long getPhone() {
		return phone;
	}




	public void setPhone(long phone) {
		this.phone = phone;
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public Set<String> getDishes() {
		return dishes;
	}




	public void setDishes(Set<String> dishes) {
		this.dishes = dishes;
	}




	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", phone=" + phone + ", type=" + type + ", dishes=" + dishes
				+ "]";
	}

}
