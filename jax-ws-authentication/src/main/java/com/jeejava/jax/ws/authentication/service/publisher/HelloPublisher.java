package com.jeejava.jax.ws.authentication.service.publisher;

import javax.xml.ws.Endpoint;

import com.jeejava.jax.ws.authentication.service.impl.HelloImpl;

public class HelloPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/jax-ws-auth/hello", new HelloImpl());
	}

}
