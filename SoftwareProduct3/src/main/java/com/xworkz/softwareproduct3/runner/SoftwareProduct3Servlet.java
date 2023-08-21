package com.xworkz.softwareproduct3.runner;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.softwareproduct3.dto.SoftwareProduct3DTO;
import com.xworkz.softwareproduct3.service.SoftwareProduct3Service;
import com.xworkz.softwareproduct3.service.SoftwareProduct3ServiceImpl;

@WebServlet(urlPatterns="/click")
public class SoftwareProduct3Servlet extends HttpServlet{
	
	public SoftwareProduct3Servlet() {
		System.out.println("SoftwareProduct3Servlet constructor");
		}
	
	SoftwareProduct3DTO dto3 = new SoftwareProduct3DTO();
	SoftwareProduct3Service service3 = new SoftwareProduct3ServiceImpl();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	String userName = req.getParameter("userName");
	String email = req.getParameter("email");
	String softwareName = req.getParameter("softwareName");
	String version = req.getParameter("version");
	
		try {
			service3.validateAndSave(dto3);
		} catch (SQLException e) {
		
			e.printStackTrace();
		
		dto3.setUserName(userName);
		System.out.println(userName);
		
		dto3.setEmail(email);
	System.out.println(email);
		
		dto3.setSoftwareName(softwareName);
		System.out.println(softwareName);
		
		dto3.setVersion(version);
		System.out.println(version);
		
		
	req.setAttribute("dto3", dto3);
	
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, res);
	
		try {
			service3.validateAndSave(dto3);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	
	}
}







