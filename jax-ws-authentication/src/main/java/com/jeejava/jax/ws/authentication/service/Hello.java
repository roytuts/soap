package com.jeejava.jax.ws.authentication.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Hello {

	@WebMethod
	public String sayHello(String name);

}
