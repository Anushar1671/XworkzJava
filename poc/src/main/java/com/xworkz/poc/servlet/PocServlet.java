package com.xworkz.poc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.poc.servlet.dto.PocDTO;

@WebServlet(urlPatterns = "/login",loadOnStartup = 2)
public class PocServlet extends HttpServlet{
	public PocServlet() {
		System.out.println("Creating PocServlet..");
	}
	
	@Override
	protected void doPost( HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost in PocServlet");
		String userId=req.getParameter("userId");
		String password=req.getParameter("password");
		
		PocDTO dto=new PocDTO(userId, password);		
		req.setAttribute("anusha", dto);
		
		if(userId.equals("admin") &&  password.equals("secret")) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);
			System.out.println(userId);
			System.out.println(password);
		}
		else {
			req.setAttribute("successMsg", "Login credentials not matching");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
	}

}
