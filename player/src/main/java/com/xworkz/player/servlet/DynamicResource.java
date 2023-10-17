package com.xworkz.player.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/player", loadOnStartup = 1)
public class DynamicResource extends HttpServlet {

	public DynamicResource() {
		System.out.println("Creating DynamicResources");
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Running service in DynamicResource...");
	}

}
