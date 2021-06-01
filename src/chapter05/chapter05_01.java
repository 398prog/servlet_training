package chapter05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chapter05_01
 */
@WebServlet("/chapter05_01")
public class chapter05_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String name= request.getParameter("name");
		String comment = request.getParameter("comment");


		out.println("<html>");

		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Chapter05_01</title>");
		out.println("</head>");

		out.println("<body>");

		out.println("<h2>Chapter05_01</h2>");

		out.println(name + "さんは、" + comment + "と言いました。");

		out.println("</body>");

		out.println("</html>");
	}

}
