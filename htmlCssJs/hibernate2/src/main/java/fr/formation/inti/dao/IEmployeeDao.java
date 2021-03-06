package fr.formation.inti.dao;

import java.util.List;

import fr.formation.inti.entities.Employee;

public interface IEmployeeDao extends IGenericDao<Employee, Integer>{

	
	public List<Employee> getAll();
	
	public void persist(Employee e);
	
	public Integer save(Employee e);
	
	public void update(Employee e);
	
	public void delete(Employee e);
	
	public void deleteByID(Integer id);
	
	public Employee findById(Integer id);
	
	public List<Employee> findByName(String name); 
	
	
	public void close();
}
