package com.roytuts.jaxws.soapclient.app;

import com.roytuts.jaxws.soapclient.HelloServiceImpl;
import com.roytuts.jaxws.soapclient.HelloServiceImplService;

public class HelloClient {

	public static void main(String[] args) {
		HelloServiceImplService helloService = new HelloServiceImplService();
		HelloServiceImpl helloServiceImpl = helloService.getHelloServiceImplPort();
		String response = helloServiceImpl.sayHello();
		
		System.out.println(response);
	}

}
