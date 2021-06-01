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
@WebServlet("/chapter05_02")
public class chapter05_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		String music= request.getParameter("music");


		out.println("<html>");

		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Chapter05_01</title>");
		out.println("</head>");

		out.println("<body>");

		out.println("<h2>Chapter05_02</h2>");
		out.print("<p>好きな音楽:");

		switch(music) {
		case "1":
			out.println("ロック</p>");
			break;

		case "2":
			out.println("ポップス</p>");
			break;

		case "3":
			out.println("ジャズ</p>");
			break;

		case"4":
			out.println("クラシック</p>");
			break;

		case "5":
			out.println("演歌</p>");
			break;
		}

		out.println("</body>");

		out.println("</html>");
	}

}
