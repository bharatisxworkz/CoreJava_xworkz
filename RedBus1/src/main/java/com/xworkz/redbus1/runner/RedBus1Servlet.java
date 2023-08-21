package com.xworkz.redbus1.runner;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.redbus1.dto.RedBus1DTO;
import com.xworkz.redbus1.service.RedBus1Service;
import com.xworkz.redbus1.service.RedBus1ServiceImpl;

@WebServlet(urlPatterns="/click")
public class RedBus1Servlet extends HttpServlet{
	public RedBus1Servlet() {
		System.out.println("RedBus1 Constructor");
	}
	//@Override
	public void init() {
		dto = new RedBus1DTO();
		service = new RedBus1ServiceImpl();
	}	
	
	RedBus1DTO dto;
	
	RedBus1Service service;
	
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String busName=req.getParameter("busName");
		String sourcePoint=req.getParameter("sourcePoint");
		String destination=req.getParameter("destination");
		
	
		dto.setId(id);
		System.out.println(id);
		
		dto.setBusName(busName);
		System.out.println(busName);
		
		dto.setSourcePoint(sourcePoint);
		System.out.println(sourcePoint);
		
		dto.setDestination(destination);
		System.out.println(destination);
		
req.setAttribute("dto", dto);
	
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, res);
		
			try {
				service.validateAndSave(dto);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}

}
