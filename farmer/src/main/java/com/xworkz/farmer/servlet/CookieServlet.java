package com.xworkz.farmer.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies",loadOnStartup = 5)
public class CookieServlet extends HttpServlet{
	public CookieServlet() {
		System.out.println("Creating servlet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random random=new Random();
		Cookie cookie=new Cookie("XWORKZ",String.valueOf(random.nextLong()));
		
		resp.addCookie(cookie);
		resp.sendRedirect("index.html");
	}
	
}
