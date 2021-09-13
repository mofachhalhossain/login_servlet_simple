package login_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login_verify extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("user");
		String pass = (String)session.getAttribute("pass");
		
		int passLength = pass.length();
		PrintWriter out = res.getWriter();
		
		if(passLength!=8) {
			out.println("Enter 8 digit password");
		}else {
			out.println("Success");
		}
	}
}
