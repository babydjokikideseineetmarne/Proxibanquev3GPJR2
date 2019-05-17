package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conseiller;

/**
 * Servlet implementation class ServletLoginConseiller
 */
@WebServlet("/ServletLoginConseiller")
public class ServletLoginConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLoginConseiller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		Conseiller co = new Conseiller();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher requestDispatcher;
		if ("login".equalsIgnoreCase(login) && "password".equals(password)) {
			requestDispatcher = request.getRequestDispatcher("/WEB-INF/listeClients.jsp");
		} else {
			requestDispatcher = request.getRequestDispatcher("LoginConseiller.html");
		}
		requestDispatcher.forward(request, response);
	}

}
