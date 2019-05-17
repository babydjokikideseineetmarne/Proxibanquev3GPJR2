package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.ServiceImpl;
import webservice.WebServiceImpl;

/**
 * Servlet implementation class ServletValidationCreaClient
 */
@WebServlet("/ServletValidationCreaClient")
public class ServletValidationCreaClient extends HttpServlet {
	WebServiceImpl wsi = new WebServiceImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletValidationCreaClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String name= request.getParameter("name");
		String nickname= request.getParameter("nickname");
		String address= request.getParameter("address");
		String postalcode= request.getParameter("postalcode");
		String city= request.getParameter("city");
		String number= request.getParameter("number");
		
		Client c = new Client(name, nickname, address, postalcode, city, number);
		request.setAttribute("client", c);
		wsi.postClient(c);
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/ValidationCreat.jsp");
		requestDispatcher.forward(request, response);
	}

}
