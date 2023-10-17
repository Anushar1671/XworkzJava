package com.xworkz.loan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/loanInfo",loadOnStartup = 2)
public class LoanServlet extends HttpServlet{
	
	public LoanServlet() {
		System.out.println("Creating LoanServlet..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String amount=req.getParameter("amount");
		String working=req.getParameter("working");
		String interest=req.getParameter("interest");
		String surety=req.getParameter("surety");
		String company=req.getParameter("company");
		String tenure=req.getParameter("tenure");
		String type=req.getParameter("type");
		String terms=req.getParameter("terms");
		
		req.setAttribute("name", name);
		req.setAttribute("amount", amount);
		req.setAttribute("working", working);
		req.setAttribute("interest", interest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("tenure", tenure);
		req.setAttribute("type", type);
		req.setAttribute("terms", terms);
		RequestDispatcher dispatch=req.getRequestDispatcher("LoanApplySuccess.jsp");
		dispatch.forward(req, resp);
		
	}
	

}
