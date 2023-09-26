package edu.jsp.annotation.one_to_many;

public class Passengers {

	private String name;
	private String gender;
	private int age;
	private String from;
	private String to;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Passengers [name=" + name + ", gender=" + gender + ", age=" + age + ", from=" + from + ", to=" + to
				+ "]";
	}
	

}
