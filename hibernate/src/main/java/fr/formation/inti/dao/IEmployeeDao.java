package fr.formation.inti.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fr.formation.inti.entities.Employee;
@Repository
public interface IEmployeeDao {

	
	public List<Employee> getAll();
	
	public void persist(Employee e);
	
	public Integer save(Employee e);
	
	public void update(Employee e);
	
	public void delete(Employee e);
	
	public void deleteByID(Integer id);
	
	public Employee findById(Integer id);
	
	public void close();
}
