package com.jeejava.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FileSendService {

	@WebMethod
	String sendFile(byte[] fileContent, String fileName);

}
