package com.workz.police.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/station",loadOnStartup = 2)
public class PoliceStation extends HttpServlet{
	public PoliceStation() {
		System.out.println("Creating PoliceStation...");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in PoliceStation");
		String sName=req.getParameter("stationName");
		String location=req.getParameter("location");
		String inspector=req.getParameter("Inspector");
		String siname=req.getParameter("siname");
		String hConstable=req.getParameter("hConstable");
		String aCommissioner=req.getParameter("aCommissioner");
		String noOfCells=req.getParameter("noOfCells");
		String pcases=req.getParameter("pcases");
		String painted=req.getParameter("painted");
		
		System.out.println(" Station Name :"+sName);
		System.out.println("Location :"+location);
		System.out.println("Inspector name :"+inspector);
		System.out.println("SI name :"+siname);
		System.out.println("Head constable :"+hConstable);
		System.out.println("Assistant commissioner :"+aCommissioner);
		System.out.println("No of cells :"+noOfCells);
		System.out.println("Pending cases :"+pcases);
		System.out.println("Painted :"+painted);
		int convertedCellNo=Integer.parseInt(noOfCells);
		int convertedPCases=Integer.parseInt(pcases);
		boolean convertPainted=Boolean.parseBoolean(painted);
		
		resp.setContentType("Text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar\" style=\"background-color: #e3f2fd;\">\r\n"
				+ "		<h2>X-workz</h2>\r\n"
				+ "		<a href=\"index.html\">Home</a><br>\r\n"
				+ "		<a href=\"policeStation.html\">Police Station</a>\r\n"
				+ "	</nav>\r\n"
				+ "	<h1>Police Station information.</h1>\r\n"
				+ "	\r\n");
				
		writer.print("\n Station Name :"+sName);
		writer.print("</br>\n Location :"+location);
		writer.print("</br>\n Inspector name :"+inspector);
		writer.print("</br>\n SI name :"+siname);
		writer.print("</br>\n Head constable :"+hConstable);
		writer.print("</br>\n Assistant commissioner :"+aCommissioner);
		writer.print("</br>\n No of cells :"+noOfCells);
		writer.print("</br>\n Pending cases :"+pcases);
		writer.print("</br>\n Painted :"+painted);
				
		if(convertedPCases>100) {
			writer.print("<span style=color:red></br>\n Too many cases pending</span>");
		}
		else {
			writer.print("<span style=color:green></br>\n less cases pending");
		}
		
		if(convertedCellNo>5) {
			writer.print("<span style=color:green></br>\n Big station</span>");
		}
		else {
			writer.print("<span style=color:red></br>\n Small station");
		}
		
		if(convertPainted==true) {
			writer.print("<span style=color:green></br>\n Clean</span>");
		}
		else {
			writer.print("<span style=color:red></br>\n Dirty");
		}
				writer.print( "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		
	}

}
