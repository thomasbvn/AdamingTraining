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
 * Servlet implementation class pageConnectionServlet
 */
@WebServlet("/validation")
public class successConnectionServlet extends HttpServlet {
	private static final Log log = LogFactory.getLog(successConnectionServlet.class);
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public successConnectionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.info("Connection success");
		// Afficher un ecran de connection
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> Profil </title> </head/>");
		out.println("<body>");
		out.println("<h1> Connexion confirmée </h1>");
		out.println("<h2> Bonjour, à vous </h2>");
		out.println("Page en cours de fabrication<br>");
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
