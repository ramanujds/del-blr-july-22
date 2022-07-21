package com.del.app.hellospring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.del.app.hellospring.model.Person;
import com.del.app.hellospring.repository.PersonRepository;

@Controller
public class HelloController {
	
	@Autowired
	private PersonRepository repo;

//	@RequestMapping("/hello")
//	public String sayHello(HttpServletRequest request) {
//		String username = request.getParameter("username");
//		int age= Integer.parseInt(request.getParameter("age"));
//		request.setAttribute("uname", username);
//		request.setAttribute("age", age);
//		System.out.println("Hello Guys..");
//		return "welcome.jsp";
//	}
	
//	@RequestMapping("/hello")
//	public String sayHello(@RequestParam("username") String username, 
//								@RequestParam("age") int age,
//								Model m) {
//		m.addAttribute("uname",username);
//		m.addAttribute("age",age);
//		System.out.println("Hello Guys..");
//		return "welcome.jsp";
//	}
	
	
//	@RequestMapping("/hello")
//	public String sayHello(@RequestParam("personName") String personName, 
//								@RequestParam("age") int age,
//								@RequestParam("email") String email,
//								Model m) {
//		
//		Person person = new Person(personName, email, age);
//		System.out.println(person);
//		m.addAttribute("person",person);
//		return "welcome.jsp";
//	}
	
//	@RequestMapping(method = RequestMethod.POST, path = "/add-person")
	
	@PostMapping("/add-person")
	public String addPerson(@ModelAttribute("person") Person person) {
		repo.addPerson(person);
		return "show-person.jsp";
	}
	
	@GetMapping("/search-person")
	public String searchPerson(@RequestParam("personName") String personName, Model m) {
		Person person = repo.searchPerson(personName);
		m.addAttribute("person",person);
		return "show-person.jsp";
		
	}
	
	@GetMapping("/bye")
	public String sayBye() {
		System.out.println("Bye Guys..");
		return "show.jsp";
	}
	
	@RequestMapping
	public String showHomePage() {
		return "index.jsp";
	}
	@GetMapping("/show-all")
	public String showAllPersons(Model m) {
		
		List<Person> personList = repo.getAllPerson();
		m.addAttribute("list",personList);
		
		
		return "show-all.jsp";
	}
	
	
}
