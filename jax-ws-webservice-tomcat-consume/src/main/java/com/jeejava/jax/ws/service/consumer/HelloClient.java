package com.jeejava.jax.ws.service.consumer;

import com.jeejava.jax.ws.service.Hello;
import com.jeejava.jax.ws.service.impl.HelloImplService;

public class HelloClient {

	public static void main(String[] args) throws Exception {
		HelloImplService service = new HelloImplService();
		Hello hello = service.getHelloImplPort();
		System.out.println(hello.sayHello("Soumitra"));
	}

}
