package com.xworkz.player.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/info",loadOnStartup = 2)
public class PlayerResource extends HttpServlet {
	public PlayerResource() {
		System.out.println("Creating PlayerResource..");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in PlayerService..");
		String name=req.getParameter("playerName");
		String sports=req.getParameter("sport");
		String place=req.getParameter("place");
		String exp=req.getParameter("experience");
		System.out.println(name);
		System.out.println(sports);
		System.out.println(place);
		System.out.println(exp);
		
		System.out.println("URL :"+req.getRequestURL());
	    System.out.println("Method :"+req.getMethod());
	    System.out.println("User agent"+req.getHeader("User-agent"));
		
	    resp.setContentType("Text/Plain");
	    PrintWriter writer=resp.getWriter();
	    writer.print(name +"," +sports +","+ place +","+ exp +" is saved successfully");
	    

	}

}
