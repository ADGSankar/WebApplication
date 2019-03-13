package com.first_webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	//this method for sending data using get method 
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	 {
//		 PrintWriter out= response.getWriter();
////		 out.println("<html>\n<head>\n<title>Yahooo</title>\n</head>\n<body>\n<p>Welcome to Web Servlet</p>\n</body>\n</html>");
//		 out.println("<html>");
//		 out.println("<head>");
//		 out.println("<title>Yahoooo</title>");
//		 out.println("</head>");
//		 out.println("<body>");
//		 out.println("<p>Welcome to web servlet</p>");
//		 out.println("</body>");
//		 out.println("</html>");
//		 
//		 System.out.println(request.getParameter("name"));
		 
		 Date date=new Date();
		 request.setAttribute("pname", request.getParameter("name"));
		 request.setAttribute("password", request.getParameter("password"));
		 request.setAttribute("date", date);
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 
		 
	 }
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	 {
//		 
		 Date date=new Date();
		 String name = request.getParameter("name");
		 String password = request.getParameter("password");
		 
		 UserValidationService service = new UserValidationService();
		 boolean isUserValid=service.isUserValid(name, password);
		 if(isUserValid)
		 {
			 request.setAttribute("pname", name);
			 request.setAttribute("password", password);
			 request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		 }
		 else
		 {
			 request.setAttribute("errorMsg", "Invalid Credentials");
			 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		 }
		 
	 }
	

}
