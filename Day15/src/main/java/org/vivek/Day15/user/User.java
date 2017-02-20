package org.vivek.Day15.user;

public class User {
	private int id;
	private String name;
	private int age;
	private String location;

	public User(int id, String name, int age, String location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
