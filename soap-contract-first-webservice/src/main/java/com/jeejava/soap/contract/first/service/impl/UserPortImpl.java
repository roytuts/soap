package com.jeejava.soap.contract.first.service.impl;

import javax.jws.WebService;

import com.jeejava.soap.contract.first.User;
import com.jeejava.soap.contract.first.UserPort;
import com.jeejava.soap.contract.first.data.UserMockData;

@WebService(endpointInterface = "com.jeejava.soap.contract.first.UserPort")
public class UserPortImpl implements UserPort {

	private UserMockData mockData;

	public UserPortImpl(UserMockData mockData) {
		this.mockData = mockData;
	}

	@Override
	public User getUserDetailsRequest(int id) {
		return mockData.getUser(id);
	}

}
