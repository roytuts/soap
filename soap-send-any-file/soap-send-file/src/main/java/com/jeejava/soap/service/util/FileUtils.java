package com.jeejava.soap.service.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class FileUtils {

	private FileUtils() {
	}

	public static boolean saveFile(byte[] fileContent, String fileName) {
		OutputStream outputStream = null;

		try {
			File file = new File("C:/workspace" + File.separator + fileName);
			outputStream = new FileOutputStream(file);
			outputStream.write(fileContent);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return false;
	}

}
