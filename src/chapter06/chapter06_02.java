package chapter06;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Dog;

/**
 * Servlet implementation class chapter06_02
 */
@WebServlet("/chapter06_02")
public class chapter06_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String age = request.getParameter("age");
		int age_i = Integer.parseInt(age);
		String weight = request.getParameter("weight");
		double weight_b = Double.parseDouble(weight);

		Dog dog = new Dog();

		dog.setDogName(name);
		dog.setAge(age_i);
		dog.setWeight(weight_b);

		request.setAttribute("dog",dog);
		request.getRequestDispatcher("/jsp/chapter06_02/result.jsp").forward(request, response);
	}

}
