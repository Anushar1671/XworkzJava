package com.xworkz.product.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/contact", loadOnStartup = 1)
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("Running ContactServlet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String comment = req.getParameter("comment");

		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.setAttribute("mobile", mobile);
		req.setAttribute("comment", comment);

		RequestDispatcher dispatcher = req.getRequestDispatcher("ContactSuccess.jsp");
		dispatcher.forward(req, resp);
	}
}
