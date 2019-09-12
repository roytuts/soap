package com.roytuts.jax.ws.service.impl;

import javax.jws.WebService;

import com.roytuts.jax.ws.service.Hello;

@WebService(endpointInterface = "com.roytuts.jax.ws.service.Hello")
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
