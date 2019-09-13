package fr.formation.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Departement implements Serializable{
	private int dept_id;
	private String name;
	private List<Employee> employees = new ArrayList();
	
	
	// get et set
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}