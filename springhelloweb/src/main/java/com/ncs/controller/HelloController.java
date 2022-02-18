package com.ncs.controller;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.model.Greeting;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello!!!!";
	}
	@GetMapping("/hellouser")
	public String sayHello(@RequestParam String user) {
		
		return "Hello!!!! "+user;
	}
	
	@GetMapping("/hello/{user}")
	public String sayHelloByPath(@PathVariable String user) {
		
		return "Hello!!!! "+user;
	}
	
	@GetMapping("/hellouserage")
	public String sayHello(@RequestParam String user, @RequestParam int age ) {
		
		return "Hello!!!! "+user +"\nAge: "+age;
	}
	
	@GetMapping("/greet")
	public Greeting sayHelloByObject(@RequestParam String user) {
		
		return new Greeting("Good Morning",user);
	}
	
	@PostMapping("/greet")
	public Greeting sayHelloByBody(@RequestBody Greeting greet) {
		
		return greet;
	}
	
	
	@PostMapping("/hello")
    public String sayHelloPost()
    {
        return "Hello POST!!!";
    }
    
    @PutMapping("/hello")
    public String sayHelloPut()
    {
        return "Hello PUT!!!";
    }
    
    @DeleteMapping("/hello")
    public String sayHelloDelete()
    {
        return "Hello DELETE!!!";
    }
    
    @PatchMapping("/hello")
    public String sayHelloPatch()
    {
        return "Hello Patch!!!";
    }

	
}
