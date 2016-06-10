package simoncomputing.app.sample.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simoncomputing.app.sample.beans.RegisterBean;

@WebServlet( "/ct/register/register" )
public class RegisterController extends HttpServlet {

        private static final long serialVersionUID = 1L;

        /**
         * This function when a GET call is made from the browser - typically called directly
         * using a URL on the browser address bar.
         */
        protected void doGet( HttpServletRequest request, HttpServletResponse response )
                        throws ServletException, IOException {

                RegisterBean register = new RegisterBean();
                register.setLastName( "Kent" );
                register.setFirstName( "Clark" );

                request.setAttribute( "register", register );

                request.getRequestDispatcher( "/index.jsp" ).forward( request, response );

        }

        /**
         * This function is called from a form submit.
         */
        protected void doPost( HttpServletRequest request, HttpServletResponse response )
                        throws ServletException, IOException {
                String action = request.getParameter( "action" );

                if ( "Cancel".equals( action ) ) {
                        response.sendRedirect( request.getContextPath() + "/index.jsp" );
                        return;
                }

                RegisterBean bean = new RegisterBean();

                // reads the form content into the bean.
                bean.bind( request );
                request.setAttribute( "register", bean );

                // validates the bean for any edit errors.  If there are, errors is not null.
                Properties errors = validate( bean );

                // stay on the same page if there are errors...
                if ( errors != null ) {
                        request.setAttribute( "errors", errors );
                        request.getRequestDispatcher( "/WEB-INF/flows/register/register.jsp" ).forward(request, response);

                // Go to next step...
                } else {
                        request.getRequestDispatcher( "/WEB-INF/flows/register/confirm.jsp" ).forward(request, response);
                }

        }

        /**
         * Validates the contents of the form bean.
         *
         * @param bean
         * @return a list of edit errors, each property entry representing the field name and the error message.
         */
        private Properties validate( RegisterBean bean ) {
                Properties errors = new Properties();

                if ( isEmpty( bean.getLastName() ) ) {
                        errors.put( "lastName", "Last name is required." );
                }

                if ( isEmpty( bean.getFirstName() ) ) {
                        errors.put( "firstName", "First name is required." );
                }

                return errors.size() < 1 ? null : errors;
        }

        private static boolean isEmpty( String str ) {
                return str == null || str.isEmpty();
        }

}