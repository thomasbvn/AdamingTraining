package fr.formation.inti.connect;

import java.io.IOException;
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

/**
 * Servlet implementation class newInscriptionServlet
 */
@WebServlet("/inscription")
public class newInscriptionServlet extends HttpServlet {
	private static final Log log = LogFactory.getLog(newInscriptionServlet.class);
	private static final long serialVersionUID = 1L;
	EmployeeService service = new EmployeeService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newInscriptionServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> list = service.findAll();
		log.info("newInscriptionServlet");
		request.setAttribute("list", list);
		request.getRequestDispatcher("jstl/newIdentifiant.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        log.info("Recuperation de code");
        String prenom = request.getParameter("firstname"); //name
        String name = request.getParameter("lastname"); //prenom
        String confirme = request.getParameter("confirme");

        if(name == confirme) {
        	Employee emp = new Employee();
            emp.setFirstName(prenom);
            emp.setLastName(name);
        }else {
            
        }
		doGet(request, response);
	}

}
