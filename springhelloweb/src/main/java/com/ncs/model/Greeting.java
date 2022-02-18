package com.ncs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting {
	private String greeting;
	private String name;
	
	public Greeting() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Greeting(String greeting, String name) {
		super();
		this.greeting = greeting;
		this.name = name;		
		
	}



	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
