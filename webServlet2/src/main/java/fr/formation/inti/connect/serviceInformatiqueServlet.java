package fr.formation.inti.connect;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.thomas.Identifiant;
import fr.formation.inti.thomas.IdentifiantService;

/**
 * Servlet implementation class serviceInformatiqueServlet
 */
@WebServlet("/systeme")
public class serviceInformatiqueServlet extends HttpServlet {
	private static final Log log = LogFactory.getLog(serviceInformatiqueServlet.class);
	private static final long serialVersionUID = 1L;
	IdentifiantService service = new IdentifiantService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serviceInformatiqueServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Identifiant> list = service.findAll();
		log.info("serviceInformatiqueServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head> <title> ajouter Personne </title> </head/>");
		out.println("<body>");
		out.println("<table>");
		out.println("<thead><tr><th scope=\"col\">Identifiant</th>");
		out.println("<th scope=\"col\">FirstName</th>");
		out.println("<th scope=\"col\">LastName</th>");
		out.println("<th scope=\"col\">StartDate</th></tr></thead>");
		for(Identifiant i : list) {// Employee -- emp
			out.println("<tr><td> " + i.getIdIdentifiant() + " </td>");//EmpId
			out.println("<td> " + i.getNomIdentifiant() + " </td>");//FirstName
			out.println("<td> " + i.getNumPortable() + " </td></tr><br>");//LastName
			//il est malsain d'afficher le MDP, même si les admins le connaissent !
		}
		out.println("</table>");
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
