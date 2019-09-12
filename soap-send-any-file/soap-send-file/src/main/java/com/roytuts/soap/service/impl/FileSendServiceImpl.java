package com.roytuts.soap.service.impl;

import javax.jws.WebService;

import com.roytuts.soap.service.FileSendService;
import com.roytuts.soap.service.util.FileUtils;

@WebService(endpointInterface = "com.roytuts.soap.service.FileSendService")
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
