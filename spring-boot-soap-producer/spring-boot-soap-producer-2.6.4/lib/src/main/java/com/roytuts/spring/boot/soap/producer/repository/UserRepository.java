package com.roytuts.spring.boot.soap.producer.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import https.roytuts_com.userservice.Address;
import https.roytuts_com.userservice.AddressType;
import https.roytuts_com.userservice.User;

@Component
public class UserRepository {
	private List<User> users = new ArrayList<User>();

	public UserRepository() {
		User u1 = new User();
		u1.setId(1);
		u1.setName("Sumit Ghosh");
		u1.setEmail("sumit.ghosh@email.com");

		Address a1 = new Address();
		a1.setStreet("Garfa");
		a1.setCity("Kolkata");
		a1.setState("WB");
		a1.setCountry("India");
		a1.setZip(700030);
		a1.setAddressType(AddressType.COMMUNICATION);
		u1.setAddress(a1);

		User u2 = new User();
		u2.setId(2);
		u2.setName("Loku Poddar");
		u2.setEmail("debabrata.poddar@email.com");

		Address a2 = new Address();
		a2.setStreet("Birati");
		a2.setCity("Kolkata");
		a2.setState("WB");
		a2.setCountry("India");
		a2.setZip(700130);
		a2.setAddressType(AddressType.COMMUNICATION);
		u2.setAddress(a2);

		User u3 = new User();
		u3.setId(3);
		u3.setName("Souvik Sanyal");
		u3.setEmail("souvik.sanyal@email.com");

		Address a3 = new Address();
		a3.setStreet("Kalighat");
		a3.setCity("Kolkata");
		a3.setState("WB");
		a3.setCountry("India");
		a3.setZip(700150);
		a3.setAddressType(AddressType.COMMUNICATION);
		u3.setAddress(a3);

		User u4 = new User();
		u4.setId(4);
		u4.setName("Liton Sarkar");
		u4.setEmail("liton.sarkar@email.com");

		Address a4 = new Address();
		a4.setStreet("Sukanta Nagar");
		a4.setCity("Kolkata");
		a4.setState("WB");
		a4.setCountry("India");
		a4.setZip(700098);
		a4.setAddressType(AddressType.COMMUNICATION);
		u4.setAddress(a4);

		User u5 = new User();
		u5.setId(5);
		u5.setName("Rushikesh Mukund Fanse");
		u5.setEmail("rushikesh.fanse@email.com");

		Address a5 = new Address();
		a5.setStreet("Nasik");
		a5.setCity("Mumbai");
		a5.setState("MH");
		a5.setCountry("India");
		a5.setZip(400091);
		a5.setAddressType(AddressType.COMMUNICATION);
		u5.setAddress(a5);

		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
	}

	public List<User> getUsers(String name) {
		List<User> userList = new ArrayList<>();
		for (User user : users) {
			if (user.getName().toLowerCase().contains(name.toLowerCase())) {
				userList.add(user);
			}
		}
		return userList;
	}
}