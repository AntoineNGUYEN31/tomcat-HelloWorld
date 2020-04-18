//package demotest;
 
import java.io.IOException;
//import java.util.Base64;

import org.apache.commons.codec.binary.Base64;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class guru_register
 */
@WebServlet("/encode")
public class encode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      String input1 = String.valueOf(request.getParameter("input1"));
      byte[] message = input1.getBytes();
      String res1=Base64.encodeBase64String(message);

      request.setAttribute("res1", res1); 
      request.setAttribute("preinput1", input1);

      request.getRequestDispatcher("index.jsp").forward(request, response); // Redisplay JSP.
    }
}
