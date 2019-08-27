package com.jeejava.jax.ws.service.impl;

import javax.jws.WebService;

import com.jeejava.jax.ws.service.Hello;

@WebService(endpointInterface = "com.jeejava.jax.ws.service.Hello")
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
