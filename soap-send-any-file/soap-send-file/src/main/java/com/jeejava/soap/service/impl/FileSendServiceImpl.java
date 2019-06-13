package com.jeejava.soap.service.impl;

import javax.jws.WebService;

import com.jeejava.soap.service.FileSendService;
import com.jeejava.soap.service.util.FileUtils;

@WebService(endpointInterface = "com.jeejava.soap.service.FileSendService")
public class FileSendServiceImpl implements FileSendService {

	@Override
	public String sendFile(byte[] fileContent, String fileName) {
		boolean response = FileUtils.saveFile(fileContent, fileName);

		if (response) {
			return "File successfully received and saved to disk!";
		}

		return "OOPs! some error occurred.";
	}

}
