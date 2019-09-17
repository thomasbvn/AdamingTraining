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
 * Servlet implementation class identifiantServlet
 */
@WebServlet("/login")
public class identifiantServlet extends HttpServlet {
	private static final Log log = LogFactory.getLog(identifiantServlet.class);
	private static final long serialVersionUID = 1L;
	EmployeeService service = new EmployeeService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public identifiantServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> list = service.findAll();
		log.info("identifiantServlet");
		request.setAttribute("list", list);
		// Affichage html
		request.getRequestDispatcher("jstl/connectAccess.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
