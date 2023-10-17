package com.xworkz.weapon.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send",loadOnStartup = 2)
public class WeaponServlet extends HttpServlet{
	public WeaponServlet() {
		System.out.println("Creating WeaponServlet...");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running service on WeaponServlet");
		String wName=req.getParameter("weaponName");
		String madeBy=req.getParameter("madeBy");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		System.out.println("Weapon name is :"+wName);
		System.out.println("Weapon made by :"+madeBy);
		System.out.println("Weapon price :"+price);
		System.out.println("Weapon type :"+type);
	
		
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<nav class=\"navbar\" style=\"background-color: black; color:white\">\r\n"
				+ "		<h2 >X-workz</h2>\r\n"
				+ "<button  type=\"submit\" style=\"margin-left: 160vh\"><a href=\"index.html\">home</a></button>"
				+ "<button  type=\"submit\"><a href=\"weaponInfo.html\" >weapon</a><br></button>"
				+ "	</nav>\r\n"
				+ "	<h1>Weapon Information.</h1>\r\n"
				+ "	\r\n");
				
				
		writer.print("\n Weapon name is :"+wName);
		writer.print("</br>\n Weapon made by :"+madeBy);
		writer.print("</br>\n Weapon price :"+price);
		writer.print("</br>\n Weapon type :"+type);
				
				writer.print( "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		}

}
