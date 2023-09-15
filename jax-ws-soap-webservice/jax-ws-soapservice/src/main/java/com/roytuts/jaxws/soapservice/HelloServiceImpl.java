package com.roytuts.jaxws.soapservice;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl {
	
	public String sayHello() {
		return "Hello";
	}
	
}
