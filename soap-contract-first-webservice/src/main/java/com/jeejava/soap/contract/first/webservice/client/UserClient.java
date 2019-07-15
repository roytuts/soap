package com.jeejava.soap.contract.first.webservice.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.jeejava.soap.contract.first.User;
import com.jeejava.soap.contract.first.UserPort;

public class UserClient {
	public static void main(String[] args) {
		final String endpointAddress = "http://localhost:8080/soap-contract-first-webservice/services/user";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(UserPort.class); // the SEI
		factory.setAddress(endpointAddress);
		UserPort port = (UserPort) factory.create();
		User user = port.getUserDetailsRequest(2);
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getAddress().getAddressType());
		System.out.println(user.getAddress().getStreet());
		System.out.println(user.getAddress().getCity());
		System.out.println(user.getAddress().getState());
		System.out.println(user.getAddress().getCountry());
		System.out.println(user.getAddress().getZip());
	}

}
