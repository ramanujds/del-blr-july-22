package com.del.app.hellospring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.del.app.hellospring.model.Person;

@Repository
public class PersonRepository implements InitializingBean {

	List<Person> personList;
	

	public void afterPropertiesSet() throws Exception {
		personList = new ArrayList<>();
	}
	
	public Person addPerson(Person person) {
		personList.add(person);
		return person;
	}
	
	public Person searchPerson(String personName) {
		Person person = personList.stream()
									.filter(p->p.getPersonName().equals(personName))
									.findFirst()
									.orElse(null);
		return person;
	}
	
	public List<Person> getAllPerson(){
		return personList;
	}
	
}
