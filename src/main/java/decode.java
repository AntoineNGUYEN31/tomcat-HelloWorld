//package demotest;
 
import java.io.IOException;
//import java.util.Base64;

import org.apache.commons.codec.binary.Base64;
//import java.util.Arrays;
 
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
@WebServlet("/decode")
public class decode extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      String input2 = String.valueOf(request.getParameter("input2"));
      byte[] message = Base64.decodeBase64(input2.getBytes());
      String res2=new String(message);

      request.setAttribute("res2", res2);
      request.setAttribute("preinput2", input2);

      request.getRequestDispatcher("index.jsp").forward(request, response); // Redisplay JSP.
    }
}
