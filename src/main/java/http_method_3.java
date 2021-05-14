import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class http_method_3 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("servicing http servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>heelllllllllooooooooooooo you are inside http servlet</h1>");
	}

}
