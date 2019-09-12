package com.roytuts.jax.ws.service.consumer;

import com.roytuts.jax.ws.service.Hello;
import com.roytuts.jax.ws.service.impl.HelloImplService;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		HelloImplService service = new HelloImplService();
		Hello hello = service.getHelloImplPort();
		System.out.println(hello.sayHello("Soumitra"));
	}

}
