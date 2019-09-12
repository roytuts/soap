package com.roytuts.upload.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.roytuts.soap.stubs.FileSendService;
import com.roytuts.soap.stubs.FileSendServiceImplService;
import com.roytuts.upload.utils.FileUtil;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/Upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UploadServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Part filePart = request.getPart("file");
		String uploadSubmit = request.getParameter("uploadFile");
		String fileName = FileUtil.getFilename(filePart);

		if (uploadSubmit != null && fileName != null && fileName.length() > 0) {
			InputStream inputStream = filePart.getInputStream();
			byte[] fileContent = FileUtil.getFileContent(inputStream);
			FileSendServiceImplService service = new FileSendServiceImplService();
			FileSendService fileSendService = service.getFileSendServiceImplPort();
			String resp = fileSendService.sendFile(fileContent, fileName);
			if (!resp.contains("OOPs")) {
				request.setAttribute("success", resp);
			} else {
				request.setAttribute("error", resp);
			}
		} else {
			String msg = "OOPs! You must select a file to upload.";
			request.setAttribute("error", msg);
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(request, response);

	}
}
