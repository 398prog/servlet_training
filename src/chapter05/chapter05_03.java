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
@WebServlet("/chapter05_03")
public class chapter05_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();


		String age= request.getParameter("age");
		int age_i = 0;

		out.println("<html>");

		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Chapter05_01</title>");
		out.println("</head>");

		out.println("<body>");

		out.println("<h2>Chapter05_02</h2>");
		out.print("<p>");

		try {
			age_i = Integer.parseInt(age);

			if(age_i >= 20) {
				out.println("お酒・タバコの購入が可能です。</p>");
			}else if(age_i < 20){
				out.println("お酒・タバコは購入できません。</p>");
			}

		}catch(NumberFormatException e){
			out.println("エラー：数値を入力してください。</p>");
		}




		out.println("</body>");

		out.println("</html>");
	}

}
