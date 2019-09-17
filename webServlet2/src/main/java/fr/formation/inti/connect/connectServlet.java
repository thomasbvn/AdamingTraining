package fr.formation.inti.connect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Servlet implementation class connectServlet
 */
@WebServlet("/access")
public class connectServlet extends HttpServlet {
	private static final Log log = LogFactory.getLog(connectServlet.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connectServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("Ecran de connection");
		// Afficher un ecran de connection
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> Bienvenue à l'authentification </title> </head/>");
		out.println("<body>");
		out.println("<h1> Ecran de connection </h1>");
		out.println("<h2> Bonjour </h2>");
		out.println("<h2> Veuillez-vous identifier </h2>");
		// Lien vers l'authentification
		out.println("<a href=\"login\"> Je m'identifie </a><br><br>");
		// Lien vers la création d'un nouveau compte
		out.println("<a href=\"inscription\"> Je n'ai pas d'identifiant </a><br><br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
