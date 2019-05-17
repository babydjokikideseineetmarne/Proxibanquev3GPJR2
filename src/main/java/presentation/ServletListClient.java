package presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import model.Conseiller;
import service.ServiceImpl;

/**
 * Servlet implementation class ServletListClient
 */
@WebServlet("/ServletListClient")
public class ServletListClient extends HttpServlet {
 ServiceImpl si = new ServiceImpl();
	private static final long serialVersionUID = 1L;
	private List<Client> listeClient = new ArrayList<Client>(); 
	private Conseiller cons= new Conseiller();
	// creation d'une liste client pour tester visibilité
																// avant appel de la methode

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletListClient() {
		super();
		// TODO Auto-generated constructor stub
//
//		Client c0 = new Client(11L, "Leo", "Ackerman", "l'ile du paradis", "l.acker@gmail.com", "02.25");
//		Client c2 = new Client(2L, "Maurice", "Ackerman", "l'ile du paradis", "l.acker@gmail.com", "02.25");
//		Client c3 = new Client(3L, "Paulolina", "Ackerman", "l'ile du paradis", "l.acker@gmail.com", "02.25");
//	//	Client c4 = new Clien
//		listeClient.add(c0);
//		listeClient.add(c2);
//		listeClient.add(c3);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath())
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/listeClients.jsp");
		requestDispatcher.forward(request, response);
		//System.out.println("Voici le client 1" + listeClient);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
	}

}
