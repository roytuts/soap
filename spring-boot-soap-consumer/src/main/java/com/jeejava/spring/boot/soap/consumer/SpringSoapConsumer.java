package com.jeejava.spring.boot.soap.consumer;

import https.www_jeejava_com.userservice.GetUserDetailsRequest;
import https.www_jeejava_com.userservice.GetUserDetailsResponse;
import https.www_jeejava_com.userservice.User;
import https.www_jeejava_com.userservice.UserPort;
import https.www_jeejava_com.userservice.UserPortService;

public class SpringSoapConsumer {

	public static void main(String[] args) {
		UserPort userPort = new UserPortService().getUserPortSoap11();
		GetUserDetailsRequest request = new GetUserDetailsRequest();
		request.setName("souvik");
		GetUserDetailsResponse response = userPort.getUserDetails(request);
		for (User user : response.getUsers()) {
			System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", ["
					+ user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", "
					+ user.getAddress().getState() + ", " + user.getAddress().getZip() + ", "
					+ user.getAddress().getCountry() + ", " + user.getAddress().getAddressType() + "]");
		}

		System.out.println(
				"------------------------------------------------------------------------------------------------");

		request.setName("l");
		response = userPort.getUserDetails(request);
		for (User user : response.getUsers()) {
			System.out.println(user.getId() + ", " + user.getName() + ", " + user.getEmail() + ", ["
					+ user.getAddress().getStreet() + ", " + user.getAddress().getCity() + ", "
					+ user.getAddress().getState() + ", " + user.getAddress().getZip() + ", "
					+ user.getAddress().getCountry() + ", " + user.getAddress().getAddressType() + "]");
		}
	}

}
