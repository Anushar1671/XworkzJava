package com.xworkz.farmer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/save",loadOnStartup = 1)
public class FarmerServlet extends HttpServlet{
	public FarmerServlet() {
		System.out.println("Creating FarmerServelt.....");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service in FarmerServlet..");
		String name=req.getParameter("farmerName");
		String area=req.getParameter("area");
		String soil=req.getParameter("soil");
		String crop=req.getParameter("crop");
		String fertilizer=req.getParameter("fertilizer");
		String season=req.getParameter("season");
		String investment=req.getParameter("investment");
		String profit=req.getParameter("profit");
		String recordNo=req.getParameter("recordNo");
		
		double convertedProfit=Double.parseDouble(profit);
		double convertedInvestment=Double.parseDouble(investment);
		
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
				+ "		<a href=\"Farmer.html\">Farmer</a>\r\n"
				+ "	</nav>\r\n"
				+ "	<h1>Farmer information.</h1>\r\n"
				+ "	\r\n");
		
		writer.print("</br>\n Farmer Name :"+name);
		writer.print("</br>\n Area of land :"+area);
		writer.print("</br>\n Soil type is :"+soil);
		writer.print("</br>\n Crop type is :"+crop);
		writer.print("</br>\n Fertilizer used :"+fertilizer);
		writer.print("</br>\n Season :"+season);
		writer.print("</br>\n Investment :"+investment);
		writer.print("</br>\n Profit :"+profit);
		writer.print("</br>\n Record number :"+recordNo);
		
		if(convertedInvestment<convertedProfit) {
			writer.print("<span style=color:green></br>\nSeason is good</span>");
		}
		else {
			writer.print("<span style=color:red></br>\nSeason is not good");
		}
				writer.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		
		
		
		
	}

}
