package com.roytuts.spring.boot.soap.producer.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.roytuts.spring.boot.soap.producer.repository.UserRepository;

import https.roytuts_com.userservice.GetUserDetailsRequest;
import https.roytuts_com.userservice.GetUserDetailsResponse;

@Endpoint
public class UserServiceEndpoint {
	private final String NAMESPACE = "https://roytuts.com/UserService";
	@Autowired
	private UserRepository userRepository;

	@PayloadRoot(namespace = NAMESPACE, localPart = "getUserDetailsRequest")
	@ResponsePayload
	public GetUserDetailsResponse getUser(@RequestPayload final GetUserDetailsRequest request) {
		GetUserDetailsResponse response = new GetUserDetailsResponse();
		response.getUsers().addAll(userRepository.getUsers(request.getName()));
		return response;
	}
}