package fr.formation.inti.core;

import java.util.List;

import fr.formation.inti.entities.Employee;
import fr.information.inti.dao.EmployeeDaoImpl;

public class AppDAO {
	public static void main(String[] args) {
	EmployeeDaoImpl dao=new EmployeeDaoImpl();
	List<Employee> list = dao.getAll();
	for (Employee e: list)
		System.out.println(e);
}
}