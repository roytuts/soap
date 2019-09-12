package com.roytuts.jax.ws.service.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.roytuts.jax.ws.service.Hello;

public class HelloConsumer {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8888/jax-ws/hello?wsdl");

		QName qname = new QName("http://impl.service.ws.jax.roytuts.com/", "HelloImplService");

		Service service = Service.create(url, qname);

		Hello hello = service.getPort(Hello.class);

		System.out.println(hello.sayHello("Soumitra"));
	}

}
