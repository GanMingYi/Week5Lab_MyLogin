package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.*;

/**
 *
 * @author Ming
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String logout = request.getParameter("logout");
        if (logout != null) {
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You were logged out.");
        }
        
        User user = (User)session.getAttribute("user");
        if (user != null) {
            request.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }
        else {
            request.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        AccountService as = new AccountService();
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User newUser = as.login(username, password);
        
        if (newUser == null) {
            request.setAttribute("userInput", username);
            request.setAttribute("passInput", password);
            request.setAttribute("message", "Wrong info");
            request.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else {
            session.setAttribute("user", newUser);
            response.sendRedirect("home");
        }
    }

}
