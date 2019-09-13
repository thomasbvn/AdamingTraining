package fr.formation.inti.beans;


import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import fr.formation.inti.service.EmployeeService;

@ManagedBean(name = "employeeManager")
@ApplicationScoped
public class EmployeeManager extends EmployeeService{

}
