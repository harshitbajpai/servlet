package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int k =0;
		k=a+b;
		
		//PrintWriter out=res.getWriter();
		//out.println("your result is : "+k);
		
		res.sendRedirect("sq?k="+k);
		
		
		
	}
}
