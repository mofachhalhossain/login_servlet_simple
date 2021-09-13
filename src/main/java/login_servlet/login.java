package login_servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		session.setAttribute("user", user);
		session.setAttribute("pass", pass);
		
		res.sendRedirect("login_verify");
	}
}
