package fr.formation.inti.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;
import java.util.List;
import fr.formation.inti.entities.Employee;
import fr.formation.inti.service.EmployeeService;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	EmployeeService service=new EmployeeService();
	private static final long serialVersionUID = 1L;
	private static final Log log= LogFactory.getLog(EmployeeServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Employee> list=service.findAll();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello World</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Liste des employés</h1>");
		out.println("<table>");
		for(Employee e : list) {
			out.println("<tr>");
			out.println("<td>"+e.getEmpId());
			out.println("</td>");
			out.println("<td>"+e.getFirstName());
			out.println("</td>");
			out.println("<td>"+e.getLastName());
			out.println("</td>");
			out.println("<td>"+e.getStartDate());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("<a href=\"ajout.html\" >Ajouter un employee</a>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		List<Employee> list=service.findAll();
//		response.setContentType("text/html");
		String prenom=request.getParameter("prenom");
		String nom=request.getParameter("nom");	
		String dateDebut = request.getParameter("DateDebut");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = format.parse(dateDebut);
        } catch (ParseException e1) {
            e1.printStackTrace();
        }
        Employee emp=new Employee();
        emp.setFirstName(prenom);
        emp.setLastName(nom);
        emp.setStartDate(date);
        Integer id =service.save(emp);
        if (id !=null) {
        	doGet(request, response);
        }
        
        
	}

}
