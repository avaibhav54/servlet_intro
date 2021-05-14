import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class generic_method_2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("servicing generic servlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>heelllllllllooooooooooooo you are inside generic servlet</h1>");
	}

	
}
