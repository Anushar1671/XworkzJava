package com.xworkz.poc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.poc.servlet.dto.PocDTO;

@WebServlet(urlPatterns = "/address",loadOnStartup = 2)
public class AddressServlet extends HttpServlet{
	
	public AddressServlet() {
		System.out.println("Creating Servlet in AddressServlet");
	}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running doPost");
	String userId=req.getParameter("userId");
	String password=req.getParameter("password");
	String street=req.getParameter("street");
	String city=req.getParameter("city");
	String state=req.getParameter("state");
	String country=req.getParameter("country");

	PocDTO dto1=new PocDTO(street, city, state, country);		
	req.setAttribute("anusha", dto1);
	req.setAttribute("addressSuccess","Address Saved Successfully" );
	RequestDispatcher dispatch=req.getRequestDispatcher("Address.jsp");
	dispatch.forward(req, resp);
	
}

}
