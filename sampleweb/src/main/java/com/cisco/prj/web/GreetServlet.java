package com.cisco.prj.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // MIME ==> image/gif; application/ms-word ; application/pdf
		// need to write to client ==> open stream to client
		PrintWriter out = response.getWriter(); // unicode character set
		// ServletOutputStream out = response.getOutputStream(); // binary data
		out.print("<html><body>");
		out.print("Hello !!!");
		out.print("<br/>");
		out.print("Date : " + new Date());
		out.print("<body></html>");
	}

}
