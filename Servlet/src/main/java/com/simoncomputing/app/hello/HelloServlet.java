package com.simoncomputing.app.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HelloServlet
 */
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet( HttpServletRequest request, HttpServletResponse response ) 
        throws ServletException, IOException {
    	PrintWriter writer = response.getWriter();
    	
    	writer.println("<html>");
    	writer.println("<head></head>");
    	writer.println("<h1>Hello World from HelloServlet!</h1>");
    	writer.println("</body>");
    	writer.println("</html>");

    }


    protected void doPost( HttpServletRequest request, HttpServletResponse response ) 
        throws ServletException, IOException {

    }

}