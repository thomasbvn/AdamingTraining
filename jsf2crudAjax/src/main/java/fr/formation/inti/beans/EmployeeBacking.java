package fr.formation.inti.beans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import fr.formation.inti.entities.Employee;

@ManagedBean
@ViewScoped
public class EmployeeBacking {
	
	private List<Employee> employees;
	
	private Employee emp = new Employee();
	
	@ManagedProperty(value="#{employeeManager}")
	private EmployeeManager service;
	
    @PostConstruct
    public void init() {
        this.employees = service.findAll();
    }
    public void delete(Employee emp) {
        service.delete(emp);
        employees.remove(emp);
    }
    public void add() {
        service.save(emp);
        this.employees = service.findAll();
        this.emp = new Employee();
    }
    public void update() {
        service.update(employees);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Update successful"));
    }
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public EmployeeManager getService() {
		return service;
	}
	public void setService(EmployeeManager service) {
		this.service = service;
	}
	
	
    
    
}
