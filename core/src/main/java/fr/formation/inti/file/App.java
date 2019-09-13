package fr.formation.inti.file;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.formation.inti.entities.Departement;
import fr.formation.inti.entities.Employee;

public class App {
public static void main(String[] args) {
		
		
		// creation d'employee		
		Employee employe1 = new Employee();
		employe1.setFirs_name("Michael");
		employe1.setLast_name("Smith");
	
		Employee employe2 = new Employee();
		employe2.setFirs_name("Susan");
		employe2.setLast_name("Barker");
		Employee employe3 = new Employee();
		employe3.setFirs_name("Robert");
		employe3.setLast_name("Taylor");
		
		// definition manager
		
		Set<Employee> listEmployee = new HashSet();
		
		listEmployee.add(employe2);
		listEmployee.add(employe3);
		employe1.setEmployees(listEmployee);
		employe2.setManager(employe1);
		employe3.setManager(employe1);
		
		System.out.println(employe2.getManager().getFirs_name());
		
		// creation departement
		
		Departement d = new Departement();
		d.setDept_id(3);
		d.setName("Administration");
		List<Employee> list2 = new ArrayList();
		list2.add(employe1);
		list2.add(employe2);	
		list2.add(employe2);
		list2.add(employe3);
		d.setEmployees(list2);
		employe1.setDepartement(d);
		
	// ecrite et lecture
		
		ObjectFile reg = new ObjectFile();
		reg.saveEmploye(employe1);
		reg.getEmployee();

	}

}
