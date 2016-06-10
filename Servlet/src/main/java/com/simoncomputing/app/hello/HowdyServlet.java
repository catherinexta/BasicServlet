package com.simoncomputing.app.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HowdyServlet
 */
@WebServlet("/HowdyServlet")
public class HowdyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) 
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        
        writer.println("<html>");
        writer.println("<head></head>");
        writer.println("<body>");
        writer.println("<h1>Howdy!</h1>");
        writer.println("</body>");
        writer.println("</html>");
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}