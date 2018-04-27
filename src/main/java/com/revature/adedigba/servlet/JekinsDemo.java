package com.revature.adedigba.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class JekinsDemo extends HttpServlet{

	private static final long serialVersionUID = 1L;

	  private String message = "Michael first deployed application on AWS";

	   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	   }

	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   PrintWriter out = response.getWriter();
		   out.write("it seems like it is working");
	   }
	   
}
