package com.del.app.hellospring.model;

public class Person {

	private String personName;
	private String email;
	private int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Person(String personName, String email, int age) {
		super();
		this.personName = personName;
		this.email = email;
		this.age = age;
	}



	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [personName=" + personName + ", email=" + email + ", age=" + age + "]";
	}
	
	
	

	}
