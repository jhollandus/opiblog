package com.objectpartners.blog.gradle.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.objectpartners.blog.gradle.Greeter;
import com.objectpartners.blog.gradle.Guest;

public class GreeterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Greeter greeter = new Greeter();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		
		if(StringUtils.isNotBlank(name)) {
			Guest guest = new Guest();
			guest.setName(name);
	
			String greeting = greeter.greet(guest);
			
			req.setAttribute("greeting", greeting);
		}
		
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/greet.jspx").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}



}
