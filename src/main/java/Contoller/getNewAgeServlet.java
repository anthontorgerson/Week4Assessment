package Contoller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AgeConverter;

@WebServlet("/getNewAgeServlet")
public class getNewAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getNewAgeServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userAge = request.getParameter("userAge");
		AgeConverter userAges = new AgeConverter(Integer.parseInt(userAge));

		request.setAttribute("userAgeCalc", userAges);

		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
